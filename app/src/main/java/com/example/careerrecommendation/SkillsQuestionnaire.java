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

import java.util.Set;
import java.util.HashSet;

class SkillQuestion
{
    String questionText;
    int questionType;

    SkillQuestion(String questionText, int questionType)
    {
        this.questionText = questionText;
        this.questionType = questionType;
    }
}

public class SkillsQuestionnaire extends AppCompatActivity implements View.OnClickListener {

    Student student = null;

    SkillQuestion[] skillQuestions = {new SkillQuestion("How interested are you in dealing with new software applications?", Branches.CSE) ,
            new SkillQuestion("How much knowledge do you have about programming?", Branches.CSE),
            new SkillQuestion("How much you enjoy working on computers?", Branches.IT),
            new SkillQuestion("How passionate are you about information and communication?", Branches.IT),
            new SkillQuestion("How interested are you in logic gate design, optics, and signal processing?", Branches.ECE),
            new SkillQuestion("How much knowledge do you have about IoT?", Branches.ECE),
            new SkillQuestion("How much curious are you about how electricity reaches from its source to the homes?", Branches.ELECTRICAL),
            new SkillQuestion("How much interested are you in designing electrical devices?", Branches.ELECTRICAL),
            new SkillQuestion("How much interested are you in working with automobile industry?", Branches.MECHANICAL),
            new SkillQuestion("How much you like subjects like heat transfer, or thermodynamics?", Branches.MECHANICAL),
            new SkillQuestion("How much you like building things, drawing, and models?", Branches.CIVIL),
            new SkillQuestion("How interested are you in managing a diverse team of professionals?", Branches.CIVIL),
            new SkillQuestion("How interested are you in chemical manufacturing processes?", Branches.CHEMICAL),
            new SkillQuestion("How interested are you about implication of engineering sciences in daily life?", Branches.CHEMICAL),
            new SkillQuestion("How interesting do you find processing of metals?", Branches.METALLURGY),
            new SkillQuestion("How enthusiastic are you about renewable energy?", Branches.METALLURGY),
    };

    Set<String> possibleAnswers = new HashSet<>();

    int NUMBER_OF_QUESTIONS = skillQuestions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills_questionnaire);

        Intent intent = getIntent();
        student = (Student) intent.getSerializableExtra("student");

        for(int possibleAnswer = 0 ; possibleAnswer <= 10 ; ++possibleAnswer)
            possibleAnswers.add("" + possibleAnswer);

        LinearLayout linearLayout = findViewById(R.id.skillQuestions);
        int radioButtonIds = NUMBER_OF_QUESTIONS;

        for(int questionIndex = 0 ; questionIndex < NUMBER_OF_QUESTIONS ; ++questionIndex)
        {
            TextView textView = new TextView(this);

            String currentQuestionText = (questionIndex + 1) + ". " + skillQuestions[questionIndex].questionText;
            textView.setText(currentQuestionText);

            textView.setTextColor(getResources().getColor(R.color.purple_500));
            textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);


            RadioGroup radioGroup = new RadioGroup(this);
            radioGroup.setId(questionIndex);

            for(int possibleAnswerIndex = 0 ; possibleAnswerIndex <= 10 ; ++possibleAnswerIndex)
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

        int[] skillAnswers = new int[NUMBER_OF_QUESTIONS];

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
            String currentSkillAnswer = radioButton.getText().toString();

            skillAnswers[questionIndex] = Integer.parseInt(currentSkillAnswer);
        }

        Intent intent = new Intent(this, GeneralQuestionnaire.class);

        intent.putExtra("student", student);
        intent.putExtra("skillAnswers", skillAnswers);

        this.startActivity(intent);
    }
}