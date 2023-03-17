package com.example.viikko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView resultOutput;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.inputNumber1);
        number2  = findViewById(R.id.inputNumber2);
        resultOutput = findViewById(R.id.resultOutput);
    }

    public void sumNumbers (View view){
        Integer n1 = Integer.parseInt(number1.getText().toString());
        Integer n2 = Integer.parseInt(number2.getText().toString());
        Integer result;
        result = n1 + n2;
        resultOutput.setText(n1 + " + " + n2 +" = " + result.toString());
    }

    public void minusNumbers (View view){
        Integer n1 = Integer.parseInt(number1.getText().toString());
        Integer n2 = Integer.parseInt(number2.getText().toString());
        Integer result;
        result = n1 - n2;
        resultOutput.setText(n1 + " - " + n2 +" = " + result.toString());
    }

    public void multipleNumbers (View view){
        Integer n1 = Integer.parseInt(number1.getText().toString());
        Integer n2 = Integer.parseInt(number2.getText().toString());
        Integer result;
        result = n1 * n2;
        resultOutput.setText(n1 + " x " + n2 +" = " + result.toString());
    }

    public void divideNumbers (View view){
        Integer n1 = Integer.parseInt(number1.getText().toString());
        Integer n2 = Integer.parseInt(number2.getText().toString());
        Float result;
        if (n2==0){
            resultOutput.setText("You can't divide with zero, you dummy!");
        } else {
            result = Float.valueOf(n1) / n2;

            resultOutput.setText(n1 + " / " + n2 +" = " + String.format("%.2f", result));
        }
    }
}