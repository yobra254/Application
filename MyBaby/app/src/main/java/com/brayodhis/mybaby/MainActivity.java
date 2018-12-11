package com.brayodhis.mybaby;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void did(View v){
    	Intent x=new Intent(this,DidYou.class);
    	startActivity(x);
    }
    public void mother(View v){
        Intent x=new Intent(this,OnTheMother.class);
        startActivity(x);
    }
    public void child(View v){
        Intent x=new Intent(this,Child.class);
        startActivity(x);
    }
    public void todo(View v){
        Intent x=new Intent(this,ToDo.class);
        startActivity(x);
    }
    public void info(View v){
        Intent x=new Intent(this,Info.class);
        startActivity(x);
    }
}
