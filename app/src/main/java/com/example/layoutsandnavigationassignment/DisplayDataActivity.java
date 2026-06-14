package com.example.layoutsandnavigationassignment;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        TextView tvResult = findViewById(R.id.tvResult);

        String name = getIntent().getStringExtra("USER_NAME");
        String email = getIntent().getStringExtra("USER_EMAIL");
        String mobile = getIntent().getStringExtra("USER_MOBILE");

        String displayText = "Submitted Info:\n\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Mobile: " + mobile;

        tvResult.setText(displayText);
    }
}