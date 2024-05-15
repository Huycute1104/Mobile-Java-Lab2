package com.example.lab2_r2sacademy;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.huy);
    }

    public void sum(View v) {
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);

        double value1 = Double.parseDouble(num1.getText().toString());
        double value2 = Double.parseDouble(num2.getText().toString());

        double result = value1 + value2;

        String formattedResult = String.format("%.2f", result);
        txtResult.setText(formattedResult);
    }

    public void sub(View v) {
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);

        double value1 = Double.parseDouble(num1.getText().toString());
        double value2 = Double.parseDouble(num2.getText().toString());

        double result = value1 - value2;

        String formattedResult = String.format("%.2f", result);
        txtResult.setText(formattedResult);
    }

    public void mul(View v) {
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);

        double value1 = Double.parseDouble(num1.getText().toString());
        double value2 = Double.parseDouble(num2.getText().toString());

        double result = value1 * value2;

        String formattedResult = String.format("%.2f", result);
        txtResult.setText(formattedResult);
    }

    public void div(View v) {
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);

        double value1 = Double.parseDouble(num1.getText().toString());
        double value2 = Double.parseDouble(num2.getText().toString());

        if (value2 == 0) {
            Toast.makeText(MainActivity.this, "Cannot be divided by 0", Toast.LENGTH_SHORT).show();
        } else {
            double result = value1 / value2;
            String formattedResult = String.format("%.2f", result);
            txtResult.setText(formattedResult);
        }
    }
}