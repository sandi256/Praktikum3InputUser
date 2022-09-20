package com.example.praktikum3inputuser;


import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    TextView output;
    Double v1,v2,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.inputpertama);
        input2 = (EditText) findViewById(R.id.inputkedua);
        output = (TextView) findViewById(R.id.hasil);
    }

    public void konver(){

        v1 = Double.parseDouble(input1.getText().toString());
        v2 = Double.parseDouble(input2.getText().toString());
    }

    public void prosestambah(View view) {
        konver();
        hasil = v1+v2;
        output.setText(Double.toString(hasil));
    }

    public void proseskurang(View view) {
        konver();
        hasil = v1-v2;
        output.setText(Double.toString(hasil));
    }

    public void proseskali(View view) {
        konver();
        hasil = v1*v2;
        output.setText(Double.toString(hasil));
    }
    public void prosesbagi(View view) {
        konver();
        hasil = v1/v2;
        output.setText(Double.toString(hasil));
    }
}