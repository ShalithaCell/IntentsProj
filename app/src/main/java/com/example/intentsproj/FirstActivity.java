package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOK = findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                String message = "Ok button is just pressed";
                Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                FirstActivity.this.startActivity(intent);
            }
        });
    }
}
