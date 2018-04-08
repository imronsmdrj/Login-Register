package com.sumadireja.loginresgiter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * Created by sumadireja on 4/7/2018.
 */

public class Registrasi extends AppCompatActivity {

    Intent i;
    EditText namalengkap, alamat, notelepon, email, password;
    RadioGroup RG;
    CheckBox cbGame, cbNgoding, cbBerenang, cbFutsal;
    Button btnRegistrasi;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        namalengkap = (EditText) findViewById(R.id.etNamaLengkap);
        alamat = (EditText) findViewById(R.id.etAlamat);
        notelepon = (EditText) findViewById(R.id.etTelepon);
        email = (EditText) findViewById(R.id.etEmail);
        password = (EditText) findViewById(R.id.etPassword);
        RG = (RadioGroup) findViewById(R.id.rgJenis);
        cbGame = (CheckBox) findViewById(R.id.cbHobby);
        cbNgoding = (CheckBox) findViewById(R.id.cbHobby2);
        cbBerenang = (CheckBox) findViewById(R.id.cbHobby3);
        cbFutsal = (CheckBox) findViewById(R.id.cbHobby4);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        btnRegistrasi = (Button) findViewById(R.id.btn_registrer2);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = String.valueOf(namalengkap.getText().toString());
                String almt = String.valueOf(alamat.getText().toString());
                String tlp = String.valueOf(notelepon.getText().toString());
                String mail = String.valueOf(email.getText().toString());
                String paswd = String.valueOf(password.getText().toString());
                String cbx = "";
                if (cbGame.isChecked()) {
                    cbx += "Main Game\n";
                }
                if (cbNgoding.isChecked()) {
                    cbx += "Ngoding\n";
                }
                if (cbBerenang.isChecked()) {
                    cbx += "Berenang\n";
                }
                if (cbFutsal.isChecked()) {
                    cbx += "Futsal\n";
                }

                int id = RG.getCheckedRadioButtonId();
                RadioButton RB = (RadioButton) findViewById(id);
                String rbJK = String.valueOf(RB.getText().toString());

                tv1.setText(RB.toString());
                tv2.setText(cbx.toString());

                Intent i = new Intent(Registrasi.this, Register2.class);
                i.putExtra("satu", namalengkap.getText().toString());
                i.putExtra("dua", alamat.getText().toString());
                i.putExtra("tiga", notelepon.getText().toString());
                i.putExtra("empat", email.getText().toString());
                i.putExtra("lima", password.getText().toString());
                i.putExtra("enam", tv1.getText().toString());
                i.putExtra("tujuh", tv2.getText().toString());
                startActivity(i);
            }
        });
    }
}