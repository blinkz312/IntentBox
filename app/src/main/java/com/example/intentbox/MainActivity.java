package com.example.intentbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnOpen = findViewById(R.id.button);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openActivityIntent = new Intent(MainActivity.this, MainActivity2.class);
                openActivityIntent.putExtra("value 1", "Opening from Activity 1");

                startActivity(openActivityIntent);

            }
        });
    }


}