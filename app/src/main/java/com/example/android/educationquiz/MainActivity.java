package com.example.android.educationquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgQuestionOne, rgQuestionTwo, rgQuestionThree, rgQuestionFour, rgQuestionFive;
    RadioButton radioButtonOne, radioButtonTwo, radioButtonThree, radioButtonFour, radioButtonFive;
    Button submitBtn;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void submit(View view) {
            rgQuestionOne = (RadioGroup) findViewById(R.id.question1_Option);
            rgQuestionTwo = (RadioGroup) findViewById(R.id.question2_Option);
            rgQuestionThree = (RadioGroup) findViewById(R.id.question3_Option);
            rgQuestionFour = (RadioGroup) findViewById(R.id.question4_Option);
            rgQuestionFive = (RadioGroup) findViewById(R.id.question5_Option);
            submitBtn = (Button) findViewById(R.id.Btn_Send);
            EditText txtInput = (EditText) findViewById(R.id.text_input);
            String textInput = txtInput.getText().toString();

                int selectedid_Q1 = rgQuestionOne.getCheckedRadioButtonId();
                int selectedid_Q2 = rgQuestionTwo.getCheckedRadioButtonId();
                int selectedid_Q3 = rgQuestionThree.getCheckedRadioButtonId();
                int selectedid_Q4 = rgQuestionFour.getCheckedRadioButtonId();
                int selectedid_Q5 = rgQuestionFive.getCheckedRadioButtonId();

                radioButtonOne =  (RadioButton) findViewById(selectedid_Q1);
                radioButtonTwo =  (RadioButton) findViewById(selectedid_Q2);
                radioButtonThree =  (RadioButton) findViewById(selectedid_Q3);
                radioButtonFour =  (RadioButton) findViewById(selectedid_Q4);
                radioButtonFive =  (RadioButton) findViewById(selectedid_Q5);

                String answerOne = radioButtonOne.getText().toString();
                if (answerOne == "Piglets"){
                    score += 1;
                }
                String answerTwo = radioButtonOne.getText().toString();
                if(answerTwo == "Lamb") {
                    score += 1;
                }
                String answerThree = radioButtonOne.getText().toString();
                if(answerThree == "Dogs"){
                    score += 1;
                }
                String answerFour = radioButtonOne.getText().toString();
                if(answerFour == "Cubs"){
                    score += 1;
                }
                String answerFive = radioButtonOne.getText().toString();
                if(answerFive == "Calf"){
                    score += 1;
                }

                Intent resultIntent = new Intent(this, ResultActivity.class);
                resultIntent.putExtra("res", score);
                resultIntent.putExtra("username", textInput);


            }
        }


