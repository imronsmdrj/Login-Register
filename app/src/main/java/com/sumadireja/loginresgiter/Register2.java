package com.sumadireja.loginresgiter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sumadireja on 4/8/2018.
 */

public class Register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register2);

        TextView a = (TextView)findViewById(R.id.tvResult1);
        TextView b = (TextView)findViewById(R.id.tvResult2);
        TextView c = (TextView)findViewById(R.id.tvResult3);
        TextView d = (TextView)findViewById(R.id.tvResult4);
        TextView e = (TextView)findViewById(R.id.tvResult5);
        TextView f = (TextView)findViewById(R.id.tvResult6);
        TextView g = (TextView)findViewById(R.id.tvResult7);

        if(getIntent().getExtras() !=null){
            Bundle bundle = getIntent().getExtras();
            a.setText(bundle.getString("satu"));
            b.setText(bundle.getString("dua"));
            c.setText(bundle.getString("tigas"));
            d.setText(bundle.getString("empat"));
            e.setText(bundle.getString("lima"));
            f.setText(bundle.getString("enam"));
            g.setText(bundle.getString("tujuh"));
        }else{
            a.setText(getIntent().getStringExtra("satu"));
            b.setText(getIntent().getStringExtra("dua"));
            c.setText(getIntent().getStringExtra("tiga"));
            d.setText(getIntent().getStringExtra("empat"));
            e.setText(getIntent().getStringExtra("lima"));
            f.setText(getIntent().getStringExtra("enam"));
            g.setText(getIntent().getStringExtra("tujuh"));
        }
    }
}