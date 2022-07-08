package com.example.careerrecommendation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity  implements View.OnClickListener {

    String getBranchText(int branch)
    {
        String branchText = "";
        switch (branch)
        {
            case Branches.CSE: branchText = "CSE";
                break;
            case Branches.IT: branchText = "IT";
                break;
            case Branches.ECE: branchText = "ECE";
                break;
            case Branches.ELECTRICAL: branchText = "Electrical";
                break;
            case Branches.MECHANICAL: branchText = "Mechanical";
                break;
            case Branches.CIVIL: branchText = "Civil";
                break;
            case Branches.CHEMICAL: branchText = "Chemical";
                break;
            case Branches.METALLURGY: branchText = "Metallurgy";
                break;
        }

        return branchText;
    }

    String formatBranchScore(double branchScore)
    {
        String branchScoreString = String.valueOf(branchScore);
        int indexOfDecimal = branchScoreString.indexOf('.');

        branchScoreString = branchScoreString.substring(0, indexOfDecimal + 3);

        Log.i("branch", branchScoreString);

        return branchScoreString;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Intent intent = getIntent();

        Student student = (Student) intent.getSerializableExtra("student");
        int[] skillAnswers = intent.getIntArrayExtra("skillAnswers");
        int[] generalAnswers = intent.getIntArrayExtra("generalAnswers");

        double[] PRScoresOfEachBranch = PRScore.getPRScoresOfEachBranch(student);
        double[] fScoresOfEachBranch = FScore.getFScoresOfEachBranch(skillAnswers);
        double[] ITMScoresOfEachBranch = ITMScore.getITMScoresOfEachBranch(PRScoresOfEachBranch, generalAnswers);

        double[] desireValueForEachBranch = AHP.getDesireValueOfEachBranch(PRScoresOfEachBranch, fScoresOfEachBranch, ITMScoresOfEachBranch);

        double[][] indexedDesiredValueForEachBranch = new double[Branches.NUMBER_OF_BRANCHES][2];

        for(int branch  = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
        {
            indexedDesiredValueForEachBranch[branch][0] = branch;
            indexedDesiredValueForEachBranch[branch][1] = desireValueForEachBranch[branch];
        }

        for(int index = 0 ; index < Branches.NUMBER_OF_BRANCHES - 1 ; ++index)
        {
            double max = indexedDesiredValueForEachBranch[index][1];
            int swapIndex = index;

            for(int branch = index + 1 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
                if(indexedDesiredValueForEachBranch[branch][1] > max)
                {
                    max = indexedDesiredValueForEachBranch[branch][1];
                    swapIndex = branch;
                }

            double desiredValue = indexedDesiredValueForEachBranch[index][1];
            indexedDesiredValueForEachBranch[index][1] = indexedDesiredValueForEachBranch[swapIndex][1];
            indexedDesiredValueForEachBranch[swapIndex][1] = desiredValue;

            double branchIndex = indexedDesiredValueForEachBranch[index][0];
            indexedDesiredValueForEachBranch[index][0] = indexedDesiredValueForEachBranch[swapIndex][0];
            indexedDesiredValueForEachBranch[swapIndex][0] = branchIndex;
        }

        double  SUM_OF_ALL_DESIRED_VALUES = 0.0;

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
            SUM_OF_ALL_DESIRED_VALUES = SUM_OF_ALL_DESIRED_VALUES + indexedDesiredValueForEachBranch[branch][1];

        double[] percentageForEachBranch = new double[Branches.NUMBER_OF_BRANCHES];

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
            percentageForEachBranch[branch] = (indexedDesiredValueForEachBranch[branch][1] * 100.0) / SUM_OF_ALL_DESIRED_VALUES;

        LinearLayout linearLayout = findViewById(R.id.displayResult);

        TextView textView = new TextView(this);
        textView.setText("Following list displays branches from HIGHEST recommended to LOWEST recommened:");
        textView.setTextColor(getResources().getColor(R.color.purple_500));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 22);
        textView.setTypeface(null, Typeface.BOLD);

        linearLayout.addView(textView);

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
        {
            LinearLayout branchAndScore = new LinearLayout(this);
            branchAndScore.setOrientation(LinearLayout.HORIZONTAL);

            int paddingTop = 30;
            if(branch == 0)
                paddingTop = 50;

            branchAndScore.setPadding(0, paddingTop, 0, 0);

            branchAndScore.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));

            TextView branchNameTextView = new TextView(this);
            branchNameTextView.setText(getBranchText((int) indexedDesiredValueForEachBranch[branch][0]));
            branchNameTextView.setTextColor(getResources().getColor(R.color.purple_500));
            branchNameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
            branchNameTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    1f
            ));
            branchNameTextView.setGravity(Gravity.LEFT);

            TextView branchScoreTextView = new TextView(this);
            branchScoreTextView.setText(formatBranchScore(percentageForEachBranch[branch]));
            branchScoreTextView.setTextColor(getResources().getColor(R.color.purple_500));
            branchScoreTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
            branchNameTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    1f
            ));
            branchScoreTextView.setGravity(Gravity.CENTER);

            branchAndScore.addView(branchNameTextView);
            branchAndScore.addView(branchScoreTextView);

            linearLayout.addView(branchAndScore);
        }

        Button button = new Button(this);
        button.setText(R.string.giveFeedback);

        button.setTextColor(getResources().getColor(R.color.white));
        button.setBackgroundColor(getResources().getColor(R.color.purple_500));
        button.setOnClickListener(this);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(0, 100, 0, 0);
        button.setLayoutParams(params);

        linearLayout.addView(button);
    }

    public void onClick(View view) {

        Intent feedBackIntent = new Intent(this, Feedback.class);
        this.startActivity(feedBackIntent);

    }
}