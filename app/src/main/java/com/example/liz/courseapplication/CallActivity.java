package com.example.liz.courseapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {

    Button btn_num0,btn_num1,btn_num2,btn_num3,btn_num4,btn_num5,btn_num6,btn_num7,btn_num8,btn_num9,btn_clear,btn_call;
    EditText editCalc;
    Float num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        btn_num0 = (Button) findViewById(R.id.btn_num0);
        btn_num1 = (Button) findViewById(R.id.btn_num1);
        btn_num2 = (Button) findViewById(R.id.btn_num2);
        btn_num3 = (Button) findViewById(R.id.btn_num3);
        btn_num4 = (Button) findViewById(R.id.btn_num4);
        btn_num5 = (Button) findViewById(R.id.btn_num5);
        btn_num6 = (Button) findViewById(R.id.btn_num6);
        btn_num7 = (Button) findViewById(R.id.btn_num7);
        btn_num8 = (Button) findViewById(R.id.btn_num8);
        btn_num9 = (Button) findViewById(R.id.btn_num9);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_call = (Button) findViewById(R.id.call);
//
//        btn_num0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"0");
//            }
//        });
//
//        btn_num1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"1");
//            }
//        });
//
//        btn_num2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"2");
//            }
//        });
//
//        btn_num3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"3");
//            }
//        });
//
//        btn_num4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"4");
//            }
//        });
//
//        btn_num5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"5");
//            }
//        });
//
//        btn_num6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"6");
//            }
//        });
//
//        btn_num7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"7");
//            }
//        });
//
//        btn_num8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"8");
//            }
//        });
//
//        btn_num9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText(editCalc.getText()+"9");
//            }
//        });
//
//        btn_clear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editCalc.setText("");
//            }
//        });


        btn_num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "0");
            }
        });

        btn_num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "1");
            }
        });

        btn_num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "2");
            }
        });

        btn_num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "3");
            }
        });

        btn_num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "4");
            }
        });

        btn_num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "5");
            }
        });

        btn_num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "6");
            }
        });

        btn_num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "7");
            }
        });

        btn_num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "8");
            }
        });

        btn_num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText(editCalc.getText() + "9");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCalc.setText("");
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Float.parseFloat(editCalc.getText() + "");

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + num));
                startActivity(intent);
            }
        });
    }
}
