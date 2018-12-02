package com.example.liz.courseapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    EditText email, subject, body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        email = findViewById(R.id.address);
        subject = findViewById(R.id.subject);
        body = findViewById(R.id.messageContent);
    }

     public void email_clicked(View view){

         String eml = email.getText().toString();
         String sub = subject.getText().toString();
         String bdy = body.getText().toString();

         Intent intent = new Intent(Intent.ACTION_SENDTO);
         intent.putExtra(Intent.EXTRA_SUBJECT, sub);
         intent.putExtra(Intent.EXTRA_TEXT, bdy);
         intent.setData(Uri.parse("mailto:" + eml));

         startActivity(intent);
     }

}
