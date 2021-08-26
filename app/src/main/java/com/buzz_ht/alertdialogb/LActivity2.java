package com.buzz_ht.alertdialogb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l);
    }

    public void gotomain(View view) {

        Intent i = new Intent(LActivity2.this,MainActivity.class);
        startActivity(i);


    }
}