package com.example.sandoval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    TextView txtResult;
    Button btnAdd, btnSub, btnMult, btnDiv, btnMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refs();
        btnAdd.setOnClickListener(addNumbers);
        btnSub.setOnClickListener(subtractNumbers);
        btnMult.setOnClickListener(multiplyNumbers);
        btnDiv.setOnClickListener(divideNumbers);
        btnMod.setOnClickListener(moduloNumbers);
    }

    View.OnClickListener addNumbers = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double num1, num2, result =0;

            if(txtnum1.getText().toString().isEmpty() && txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Two Fields", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum1.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input First Field", Toast.LENGTH_SHORT).show();
            }
            else if(txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Second Field", Toast.LENGTH_SHORT).show();
            }

            else{
                num1 = Double.parseDouble(txtnum1.getText().toString());
                num2 = Double.parseDouble(txtnum2.getText().toString());
                result = num1 + num2;
            }
            txtResult.setText(Double.toString(result));
        }
    };

    View.OnClickListener subtractNumbers = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double num1, num2, result =0;

            if(txtnum1.getText().toString().isEmpty() && txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Two Fields", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum1.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input First Field", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Second Field", Toast.LENGTH_SHORT).show();
            }

            else{
                num1 = Double.parseDouble(txtnum1.getText().toString());
                num2 = Double.parseDouble(txtnum2.getText().toString());
                result = num1 - num2;
            }
            txtResult.setText(Double.toString(result));
        }
    };

    View.OnClickListener multiplyNumbers = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double num1, num2, result =0;

            if(txtnum1.getText().toString().isEmpty() && txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Two Fields", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum1.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input First Field", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Second Field", Toast.LENGTH_SHORT).show();
            }

            else{
                num1 = Double.parseDouble(txtnum1.getText().toString());
                num2 = Double.parseDouble(txtnum2.getText().toString());
                result = num1 * num2;
            }
            txtResult.setText(Double.toString(result));
        }
    };

    View.OnClickListener divideNumbers = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double num1, num2, result =0;

            if(txtnum1.getText().toString().isEmpty() && txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Two Fields", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum1.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input First Field", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Second Field", Toast.LENGTH_SHORT).show();
            }

            else{
                num1 = Double.parseDouble(txtnum1.getText().toString());
                num2 = Double.parseDouble(txtnum2.getText().toString());
                result = num1 / num2;
            }
            txtResult.setText(Double.toString(result));
        }
    };

    View.OnClickListener moduloNumbers = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double num1, num2, result =0;

            if(txtnum1.getText().toString().isEmpty() && txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Two Fields", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum1.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input First Field", Toast.LENGTH_SHORT).show();
            }

            else if(txtnum2.getText().toString().isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Please Input Second Field", Toast.LENGTH_SHORT).show();
            }

            else{
                num1 = Double.parseDouble(txtnum1.getText().toString());
                num2 = Double.parseDouble(txtnum2.getText().toString());
                result = num1 % num2;
            }
            txtResult.setText(Double.toString(result));
        }
    };

    public void refs(){
        txtnum1 = findViewById(R.id.txt_num1);
        txtnum2 = findViewById(R.id.txt_num2);
        txtResult = findViewById(R.id.txtResult);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_subtract);
        btnMult = findViewById(R.id.btn_multiply);
        btnDiv = findViewById(R.id.btn_divide);
        btnMod = findViewById(R.id.btn_modulo);
    }
}