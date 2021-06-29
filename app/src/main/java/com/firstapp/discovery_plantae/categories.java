package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    public void btn2(View view) {
        Intent intent1 = new Intent(this,vegestable.class);
        startActivity(intent1);
    }

    public void btn3(View view) {
        Intent intent2 = new Intent(this,ornamental.class);
        startActivity(intent2);
    }

    public void btn4(View view) {
        Intent intent3 = new Intent(this,common.class);
        startActivity(intent3);
    }

    public void btn5(View view) {
        Intent intent4 = new Intent(this,flowering.class);
        startActivity(intent4);
    }

    public void btn6(View view) {
        Intent intent1 = new Intent(this,medicinal.class);
        startActivity(intent1);
    }
}