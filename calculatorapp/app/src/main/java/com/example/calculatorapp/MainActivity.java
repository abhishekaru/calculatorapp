package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    EditText edFirstNumber,edSecondNumber;
    Button btPlus,btMinus,btMultiply,btDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
        edFirstNumber = findViewById(R.id.edFirstNumber);
        edSecondNumber = findViewById(R.id.edSecondNumber);
        btDivide = findViewById(R.id.btDivide);
        btMinus = findViewById(R.id.btMinus);
        btMultiply = findViewById(R.id.btMiltiply);
        btPlus = findViewById(R.id.btPlus);

        btPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int result, first,second;
                first = Integer.parseInt(edFirstNumber.getText().toString());
                second = Integer.parseInt(edSecondNumber.getText().toString());
                result = first + second;
                tvResult.setText("Ans is :"+result);
            }
        });
        btMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int result, first,second;
                first = Integer.parseInt(edFirstNumber.getText().toString());
                second = Integer.parseInt(edSecondNumber.getText().toString());
                result = first - second;
                tvResult.setText("Ans is :"+result);
            }
        });
        btDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int result, first,second;
                first = Integer.parseInt(edFirstNumber.getText().toString());
                second = Integer.parseInt(edSecondNumber.getText().toString());
                result = first / second;
                tvResult.setText("Ans is :"+result);
            }
        });
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int result, first,second;
                first = Integer.parseInt(edFirstNumber.getText().toString());
                second = Integer.parseInt(edSecondNumber.getText().toString());
                result = first * second;
                tvResult.setText("Ans is :"+result);
            }
        });


    }
}