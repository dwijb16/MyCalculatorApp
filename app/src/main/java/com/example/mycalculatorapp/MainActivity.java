package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.SecondNum);
        TextView numberSumTV = findViewById(R.id.Result);
        if(number2ET.getText().toString().equals("")  || number1ET.getText().toString().equals("")){
            // from developer.android.com's toast popup thing
            Context context = getApplicationContext();
            CharSequence text = "Please enter both input!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {


            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = num1 + num2;
            String formattedString = String.format("%.02f", sum);


            numberSumTV.setText("Final Answer: " + formattedString);
        }
    }
    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.SecondNum);
        TextView numberSumTV = findViewById(R.id.Result);
        if(number2ET.getText().toString().equals("")  || number1ET.getText().toString().equals("")){
            // from developer.android.com's toast popup thing
            Context context = getApplicationContext();
            CharSequence text = "Please enter both input!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {

            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));

            double difference = num1 - num2;
            String formattedString = String.format("%.02f", difference);

            numberSumTV.setText("Final Answer: " + formattedString);
        }
    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.SecondNum);
        TextView numberSumTV = findViewById(R.id.Result);
        if(number2ET.getText().toString().equals("")  || number1ET.getText().toString().equals("")){
            // from developer.android.com's toast popup thing
            Context context = getApplicationContext();
            CharSequence text = "Please enter both input!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {

            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double product = num1 * num2;
            String formattedString = String.format("%.02f", product);


            numberSumTV.setText("Final Answer: " + formattedString);
        }
    }
    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.SecondNum);
        TextView numberSumTV = findViewById(R.id.Result);
        if(number2ET.getText().toString().equals("")  || number1ET.getText().toString().equals("")){
            // from developer.android.com's toast popup thing
            Context context = getApplicationContext();
            CharSequence text = "Please enter both input!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            if (num2 == 0.0) {
                Context context = getApplicationContext();
                CharSequence text = "You cannot divide by zero!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else{
                double quotient = num1 / num2;
            String formattedString = String.format("%.02f", quotient);


            numberSumTV.setText("Final Answer: " + formattedString);
        }
        }
    }
    public void findPow(View view) {
        EditText number1ET = findViewById(R.id.firstNum);
        EditText number2ET = findViewById(R.id.SecondNum);
        TextView numberSumTV = findViewById(R.id.Result);
        if(number2ET.getText().toString().equals("")  || number1ET.getText().toString().equals("")){
            // from developer.android.com's toast popup thing
            Context context = getApplicationContext();
            CharSequence text = "Please enter both input!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else {


            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double exp = Math.pow(num1,num2);
            String formattedString = String.format("%.02f", exp);


            numberSumTV.setText("Final Answer: " + formattedString);
        }
    }
}