package com.example.liz.courseapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {

    TimePicker clock;
    CheckBox sunday, monday, tuesday, wednesday, thursday, friday, saturday;
    Switch vibrate;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        clock = findViewById(R.id.clock);
        sunday = findViewById(R.id.sunday);
        monday = findViewById(R.id.monday);
        tuesday = findViewById(R.id.tuesday);
        wednesday = findViewById(R.id.wednesday);
        thursday = findViewById(R.id.thursday);
        friday = findViewById(R.id.friday);
        saturday = findViewById(R.id.saturday);
        message = findViewById(R.id.note);
        vibrate = findViewById(R.id.vibrate);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void alarm_clicked(View v) {
        int hr = clock.getHour();
        int min = clock.getMinute();

        ArrayList<Integer> repeatdays = new ArrayList<>();

        if (sunday.isChecked())
            repeatdays.add(Calendar.SUNDAY);
        if (monday.isChecked())
            repeatdays.add(Calendar.MONDAY);
        if (tuesday.isChecked())
            repeatdays.add(Calendar.TUESDAY);
        if (wednesday.isChecked())
            repeatdays.add(Calendar.WEDNESDAY);
        if (thursday.isChecked())
            repeatdays.add(Calendar.THURSDAY);
        if (friday.isChecked())
            repeatdays.add(Calendar.FRIDAY);
        if (saturday.isChecked())
            repeatdays.add(Calendar.SATURDAY);

        boolean vib = vibrate.isChecked();

        String text = message.getText().toString();
        try {
            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);

            intent.putExtra(AlarmClock.EXTRA_HOUR, hr);
            intent.putExtra(AlarmClock.EXTRA_MINUTES, min);
            intent.putExtra(AlarmClock.EXTRA_DAYS, repeatdays);
            intent.putExtra(AlarmClock.EXTRA_VIBRATE, vib);
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, text);

            startActivity(intent);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}