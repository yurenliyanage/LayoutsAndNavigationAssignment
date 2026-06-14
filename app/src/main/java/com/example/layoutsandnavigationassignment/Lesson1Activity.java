package com.example.layoutsandnavigationassignment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        EditText editText = findViewById(R.id.editText1);
        Button button = findViewById(R.id.btnShowToast);

        button.setOnClickListener(v -> {
            String userInput = editText.getText().toString().trim();
            if (userInput.isEmpty()) {
                Toast.makeText(this, "Please enter some text!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Entered: " + userInput, Toast.LENGTH_LONG).show();
            }
        });
    }
}