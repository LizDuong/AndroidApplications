package com.example.liz.courseapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    //    filter intent to receive data
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT))
            textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        else
            textView.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Alarm(View v) {
        Intent intent = new Intent(MainActivity.this,AlarmActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Camera(View v) {
        Intent intent = new Intent(MainActivity.this,CameraActivity.class);
        MainActivity.this.startActivity(intent);
    }
    public void Media(View v) {
        Intent intent = new Intent(MainActivity.this,MediaActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Call(View v) {
        Intent intent = new Intent(MainActivity.this,CallActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Browse(View v) {
        Intent intent = new Intent(MainActivity.this,BrowseActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void Map(View v) {
        Intent intent = new Intent(MainActivity.this,MapActivity.class);
        MainActivity.this.startActivity(intent);
    }


    public void Email(View v) {
        Intent intent = new Intent(MainActivity.this,EmailActivity.class);
        MainActivity.this.startActivity(intent);
    }
}
