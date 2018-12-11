package com.brayodhis.mybaby;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void fanyaa(View v){
        Intent x=new Intent(this,ThingsToDo.class);
        startActivity(x);
    }
    public void usiii(View v){
        Intent x=new Intent(this,ThingsNotTo.class);
        startActivity(x);
    }
    public void food(View v){
        Intent x=new Intent(this,Nutrition.class);
        startActivity(x);
    }
    public void uchungu(View v){
        Intent x=new Intent(this,Labour.class);
        startActivity(x);
    }
    public void kuwa(View v){
        Intent x=new Intent(this,Have.class);
        startActivity(x);
    }
}
