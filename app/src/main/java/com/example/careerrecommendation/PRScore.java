package com.example.careerrecommendation;

public class PRScore
{
    static final int MAIN_STREAMS_NODE = 8;
    static final int OTHER_STREAMS_NODE = 9;
    static final int ENGINEERING_NODE = 10;
    static final int CAREER_NODE = 11;
    static final int ROOT_NODE = 12;

    static final double MAXIMUM_MARKS = 100.0;

    static int[] PHYSICS_BRANCHES = {Branches.CSE, Branches.IT, Branches.MECHANICAL, Branches.CIVIL, Branches.ELECTRICAL};
    static int[] CHEMISTRY_BRANCHES = {Branches.ELECTRICAL, Branches.CHEMICAL, Branches.METALLURGY};
    static int[] MATHS_BRANCHES = {Branches.CSE, Branches.IT, Branches.MECHANICAL, Branches.CIVIL, Branches.ELECTRICAL};
    static int[] CSE_BRANCHES = {Branches.CSE, Branches.IT, Branches.ECE};

    static double[] getPRScoresOfEachBranch(Student student)
    {
        Page[] facebookPages = student.facebookPages;
        int numberOfFacebookPages = facebookPages.length;

        Page[] instagramPages = student.instagramPages;
        int numberOfInstagramPages = instagramPages.length;

        Page[] twitterPages = student.twitterPages;
        int numberOfTwitterPages = twitterPages.length;

        int physicsMarks = student.physicsMarks;
        int chemistryMarks = student.chemistryMarks;
        int mathsMarks = student.mathsMarks;
        int cseMarks = student.cseMarks;

        double[] preferenceDegreeOfBranches = new double[Branches.NUMBER_OF_BRANCHES];

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
        {
            String[] branchAttributes = Branches.getBranchAttributes(branch);
            int numberOfBranchAttributes = branchAttributes.length;

            for(int pageIndex = 0 ; pageIndex < numberOfFacebookPages ; ++pageIndex)
            {
                Page page = facebookPages[pageIndex];

                String[] pageAttributes = page.pageAttributes;
                int numberOfPageAttributes = pageAttributes.length;

                int numberOfTotalAttributes = numberOfPageAttributes + numberOfBranchAttributes;
                int numberOfCommonAttributes = 0;

                for(int branchAttributeIndex = 0  ; branchAttributeIndex < numberOfBranchAttributes ; ++branchAttributeIndex)
                    for(int pageAttributeIndex = 0 ; pageAttributeIndex < numberOfPageAttributes ; ++pageAttributeIndex)
                        if(branchAttributes[branchAttributeIndex].equals(pageAttributes[pageAttributeIndex]))
                            numberOfCommonAttributes += 1;

                int numberOfDistinctAttributes = numberOfTotalAttributes - numberOfCommonAttributes;

                preferenceDegreeOfBranches[branch] += ((double) numberOfCommonAttributes) / ((double) numberOfDistinctAttributes);
            }


            for(int pageIndex = 0 ; pageIndex < numberOfInstagramPages ; ++pageIndex)
            {
                Page page = instagramPages[pageIndex];

                String[] pageAttributes = page.pageAttributes;
                int numberOfPageAttributes = pageAttributes.length;

                int numberOfTotalAttributes = numberOfPageAttributes + numberOfBranchAttributes;
                int numberOfCommonAttributes = 0;

                for(int branchAttributeIndex = 0  ; branchAttributeIndex < numberOfBranchAttributes ; ++branchAttributeIndex)
                    for(int pageAttributeIndex = 0 ; pageAttributeIndex < numberOfPageAttributes ; ++pageAttributeIndex)
                        if(branchAttributes[branchAttributeIndex].equals(pageAttributes[pageAttributeIndex]))
                            numberOfCommonAttributes += 1;

                int numberOfDistinctAttributes = numberOfTotalAttributes - numberOfCommonAttributes;

                preferenceDegreeOfBranches[branch] += ((double) numberOfCommonAttributes) / ((double) numberOfDistinctAttributes);
            }

            for(int pageIndex = 0 ; pageIndex < numberOfTwitterPages ; ++pageIndex)
            {
                Page page = twitterPages[pageIndex];

                String[] pageAttributes = page.pageAttributes;
                int numberOfPageAttributes = pageAttributes.length;

                int numberOfTotalAttributes = numberOfPageAttributes + numberOfBranchAttributes;
                int numberOfCommonAttributes = 0;

                for(int branchAttributeIndex = 0  ; branchAttributeIndex < numberOfBranchAttributes ; ++branchAttributeIndex)
                    for(int pageAttributeIndex = 0 ; pageAttributeIndex < numberOfPageAttributes ; ++pageAttributeIndex)
                        if(branchAttributes[branchAttributeIndex].equals(pageAttributes[pageAttributeIndex]))
                            numberOfCommonAttributes += 1;

                int numberOfDistinctAttributes = numberOfTotalAttributes - numberOfCommonAttributes;

                preferenceDegreeOfBranches[branch] += ((double) numberOfCommonAttributes) / ((double) numberOfDistinctAttributes);
            }
        }

        for(int branch = 0 ; branch < PHYSICS_BRANCHES.length ; ++branch)
            preferenceDegreeOfBranches[branch] += physicsMarks / MAXIMUM_MARKS;


        for(int branch = 0 ; branch < CHEMISTRY_BRANCHES.length ; ++branch)
            preferenceDegreeOfBranches[branch] += chemistryMarks / MAXIMUM_MARKS;


        for(int branch = 0 ; branch < MATHS_BRANCHES.length ; ++branch)
            preferenceDegreeOfBranches[branch] += mathsMarks / MAXIMUM_MARKS;


        for(int branch = 0 ; branch < CSE_BRANCHES.length ; ++branch)
            preferenceDegreeOfBranches[branch] += cseMarks / MAXIMUM_MARKS;

        double sumOfPreferenceDegrees = 0.0;
        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES; ++branch)
            sumOfPreferenceDegrees += preferenceDegreeOfBranches[branch];

