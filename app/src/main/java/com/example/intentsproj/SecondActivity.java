package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText txtNumber1, txtNumber2;
    TextView txtResult;

    Button btnSum, btnSub, btnMul, btnDiv;

    private String message;
    private Toast toast;

    private int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        txtResult = findViewById(R.id.txtResult);

        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        Intent intent = getIntent();

        try{
            txtNumber1.setText(intent.getStringExtra("number1"));
            txtNumber2.setText(intent.getStringExtra("number2"));


        }catch (Exception e){
            toast = Toast.makeText(getApplicationContext(), "Somthing went wrong. Please enter numbers again.", Toast.LENGTH_SHORT);
            toast.show();

            Intent intent_nav = new Intent(SecondActivity.this, FirstActivity.class);
            SecondActivity.this.startActivity(intent_nav);
        }



        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtNumber1.getText().length() == 0 || txtNumber2.getText().length() == 0){
                    message = "all fields are required !";
                    toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                    toast.show();
                    return;
                }

                result = 0;
                result = Integer.parseInt(String.valueOf(txtNumber1.getText())) + Integer.parseInt(String.valueOf(txtNumber2.getText()));

                txtResult.setText(Integer.toString(result));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtNumber1.getText().length() == 0 || txtNumber2.getText().length() == 0){
                    message = "all fields are required !";
                    toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                    toast.show();
                    return;
                }

                result = 0;
                result = Integer.parseInt(String.valueOf(txtNumber1.getText())) - Integer.parseInt(String.valueOf(txtNumber2.getText()));

                txtResult.setText(Integer.toString(result));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtNumber1.getText().length() == 0 || txtNumber2.getText().length() == 0){
                    message = "all fields are required !";
                    toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                    toast.show();
                    return;
                }

                result = 0;
                result = Integer.parseInt(String.valueOf(txtNumber1.getText())) * Integer.parseInt(String.valueOf(txtNumber2.getText()));

                txtResult.setText(Integer.toString(result));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtNumber1.getText().length() == 0 || txtNumber2.getText().length() == 0){
                    message = "all fields are required !";
                    toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                    toast.show();
                    return;
                }

                result = 0;
                result = Integer.parseInt(String.valueOf(txtNumber1.getText())) / Integer.parseInt(String.valueOf(txtNumber2.getText()));

                txtResult.setText(Integer.toString(result));
            }
        });
    }
}
