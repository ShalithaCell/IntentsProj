package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnOK;
    EditText txtNumber1, txtNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOK = findViewById(R.id.btnOK);
        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                String message = "Ok button is just pressed";
                Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

                if(txtNumber1.getText().length() == 0 || txtNumber2.getText().length() == 0){
                    message = "all fields are required !";
                    toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                    toast.show();

                    return;
                }

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("number1", txtNumber1.getText().toString());
                intent.putExtra("number2", txtNumber2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