        double[] relativeScoreOfBranches = new double[Branches.NUMBER_OF_BRANCHES];

        for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES; ++branch)
            relativeScoreOfBranches[branch] = ((double) preferenceDegreeOfBranches[branch]) / sumOfPreferenceDegrees;

        /**
         TILL NOW, WE HAVE CALCULATED THE PREFERENCE DEGREE(SC) AND RELATIVE SCORES(Rc) OF ALL BRANCHES.
         NOW, WE WILL BUILD THE CAREER TREE.
         */

        /**
         0-7 index for branches, 8 for MAIN STREAMS node, 9 for OTHER STREAMS node, 10 for ENGINEERING node, 11 for CAREER,
         and 12 for ROOT node.
         */
        int[] parentsOfCareerTreeNodes = new int[13];
        parentsOfCareerTreeNodes[Branches.CSE] = MAIN_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.CIVIL] = MAIN_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.ELECTRICAL] = MAIN_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.MECHANICAL] = MAIN_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.ECE] = OTHER_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.METALLURGY] = OTHER_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.IT] = OTHER_STREAMS_NODE;
        parentsOfCareerTreeNodes[Branches.CHEMICAL] = OTHER_STREAMS_NODE;
        parentsOfCareerTreeNodes[MAIN_STREAMS_NODE] = ENGINEERING_NODE;
        parentsOfCareerTreeNodes[OTHER_STREAMS_NODE] = ENGINEERING_NODE;
        parentsOfCareerTreeNodes[ENGINEERING_NODE] = CAREER_NODE;
        parentsOfCareerTreeNodes[CAREER_NODE] = ROOT_NODE;

        int fcpToRootNodeDistance_Dfr = 2;
        int targetBranchToFcpDistance_Dtc = 2;
        int branchToFcpDistance_Dl = 2;

        double[][] similarityMatrix = new double[Branches.NUMBER_OF_BRANCHES][Branches.NUMBER_OF_BRANCHES];
        for(int targetBranch = 0 ; targetBranch < Branches.NUMBER_OF_BRANCHES ; ++targetBranch)
            for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
            {
                if(parentsOfCareerTreeNodes[targetBranch] == parentsOfCareerTreeNodes[branch])
                    similarityMatrix[targetBranch][branch]
                            = ((double) (2 * fcpToRootNodeDistance_Dfr)) / ((double) (targetBranchToFcpDistance_Dtc
                            + branchToFcpDistance_Dl
                            + 2 * fcpToRootNodeDistance_Dfr));
                else
                    similarityMatrix[targetBranch][branch]
                            = ((double) (fcpToRootNodeDistance_Dfr)) / ((double) (targetBranchToFcpDistance_Dtc
                            + branchToFcpDistance_Dl
                            + fcpToRootNodeDistance_Dfr));
            }

        double[] PRScoresOfEachBranch = new double[Branches.NUMBER_OF_BRANCHES];
        for(int currentBranch = 0 ; currentBranch < Branches.NUMBER_OF_BRANCHES ; ++currentBranch)
            for(int branch = 0 ; branch < Branches.NUMBER_OF_BRANCHES ; ++branch)
                PRScoresOfEachBranch[currentBranch] += (relativeScoreOfBranches[branch] * similarityMatrix[currentBranch][branch]);

        return PRScoresOfEachBranch;
    }
}
