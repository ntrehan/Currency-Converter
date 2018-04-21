package com.example.hplaptop.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void dollarToRupees(View view) {
        EditText dollarEditText = (EditText) findViewById(R.id.dollarEditText);
        Log.i("Dollars",dollarEditText.getText().toString());
        String dollars = dollarEditText.getText().toString();
        double d = Double.parseDouble(dollars);
        double rupees = d * 65;
        Toast.makeText(this,rupees + " Rupees", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
