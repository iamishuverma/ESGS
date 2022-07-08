package com.example.careerrecommendation;

public class AHP {

    static final int NUMBER_OF_CRITERIA = 3;
    static double[] getDesireValueOfEachBranch(double[] PRScoresOfEachBranch, double[] fScoresOfEachBranch, double[] ITMScoresOfEachBranch)
    {
        double[][] pairwiseComparisonMatrix = new double[NUMBER_OF_CRITERIA][NUMBER_OF_CRITERIA];

        pairwiseComparisonMatrix[0][0] = 1.0;
        pairwiseComparisonMatrix[0][1] = 4.0;
        pairwiseComparisonMatrix[0][2] = 2.0;
        pairwiseComparisonMatrix[1][0] = 1.0 / 4.0;
        pairwiseComparisonMatrix[1][1] = 1.0;
        pairwiseComparisonMatrix[1][2] = 2.0;
        pairwiseComparisonMatrix[2][0] = 1.0 / 2.0;
        pairwiseComparisonMatrix[2][1] = 1.0 / 2.0;
        pairwiseComparisonMatrix[2][2] = 1.0;


        double[] sumOfEachColumn = new double[NUMBER_OF_CRITERIA];
        for(int column = 0 ; column < NUMBER_OF_CRITERIA ; ++column)
            for(int row = 0 ; row < NUMBER_OF_CRITERIA ; ++row)
                sumOfEachColumn[column] += pairwiseComparisonMatrix[row][column];


        double[][] normalizedPairwiseComparisonMatrix = new double[NUMBER_OF_CRITERIA][NUMBER_OF_CRITERIA];
        for(int row = 0 ; row < NUMBER_OF_CRITERIA ; ++row)
            for(int column = 0 ; column < NUMBER_OF_CRITERIA ; ++column)
                normalizedPairwiseComparisonMatrix[row][column] = pairwiseComparisonMatrix[row][column] / sumOfEachColumn[column];


        double[] averageOfEachRow = new double[NUMBER_OF_CRITERIA];

        for(int row = 0 ; row < NUMBER_OF_CRITERIA ; ++row)
        {
            for (int column = 0; column < NUMBER_OF_CRITERIA; ++column)
                averageOfEachRow[row] += normalizedPairwiseComparisonMatrix[row][column];

            averageOfEachRow[row] = averageOfEachRow[row] / NUMBER_OF_CRITERIA;
        }

        double[] desireValueForEachBranch = new double[Branches.NUMBER_OF_BRANCHES];

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
            desireValueForEachBranch[branch] = PRScoresOfEachBranch[branch] * averageOfEachRow[0]
                                                + fScoresOfEachBranch[branch] * averageOfEachRow[1]
                                                + ITMScoresOfEachBranch[branch] * averageOfEachRow[2];

        return desireValueForEachBranch;
    }
}
