package com.example.grand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View.OnClickListener;

@SuppressLint("HandlerLeak")
public class demo extends AppCompatActivity {
    private String year;
    private TextView tv;
    private Button b1;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        b1 = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.result1);
        et = (EditText) findViewById(R.id.input1);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){
                year = et.getText().toString();
                System.out.println(year);
                getControlLine();
            }

        });
    }
    public  void getControlLine(){
        boolean flag = true;
        String[][] data = {{"2013","567"},{"2014","1000"}};
        for(int i = 0;i<data.length;i++){
            if(year.equals(data[i][0])){
                flag = false;
                String result = data[i][1];
                tv.setText(result);
            }

        }
        if(flag){
            tv.setText("暂无数据");
        }
    }
}