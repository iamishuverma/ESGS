package com.example.careerrecommendation;

class LinguisticVariable
{
    static final int A = 2;
    static final int B = 4;
    static final int C = 6;
    static final int D = 8;

    double weak;
    double medium;
    double good;

    LinguisticVariable(int skillAnswer)
    {
        calculateLinguisticVariable(skillAnswer);
    }

    void calculateLinguisticVariable(int skillAnswer)
    {
        if(skillAnswer <= A)
            this.weak = 1;
        else if(skillAnswer <= B)
            this.weak = ((double) (skillAnswer - B)) / ((double) (A - B));
        else
            this.weak = 0.0;


        if(A <= skillAnswer && skillAnswer < B)
            this.medium = ((double) (skillAnswer - A)) / ((double) (B - A));
        else if(B <= skillAnswer && skillAnswer <= C)
            this.medium = 1;
        else if(C < skillAnswer && skillAnswer <= D)
            this.medium = ((double) (skillAnswer - D)) / ((double) (C - D));
        else
            this.medium = 0;


        if(C <= skillAnswer && skillAnswer < D)
            this.good = ((double) (skillAnswer - C)) / ((double) (D - C));
        else if(D <= skillAnswer)
            this.good = 1;
        else
            this.good = 0;
    }
}

class FAMTable
{
    double[] NO = new double[2];
    double[] MAY_BE = new double[4];
    double[] YES = new double[3];

    FAMTable(LinguisticVariable linguisticVariableForFirstAnswer, LinguisticVariable linguisticVariableForSecondAnswer)
    {
        calculateNO(linguisticVariableForFirstAnswer, linguisticVariableForSecondAnswer);
        calculateMAY_BE(linguisticVariableForFirstAnswer, linguisticVariableForSecondAnswer);
        calculateYES(linguisticVariableForFirstAnswer, linguisticVariableForSecondAnswer);
    }

    void calculateNO(LinguisticVariable linguisticVariableForFirstAnswer, LinguisticVariable linguisticVariableForSecondAnswer)
    {
        this.NO[0] = Math.min(linguisticVariableForFirstAnswer.weak, linguisticVariableForSecondAnswer.weak);
        this.NO[1] = Math.min(linguisticVariableForFirstAnswer.weak, linguisticVariableForSecondAnswer.medium);
    }

    void calculateMAY_BE(LinguisticVariable linguisticVariableForFirstAnswer, LinguisticVariable linguisticVariableForSecondAnswer)
    {
        this.MAY_BE[0] = Math.min(linguisticVariableForFirstAnswer.weak, linguisticVariableForSecondAnswer.good);
        this.MAY_BE[1] = Math.min(linguisticVariableForFirstAnswer.medium, linguisticVariableForSecondAnswer.weak);
        this.MAY_BE[2] = Math.min(linguisticVariableForFirstAnswer.medium, linguisticVariableForSecondAnswer.medium);
        this.MAY_BE[3] = Math.min(linguisticVariableForFirstAnswer.good, linguisticVariableForSecondAnswer.weak);
    }

    void calculateYES(LinguisticVariable linguisticVariableForFirstAnswer, LinguisticVariable linguisticVariableForSecondAnswer)
    {
        this.YES[0] = Math.min(linguisticVariableForFirstAnswer.medium, linguisticVariableForSecondAnswer.good);
        this.YES[1] = Math.min(linguisticVariableForFirstAnswer.good, linguisticVariableForSecondAnswer.medium);
        this.YES[2] = Math.min(linguisticVariableForFirstAnswer.good, linguisticVariableForSecondAnswer.good);
    }
}

public class FScore {

    static double[] getFScoresOfEachBranch(int[] skillAnswers)
    {
        int NUMBER_OF_ANSWERS = skillAnswers.length;

        LinguisticVariable[] linguisticVariables = new LinguisticVariable[NUMBER_OF_ANSWERS];

        for(int answerIndex = 0 ; answerIndex < NUMBER_OF_ANSWERS ; ++answerIndex) {
            linguisticVariables[answerIndex] = new LinguisticVariable(skillAnswers[answerIndex]);
        }

        FAMTable[] FAMTableOfEachBranch = new FAMTable[Branches.NUMBER_OF_BRANCHES];
        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
            FAMTableOfEachBranch[branch] = new FAMTable(linguisticVariables[2 * branch], linguisticVariables[2 * branch + 1]);

        double WEAK_AREA_VALUE = 1.56;
        double MEDIUM_AREA_VALUE = 5.0;
        double GOOD_AREA_VALUE = 8.44;

        double[] fScoresOfEachBranch = new double[Branches.NUMBER_OF_BRANCHES];
        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
        {
            FAMTable famTableOfCurrentBranch = FAMTableOfEachBranch[branch];

            double[] NO = famTableOfCurrentBranch.NO;
            double[] MAY_BE = famTableOfCurrentBranch.MAY_BE;
            double[] YES = famTableOfCurrentBranch.YES;

            double SUM_OF_NO_MAYBE_YES = 0.0;

            for (double no : NO) {
                fScoresOfEachBranch[branch] += WEAK_AREA_VALUE * no;

                SUM_OF_NO_MAYBE_YES += no;
            }

            for (double mayBe : MAY_BE) {
                fScoresOfEachBranch[branch] += MEDIUM_AREA_VALUE * mayBe;

                SUM_OF_NO_MAYBE_YES += mayBe;
            }

            for (double yes : YES) {
                fScoresOfEachBranch[branch] += GOOD_AREA_VALUE * yes;

                SUM_OF_NO_MAYBE_YES += yes;
            }

            fScoresOfEachBranch[branch] = fScoresOfEachBranch[branch] / SUM_OF_NO_MAYBE_YES;
        }

        return fScoresOfEachBranch;
    }
}
