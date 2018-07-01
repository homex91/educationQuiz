package com.example.android.educationquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();

        String score = bundle.getString("score");
        String username = bundle.getString("username");

        String message;
        int scores = Integer.parseInt(score);

        int percentScore = (scores / 5) * 100;

        TextView textView = (TextView) findViewById(R.id.textView1);

        if(percentScore >= 50) {
            message = "Congratulation, your percentage score is: \n" + percentScore;
            textView.setText(message);
        } else {
            message = "You got below average. Your percentage score is \n" + percentScore;
        }
    }


}
