package com.slab.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNama, etPass;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        etPass = (EditText) findViewById(R.id.etPass);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validasi(etNama.getText().toString(), etPass.getText().toString());
            }
        });
    }
    private void validasi (String nama, String password){
        if (nama.equals("admin") && password.equals("admin")){
            Toast.makeText(getApplicationContext(),"Login Berhasil",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),"Login Gagal",Toast.LENGTH_SHORT).show();
        }
    }

}
