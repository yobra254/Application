package com.brayodhis.mybaby;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

public class PregnancyGuide extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnancy_guide);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent x = new Intent(PregnancyGuide.this, MainActivity.class);
                startActivity(x);
                finish();//this kills the activity for good so that when you go back you cant see it
            }
        }, 5000);
    }

}
