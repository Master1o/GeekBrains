package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputOne = findViewById(R.id.input_one);
        EditText inputTwo = findViewById(R.id.input_two);

        Button compare = findViewById(R.id.btn_compare);
        TextView result = findViewById(R.id.result);

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Integer one = Integer.valueOf(inputOne.getText().toString());
            Integer two = Integer.valueOf(inputTwo.getText().toString());

            if (one == two) {
                result.setText("Equal");
            } else {
                result.setText("Not Equall");
            }

            }
        });
    }
}