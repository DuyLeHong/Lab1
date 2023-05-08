package com.duyle.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    boolean flagBg = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = findViewById(R.id.main_layout);

        Button btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flagBg) {
                    mainLayout.setBackgroundColor(Color.CYAN);
                    flagBg = false;
                } else {
                    mainLayout.setBackgroundColor(Color.MAGENTA);
                    flagBg = true;
                }

            }
        });
    }
}