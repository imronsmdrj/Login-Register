package com.sumadireja.loginresgiter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sumadireja on 4/8/2018.
 */

public class Login2 extends AppCompatActivity {


    final EditText username = findViewById(R.id.etLogin);
    final EditText password = findViewById(R.id.etPassword);

    Button btn_login2 = findViewById(R.id.btn_login2);

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                String paswd = password.getText().toString();
                if(name.equals("imronsmdrj") && paswd.equals("asdw123")) {
                    Intent i = new Intent(Login2.this, Login3.class);
                    startActivity(i);
                }else{
                    Toast.makeText(Login2.this, "Maaf gabisa login, ini belum pake database soalnya hehe", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
