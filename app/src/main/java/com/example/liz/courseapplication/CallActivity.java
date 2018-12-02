package com.example.liz.courseapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {

    DialActivity dial;
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        txtDetail = findViewById(R.id.txtDetail);

        txtDetail.setText("");
        dial = new DialActivity();
    }

    public void btn_clicked(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_num0:
                dial.numberClicked("0") ; break;
            case R.id.btn_num1:
                dial.numberClicked("1") ; break;
            case R.id.btn_num2:
                dial.numberClicked("2") ; break;
            case R.id.btn_num3:
                dial.numberClicked("3") ; break;
            case R.id.btn_num4:
                dial.numberClicked("4") ; break;
            case R.id.btn_num5:
                dial.numberClicked("5") ; break;
            case R.id.btn_num6:
                dial.numberClicked("6") ; break;
            case R.id.btn_num7:
                dial.numberClicked("7") ; break;
            case R.id.btn_num8:
                dial.numberClicked("8") ; break;
            case R.id.btn_num9:
                dial.numberClicked("9") ; break;
            case R.id.btn_clear:
                dial.btn_clear(); break;
            }
        updateInterface();
    }

    private void updateInterface() {
        txtDetail.setText(dial.getPreview());
    }

    public void call_clicked(View view){
        String num = txtDetail.getText().toString();

        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + num));
        startActivity(intent);
    }
}
