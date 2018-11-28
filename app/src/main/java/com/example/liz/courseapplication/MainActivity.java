package com.example.liz.courseapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Home(View v) {
        setContentView(R.layout.activity_main);
    }

    public void Alarm(View v) {
        setContentView(R.layout.activity_alarm);
    }

    public void Camera(View v) {
        setContentView(R.layout.activity_camera);
    }

    public void Call(View v) {
        setContentView(R.layout.activity_call);
    }

    public void Phone(View v) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
        startActivity(intent);
    }

    public void Browse(View v) {
        setContentView(R.layout.activity_browse);
    }

    public void Internet(View v) {
        final EditText editText = findViewById(R.id.urlText);

        String url = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void Map(View v) {
        setContentView(R.layout.activity_map);
    }

    public void Directions(View v) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=restaurants");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }



}
