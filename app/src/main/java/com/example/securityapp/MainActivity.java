package com.example.securityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.bt1);
        Button btn2 = findViewById(R.id.bt2);

        TextView tview1 = (TextView)findViewById(R.id.tv1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num2 = Integer.valueOf(tview1.getText().toString());

                tview1.setText("" + (num2+1));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num2 = Integer.valueOf(tview1.getText().toString());

                tview1.setText("" + (num2-1));
                if((num2-1)<=0){
                    tview1.setText(""+0);
                }
                else{
                    tview1.setText("" + (num2-1));
                }
            }
        });
    }
}
