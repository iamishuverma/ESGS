package com.example.careerrecommendation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class GeneralQuestionnaire extends AppCompatActivity implements View.OnClickListener{

    Student student = null;
    int[] skillAnswers = null;

    String[] generalQuestions = new String[]{
                                    "Rate the trust level between you and your parents?",
                                    "Rate the trust level between you and your friends?",
                                    "Rate the trust level between you and your mentor?",
                                    "Rate the trust level between you and your senior?",
                                };

    Set<String> possibleAnswers = new HashSet<>();
    int NUMBER_OF_QUESTIONS = generalQuestions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_questionnaire);

        Intent intent = getIntent();

        student = (Student) intent.getSerializableExtra("student");
        skillAnswers = intent.getIntArrayExtra("skillAnswers");

        for(int possibleAnswer = 0 ; possibleAnswer <= 5 ; ++possibleAnswer)
            possibleAnswers.add("" + possibleAnswer);

        LinearLayout linearLayout = findViewById(R.id.generalQuestions);
        int radioButtonIds = NUMBER_OF_QUESTIONS;

        for(int questionIndex = 0 ; questionIndex < NUMBER_OF_QUESTIONS ; ++questionIndex)
        {
            TextView textView = new TextView(this);

            String currentQuestionText = (questionIndex + 1) + ". " + generalQuestions[questionIndex];
            textView.setText(currentQuestionText);

            textView.setTextColor(getResources().getColor(R.color.purple_500));
            textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);

            RadioGroup radioGroup = new RadioGroup(this);
            radioGroup.setId(questionIndex);

            for(int possibleAnswerIndex = 0 ; possibleAnswerIndex <= 5 ; ++possibleAnswerIndex)
            {
                RadioButton radioButton = new RadioButton(this);

                radioButton.setId(radioButtonIds);
                radioButtonIds = radioButtonIds + 1;

                radioButton.setText(String.valueOf(possibleAnswerIndex));
                radioButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
                radioButton.setTextColor(getResources().getColor(R.color.purple_500));

                ColorStateList colorStateList = new ColorStateList(
                        new int[][]{
                                new int[]{android.R.attr.state_enabled}, //enabled
                                new int[]{android.R.attr.state_enabled} //disabled
                        },
                        new int[]{R.color.purple_500, R.color.purple_500}
                );
                radioButton.setButtonTintList(colorStateList);

                radioGroup.addView(radioButton);
            }

            linearLayout.addView(textView);
            linearLayout.addView(radioGroup);
        }

        Button button = new Button(this);
        button.setText(R.string.submit);
        button.setTextColor(getResources().getColor(R.color.white));
        button.setBackgroundColor(getResources().getColor(R.color.purple_500));
        button.setOnClickListener(this);

        linearLayout.addView(button);
    }

    @Override
    public void onClick(View view) {

        int[] generalAnswers = new int[NUMBER_OF_QUESTIONS];

        for (int questionIndex = 0; questionIndex < NUMBER_OF_QUESTIONS; ++questionIndex)
        {
            RadioGroup radioGroup = findViewById(questionIndex);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            if(checkedRadioButtonId == -1)
            {
                Toast.makeText(getApplicationContext(), "Invalid response for Question #" + (questionIndex + 1),Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton radioButton = findViewById(checkedRadioButtonId);
            String currentGeneralAnswer = radioButton.getText().toString();

            generalAnswers[questionIndex] = Integer.parseInt(currentGeneralAnswer);
        }

        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("student", student);
        intent.putExtra("skillAnswers", skillAnswers);
        intent.putExtra("generalAnswers", generalAnswers);

        this.startActivity(intent);
    }
}