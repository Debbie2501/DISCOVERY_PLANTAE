package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class view extends AppCompatActivity {


    TextView in1, in2, in3, in4, in5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        in1=findViewById(R.id.info1);
        in2=findViewById(R.id.info2);
        in3=findViewById(R.id.info3);
        in4=findViewById(R.id.info4);
        in5=findViewById(R.id.info5);


        Intent intent12 = getIntent();
        String name = intent12.getStringExtra("NAME");
        in1.setText(name);
        String sname = intent12.getStringExtra("SNAME");
        in2.setText(sname);
        String origin = intent12.getStringExtra("ORIGIN");
        in3.setText(origin);
        String cdisease = intent12.getStringExtra("CDISEASE");
        in4.setText(cdisease);
        String dremedies = intent12.getStringExtra("DREMEDIES");
        in5.setText(dremedies);

    }
}