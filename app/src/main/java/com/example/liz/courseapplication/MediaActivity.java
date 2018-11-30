package com.example.liz.courseapplication;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MediaActivity extends AppCompatActivity {

    RadioButton audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        audio = findViewById(R.id.audio);
    }

    public void media_clicked(View view) {
        Intent intent;
        if(audio.isChecked()){
            intent = new Intent(Intent.ACTION_PICK,MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        }
        else{
            intent = new Intent(Intent.ACTION_PICK,MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode == Activity.RESULT_OK){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(data.getData());
            startActivity(intent);
        }
    }
}
