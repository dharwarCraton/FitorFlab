package com.farah.fitorflab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weights";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_HEALTH = "Health";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightsButton = findViewById(R.id.weightsButton);
        RelativeLayout yogaButton = findViewById(R.id.yogaButton);
        RelativeLayout healthButton = findViewById(R.id.healthButton);


        weightsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        healthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_HEALTH);
            }
        });
    }



    private void loadDetailActivity(String exerciseTitle) {

    }
}
