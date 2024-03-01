package com.example.contaclique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i=0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tvcontador);
    }


    protected void onStart(){
        super.onStart();
        tv.setText("0");

    }
    public void clique(View v){
        i++;
        TextView tv= (TextView) v;
        tv.setText(Integer.toString(i));
    }



}