package com.brayodhis.mybaby;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class Child extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
    }
    public void moja(View v){
        Intent x=new Intent(this,FirstThreeMonths.class);
        startActivity(x);
    }
    public void mbili(View v){
        Intent x=new Intent(this,SecondThreeMonths.class);
        startActivity(x);
    }
    public void tatu(View v){
        Intent x=new Intent(this,LastThreeMonths.class);
        startActivity(x);
    }
}
