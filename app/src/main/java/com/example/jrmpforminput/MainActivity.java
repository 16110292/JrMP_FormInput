package com.example.jrmpforminput;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText in;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in= findViewById(R.id.et);
        out= findViewById(R.id.tv);
    }
 @SuppressLint("SetText")
    public void TampilNama(View v){
        out.setText("Nama : "+in.getText());
 }
}