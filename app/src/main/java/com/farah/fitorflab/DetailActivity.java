package com.farah.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = findViewById(R.id.exerciseImage);
        LinearLayout mainBackground = findViewById(R.id.mainBackground);

        // grab the title of the button that was clicked in main activity and stored as data with intent to
        // load new activity
        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        // set the title text view of this activity to be the appropriate button clicked from last activity
        exerciseText.setText(exerciseTitle);

        // change background and images based on what the exercise title is that got set to exercise text
        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            mainBackground.setBackgroundColor(getColor(R.color.colorWeight));
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            mainBackground.setBackgroundColor(getColor(R.color.colorYoga));
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
        } else {
            mainBackground.setBackgroundColor(getColor(R.color.colorHealth));
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
        }
    }
}
