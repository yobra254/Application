package com.brayodhis.mybaby;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class OnTheMother extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_the_mother);
    }
    public void first(View v){
        Intent x=new Intent(this,FirstTrimester.class);
        startActivity(x);
    }
    public void second(View v){
        Intent x=new Intent(this,SecondTrimester.class);
        startActivity(x);
    }
    public void third(View v){
        Intent x=new Intent(this,ThirdTremester.class);
        startActivity(x);
    }
}
