package com.example.careerrecommendation;

public class ITMScore {

    static final double MAX_POSSIBLE_RATING = 5.0;

    static double[] getITMScoresOfEachBranch(double[] PRScoresOfEachBranch, int[] generalAnswers)
    {
        int NUMBER_OF_ANSWERS = generalAnswers.length;

        double[] relativeTrustValues = new double[NUMBER_OF_ANSWERS];

        for(int answerIndex = 0 ; answerIndex < NUMBER_OF_ANSWERS ; ++answerIndex)
            relativeTrustValues[answerIndex] = generalAnswers[answerIndex] / MAX_POSSIBLE_RATING;

        double[] ITMScoresOfEachBranch = new double[Branches.NUMBER_OF_BRANCHES];

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
        {
            for(int answerIndex  = 0 ; answerIndex < NUMBER_OF_ANSWERS ; ++answerIndex)
                ITMScoresOfEachBranch[branch] += relativeTrustValues[answerIndex] * PRScoresOfEachBranch[branch];

            ITMScoresOfEachBranch[branch] = ITMScoresOfEachBranch[branch] / 4;
        }

        return ITMScoresOfEachBranch;
    }
}

