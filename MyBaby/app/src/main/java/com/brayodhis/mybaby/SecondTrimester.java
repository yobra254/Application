package com.brayodhis.mybaby;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class SecondTrimester extends Activity {
TextView second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_trimester);
        second=(TextView)findViewById(R.id.tvSec);
        Typeface tf=Typeface.createFromAsset(getAssets(),"fonte.ttf");
        second.setTypeface(tf);
        try {
            InputStream is = getAssets().open("second.txt");
            int size = is.available();

            // Read the entire asset into a local byte buffer.
            byte[]buffer = new byte[size];
            is.read(buffer);
            is.close();
            // Convert the buffer into a string.
            String text=new String(buffer);

            // Finally stick the string into the text view.

            second.setText(text);
            second.setText(Html.fromHtml(text));
            second.setMovementMethod(new ScrollingMovementMethod());
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "sorry the application has run into an error", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        //write on option  then ctrl space and it is generated
        //this is to share
        if (item.getTitle().equals("Share"))
        {
            String lyrics=second.getText().toString();
            Intent share=new Intent(Intent.ACTION_SEND);
            //this is to specify the type of data to share
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT,lyrics);
            startActivity(share);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.did_you, menu);
        return true;
    }


}
