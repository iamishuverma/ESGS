package com.example.careerrecommendation;

import java.util.*;
import java.io.*;

class Page implements Serializable
{
    String pageName;
    String[] pageAttributes;

    Page(String pageName, String[] pageAttributes)
    {
        this.pageName = pageName;
        this.pageAttributes = pageAttributes;
    }
}

class Student implements Serializable
{
    String name;
    Page[] facebookPages;
    Page[] instagramPages;
    Page[] twitterPages;
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;
    int cseMarks;

    Student()
    {
        this.name = "";
        this.facebookPages = new Page[1];
        this.instagramPages = new Page[1];
        this.twitterPages = new Page[1];
        this.physicsMarks = this.chemistryMarks = this.mathsMarks = this.cseMarks = 0;
    }

    Student(String name, Page[] facebookPages, Page[] instagramPages, Page[] twitterPages, int physicsMarks, int chemistryMarks,
            int mathsMarks, int cseMarks) {
        this.name = name;
        this.facebookPages = facebookPages;
        this.instagramPages = instagramPages;
        this.twitterPages = twitterPages;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
        this.cseMarks = cseMarks;
    }
}

public class SurveyData
{
    static String[] STUDENT_NAMES = new String[40];

    static Student[] students = null;

    static Student[] getStudentPreferences()
    {
        if(students == null)
            fillStudentPreferences();

        return students;
    }

    static void fillStudentPreferences()
    {
        STUDENT_NAMES[0] = "Santosh";
        STUDENT_NAMES[1] = "Sita";
        STUDENT_NAMES[2] = "Dinesh";
        STUDENT_NAMES[3] = "Suman";
        STUDENT_NAMES[4] = "Ramesh";
        STUDENT_NAMES[5] = "Dilip";
        STUDENT_NAMES[6] = "Rajendra";
        STUDENT_NAMES[7] = "Vinod";
        STUDENT_NAMES[8] = "Shanti";
        STUDENT_NAMES[9] = "Manoj";
        STUDENT_NAMES[10] = "Amit";
        STUDENT_NAMES[11] = "Raju";
        STUDENT_NAMES[12] = "Ram";
        STUDENT_NAMES[13] = "Shankar";
        STUDENT_NAMES[14] = "Raj";
        STUDENT_NAMES[15] = "Krishna";
        STUDENT_NAMES[16] = "Rita";
        STUDENT_NAMES[17] = "Rajesh";
        STUDENT_NAMES[18] = "Sunita";
        STUDENT_NAMES[19] = "Anil";
        STUDENT_NAMES[20] = "Ashok";
        STUDENT_NAMES[21] = "Mohammed";
        STUDENT_NAMES[22] = "Rekha";
        STUDENT_NAMES[23] = "Anita";
        STUDENT_NAMES[24] = "Lakshimi";
        STUDENT_NAMES[25] = "Sanjay";
        STUDENT_NAMES[26] = "Vijay";
        STUDENT_NAMES[27] = "Gita";
        STUDENT_NAMES[28] = "Sunil";
        STUDENT_NAMES[29] = "Ravi";
        STUDENT_NAMES[30] = "Suresh";
        STUDENT_NAMES[31] = "Rakesh";
        STUDENT_NAMES[32] = "Kiran";
        STUDENT_NAMES[33] = "Gopal";
        STUDENT_NAMES[34] = "Abdul";
        STUDENT_NAMES[35] = "Mukesh";
        STUDENT_NAMES[36] = "Sri";
        STUDENT_NAMES[37] = "Sushila";
        STUDENT_NAMES[38] = "Mohan";
        STUDENT_NAMES[39] = "Ajay";

        students = new Student[40];

        Page[] facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #1", null),
                new Page("FACEBOOK_PAGE #19", null),
                new Page("FACEBOOK_PAGE #9", null),
                new Page("FACEBOOK_PAGE #14", null),
                new Page("FACEBOOK_PAGE #18", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "microcontroller",
                "power circuits",
                "CAM",
                "implantable devices",
        };

        facebookPages[1].pageAttributes = new String[]{
                "robotics",
                "physical chemistry",
                "polymers",
                "artifical intelligence",
                "biochemicals",
                "competitive programming",
                "CAM",
        };

        facebookPages[2].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        facebookPages[3].pageAttributes = new String[]{
                "solid mechanics",
                "JAVA",
                "finite element analysis",
                "materials",
                "building",
                "react",
        };

        facebookPages[4].pageAttributes = new String[]{
                "network analysis",
                "surveying",
                "dynamics",
                "electric circuits",
                "android",
                "data structures",
                "IoT",
        };

        Page[] instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #2", null),
                new Page("INSTAGRAM_PAGE #11", null),
                new Page("INSTAGRAM_PAGE #4", null),
                new Page("INSTAGRAM_PAGE #10", null),
                new Page("INSTAGRAM_PAGE #19", null),
                new Page("INSTAGRAM_PAGE #28", null),
                new Page("INSTAGRAM_PAGE #8", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "engineering design",
                "networking",
                "python",
                "analog circuits",
                "materials",
                "machine drawing",
        };

        instagramPages[1].pageAttributes = new String[]{
                "network analysis",
                "operating systems",
                "backend",
                "artifical intelligence",
                "frontend",
                "finite element analysis",
                "microprocessor",
        };

        instagramPages[2].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "electromagnetics",
                "embedded systems",
                "thermodynamics",
        };

        instagramPages[3].pageAttributes = new String[]{
                "logic gates",
                "operating systems",
                "surveying",
                "wireless communication",
                "engineering design",
                "environmental science",
                "frontend",
        };

        instagramPages[4].pageAttributes = new String[]{
                "digital circuits",
                "react",
                "logic gates",
                "thermodynamics",
                "embedded systems",
                "electronics",
                "microprocessor",
        };

        instagramPages[5].pageAttributes = new String[]{
                "robotics",
                "communication",
                "power circuits",
                "solidworks",
                "network analysis",
                "computer",
                "operating systems",
        };

        instagramPages[6].pageAttributes = new String[]{
                "microcontroller",
                "material composition",
                "science",
                "IoT",
                "data science",
                "software",
                "control systems",
        };

        Page[] twitterPages = new Page[]{
                new Page("TWITTER_PAGE #1", null),
                new Page("TWITTER_PAGE #6", null),
                new Page("TWITTER_PAGE #22", null),
                new Page("TWITTER_PAGE #29", null),
                new Page("TWITTER_PAGE #10", null),
                new Page("TWITTER_PAGE #23", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dynamics",
                "control systems",
                "electronics",
                "android",
                "embedded systems",
                "chemistry",
                "dbms",
        };

        twitterPages[1].pageAttributes = new String[]{
                "operating systems",
                "logic gates",
                "science",
                "dbms",
        };

        twitterPages[2].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        twitterPages[3].pageAttributes = new String[]{
                "machine drawing",
                "CAD",
                "electromagnetics",
                "communication",
                "information",
                "wireless communication",
                "thermodynamics",
        };

        twitterPages[4].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        twitterPages[5].pageAttributes = new String[]{
                "dynamics",
                "data structures",
                "materials",
                "control systems",
        };

        int physicsMarks = 67;
        int chemistryMarks = 71;
        int mathsMarks = 75;
        int cseMarks = 56;

        students[0] = new Student(STUDENT_NAMES[0], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #16", null),
                new Page("FACEBOOK_PAGE #28", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "surveying",
                "polymers",
                "data structures",
                "electric circuits",
                "programming",
        };

        facebookPages[1].pageAttributes = new String[]{
                "android",
                "software",
                "engineering design",
                "information",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #12", null),
                new Page("INSTAGRAM_PAGE #26", null),
                new Page("INSTAGRAM_PAGE #23", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        instagramPages[1].pageAttributes = new String[]{
                "implantable devices",
                "software",
                "logic gates",
                "control systems",
                "solid mechanics",
                "IoT",
                "operating systems",
                "biochemicals",
        };

        instagramPages[2].pageAttributes = new String[]{
                "implantable devices",
                "operating systems",
                "networking",
                "data structures",
                "signals",
                "information",
                "backend",
                "robotics",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #6", null),
                new Page("TWITTER_PAGE #10", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "operating systems",
                "logic gates",
                "science",
                "dbms",
        };

        twitterPages[1].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[1] = new Student(STUDENT_NAMES[1], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #12", null),
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #31", null),
                new Page("FACEBOOK_PAGE #9", null),
                new Page("FACEBOOK_PAGE #16", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "programming",
                "polymers",
                "solidworks",
                "electric circuits",
                "computer",
                "frontend",
        };

        facebookPages[1].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[2].pageAttributes = new String[]{
                "engineering design",
                "thermodynamics",
                "robotics",
                "algorithms",
                "finite element analysis",
        };

        facebookPages[3].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        facebookPages[4].pageAttributes = new String[]{
                "surveying",
                "polymers",
                "data structures",
                "electric circuits",
                "programming",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #21", null),
                new Page("TWITTER_PAGE #27", null),
                new Page("TWITTER_PAGE #12", null),
                new Page("TWITTER_PAGE #26", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "communication",
                "solid mechanics",
                "operating systems",
                "physical chemistry",
        };

        twitterPages[1].pageAttributes = new String[]{
                "JAVA",
                "competitive programming",
                "electric circuits",
                "solidworks",
                "network analysis",
                "programming",
                "wireless communication",
        };

        twitterPages[2].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        twitterPages[3].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[2] = new Student(STUDENT_NAMES[2], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #29", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[1].pageAttributes = new String[]{
                "electronics",
                "robotics",
                "thermodynamics",
                "frontend",
                "solid mechanics",
                "science",
                "wireless communication",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #27", null),
                new Page("INSTAGRAM_PAGE #32", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "materials",
                "physical chemistry",
                "digital circuits",
                "data science",
                "solid mechanics",
        };

        instagramPages[1].pageAttributes = new String[]{
                "embedded systems",
                "digital systems",
                "backend",
                "polymers",
                "mathematical equations",
                "data science",
                "building",
                "digital circuits",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #11", null),
                new Page("TWITTER_PAGE #20", null),
                new Page("TWITTER_PAGE #31", null),
                new Page("TWITTER_PAGE #12", null),
                new Page("TWITTER_PAGE #5", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dbms",
                "arduino",
                "digital systems",
                "embedded systems",
                "networking",
        };

        twitterPages[1].pageAttributes = new String[]{
                "arduino",
                "material composition",
                "chemistry",
                "signals",
                "network analysis",
                "thermodynamics",
                "machine drawing",
                "physical chemistry",
        };

        twitterPages[2].pageAttributes = new String[]{
                "physical chemistry",
                "data structures",
                "thermodynamics",
                "signals",
                "software",
                "frontend",
        };

        twitterPages[3].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        twitterPages[4].pageAttributes = new String[]{
                "microprocessor",
                "C++",
                "logic gates",
                "implantable devices",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[3] = new Student(STUDENT_NAMES[3], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #11", null),
                new Page("FACEBOOK_PAGE #1", null),
                new Page("FACEBOOK_PAGE #5", null),
                new Page("FACEBOOK_PAGE #22", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "android",
                "software",
                "thermodynamics",
                "machine drawing",
                "networking",
                "digital circuits",
                "computer",
                "physical chemistry",
        };

        facebookPages[1].pageAttributes = new String[]{
                "microcontroller",
                "power circuits",
                "CAM",
                "implantable devices",
        };

        facebookPages[2].pageAttributes = new String[]{
                "IoT",
                "automation",
                "digital systems",
                "electronics",
                "arduino",
                "android",
        };

        facebookPages[3].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #7", null),
                new Page("INSTAGRAM_PAGE #28", null),
                new Page("INSTAGRAM_PAGE #31", null),
                new Page("INSTAGRAM_PAGE #1", null),
                new Page("INSTAGRAM_PAGE #16", null),
                new Page("INSTAGRAM_PAGE #24", null),
                new Page("INSTAGRAM_PAGE #25", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "programming",
                "control systems",
                "CAM",
                "material composition",
                "arduino",
        };

        instagramPages[1].pageAttributes = new String[]{
                "robotics",
                "communication",
                "power circuits",
                "solidworks",
                "network analysis",
                "computer",
                "operating systems",
        };

        instagramPages[2].pageAttributes = new String[]{
                "physical chemistry",
                "extraction of elements",
                "building",
                "embedded systems",
                "science",
                "dbms",
                "wireless communication",
        };

        instagramPages[3].pageAttributes = new String[]{
                "electronics",
                "algorithms",
                "engineering design",
                "machine drawing",
        };

        instagramPages[4].pageAttributes = new String[]{
                "biochemicals",
                "dynamics",
                "machine drawing",
                "arduino",
                "network analysis",
                "solid mechanics",
                "operating systems",
        };

        instagramPages[5].pageAttributes = new String[]{
                "physical chemistry",
                "implantable devices",
                "telecommunication",
                "machine drawing",
                "backend",
                "extraction of elements",
                "digital systems",
        };

        instagramPages[6].pageAttributes = new String[]{
                "implantable devices",
                "dbms",
                "robotics",
                "thermodynamics",
                "communication",
                "algorithms",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #10", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[4] = new Student(STUDENT_NAMES[4], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #24", null),
                new Page("FACEBOOK_PAGE #28", null),
                new Page("FACEBOOK_PAGE #30", null),
                new Page("FACEBOOK_PAGE #32", null),
                new Page("FACEBOOK_PAGE #18", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "data structures",
                "programming",
                "material composition",
                "wireless communication",
        };

        facebookPages[1].pageAttributes = new String[]{
                "android",
                "software",
                "engineering design",
                "information",
        };

        facebookPages[2].pageAttributes = new String[]{
                "network analysis",
                "control systems",
                "machine learning",
                "power circuits",
                "mathematical equations",
                "building",
                "logic gates",
        };

        facebookPages[3].pageAttributes = new String[]{
                "competitive programming",
                "network analysis",
                "programming",
                "react",
        };

        facebookPages[4].pageAttributes = new String[]{
                "network analysis",
                "surveying",
                "dynamics",
                "electric circuits",
                "android",
                "data structures",
                "IoT",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #26", null),
                new Page("INSTAGRAM_PAGE #10", null),
                new Page("INSTAGRAM_PAGE #16", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "implantable devices",
                "software",
                "logic gates",
                "control systems",
                "solid mechanics",
                "IoT",
                "operating systems",
                "biochemicals",
        };

        instagramPages[1].pageAttributes = new String[]{
                "logic gates",
                "operating systems",
                "surveying",
                "wireless communication",
                "engineering design",
                "environmental science",
                "frontend",
        };

        instagramPages[2].pageAttributes = new String[]{
                "biochemicals",
                "dynamics",
                "machine drawing",
                "arduino",
                "network analysis",
                "solid mechanics",
                "operating systems",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #19", null),
                new Page("TWITTER_PAGE #16", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        twitterPages[1].pageAttributes = new String[]{
                "finite element analysis",
                "biochemicals",
                "dbms",
                "C++",
                "mathematical equations",
                "CAM",
                "machine drawing",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[5] = new Student(STUDENT_NAMES[5], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #4", null),
                new Page("FACEBOOK_PAGE #14", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "finite element analysis",
                "analog circuits",
                "machine learning",
                "react",
                "surveying",
                "algorithms",
                "control systems",
        };

        facebookPages[1].pageAttributes = new String[]{
                "solid mechanics",
                "JAVA",
                "finite element analysis",
                "materials",
                "building",
                "react",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #32", null),
                new Page("INSTAGRAM_PAGE #14", null),
                new Page("INSTAGRAM_PAGE #27", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "embedded systems",
                "digital systems",
                "backend",
                "polymers",
                "mathematical equations",
                "data science",
                "building",
                "digital circuits",
        };

        instagramPages[1].pageAttributes = new String[]{
                "react",
                "power circuits",
                "android",
                "dbms",
        };

        instagramPages[2].pageAttributes = new String[]{
                "materials",
                "physical chemistry",
                "digital circuits",
                "data science",
                "solid mechanics",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #12", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[6] = new Student(STUDENT_NAMES[6], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #8", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "backend",
                "solidworks",
                "algorithms",
                "automation",
                "control systems",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #10", null),
                new Page("TWITTER_PAGE #1", null),
                new Page("TWITTER_PAGE #2", null),
                new Page("TWITTER_PAGE #22", null),
                new Page("TWITTER_PAGE #13", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        twitterPages[1].pageAttributes = new String[]{
                "dynamics",
                "control systems",
                "electronics",
                "android",
                "embedded systems",
                "chemistry",
                "dbms",
        };

        twitterPages[2].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        twitterPages[3].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        twitterPages[4].pageAttributes = new String[]{
                "material composition",
                "arduino",
                "analog circuits",
                "logic gates",
                "machine learning",
                "CAD",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[7] = new Student(STUDENT_NAMES[7], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #12", null),
                new Page("FACEBOOK_PAGE #32", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "programming",
                "polymers",
                "solidworks",
                "electric circuits",
                "computer",
                "frontend",
        };

        facebookPages[1].pageAttributes = new String[]{
                "competitive programming",
                "network analysis",
                "programming",
                "react",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #20", null),
                new Page("INSTAGRAM_PAGE #21", null),
                new Page("INSTAGRAM_PAGE #22", null),
                new Page("INSTAGRAM_PAGE #24", null),
                new Page("INSTAGRAM_PAGE #5", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "telecommunication",
                "competitive programming",
                "IoT",
                "building",
                "materials",
                "C++",
                "electronics",
        };

        instagramPages[1].pageAttributes = new String[]{
                "power circuits",
                "automation",
                "physical chemistry",
                "electric circuits",
                "robotics",
                "data science",
        };

        instagramPages[2].pageAttributes = new String[]{
                "competitive programming",
                "backend",
                "extraction of elements",
                "python",
                "physical chemistry",
                "CAD",
                "biochemicals",
                "engineering design",
        };

        instagramPages[3].pageAttributes = new String[]{
                "physical chemistry",
                "implantable devices",
                "telecommunication",
                "machine drawing",
                "backend",
                "extraction of elements",
                "digital systems",
        };

        instagramPages[4].pageAttributes = new String[]{
                "operating systems",
                "physical chemistry",
                "building",
                "software",
                "control systems",
                "dynamics",
                "android",
                "analog circuits",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #21", null),
                new Page("TWITTER_PAGE #27", null),
                new Page("TWITTER_PAGE #13", null),
                new Page("TWITTER_PAGE #26", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "communication",
                "solid mechanics",
                "operating systems",
                "physical chemistry",
        };

        twitterPages[1].pageAttributes = new String[]{
                "JAVA",
                "competitive programming",
                "electric circuits",
                "solidworks",
                "network analysis",
                "programming",
                "wireless communication",
        };

        twitterPages[2].pageAttributes = new String[]{
                "material composition",
                "arduino",
                "analog circuits",
                "logic gates",
                "machine learning",
                "CAD",
        };

        twitterPages[3].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[8] = new Student(STUDENT_NAMES[8], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #2", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "data science",
                "digital systems",
                "analog circuits",
                "electromagnetics",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #25", null),
                new Page("INSTAGRAM_PAGE #2", null),
                new Page("INSTAGRAM_PAGE #24", null),
                new Page("INSTAGRAM_PAGE #6", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "implantable devices",
                "dbms",
                "robotics",
                "thermodynamics",
                "communication",
                "algorithms",
        };

        instagramPages[1].pageAttributes = new String[]{
                "engineering design",
                "networking",
                "python",
                "analog circuits",
                "materials",
                "machine drawing",
        };

        instagramPages[2].pageAttributes = new String[]{
                "physical chemistry",
                "implantable devices",
                "telecommunication",
                "machine drawing",
                "backend",
                "extraction of elements",
                "digital systems",
        };

        instagramPages[3].pageAttributes = new String[]{
                "power circuits",
                "finite element analysis",
                "network analysis",
                "C++",
                "control systems",
                "physical chemistry",
        };

        twitterPages = new Page[]{
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[9] = new Student(STUDENT_NAMES[9], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #8", null),
                new Page("FACEBOOK_PAGE #4", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "backend",
                "solidworks",
                "algorithms",
                "automation",
                "control systems",
        };

        facebookPages[1].pageAttributes = new String[]{
                "finite element analysis",
                "analog circuits",
                "machine learning",
                "react",
                "surveying",
                "algorithms",
                "control systems",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #29", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "react",
                "backend",
                "signals",
                "microprocessor",
                "electromagnetics",
                "robotics",
                "biochemicals",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #13", null),
                new Page("TWITTER_PAGE #22", null),
                new Page("TWITTER_PAGE #15", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "material composition",
                "arduino",
                "analog circuits",
                "logic gates",
                "machine learning",
                "CAD",
        };

        twitterPages[1].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        twitterPages[2].pageAttributes = new String[]{
                "JAVA",
                "arduino",
                "solid mechanics",
                "digital circuits",
                "robotics",
                "data science",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[10] = new Student(STUDENT_NAMES[10], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #29", null),
                new Page("FACEBOOK_PAGE #21", null),
                new Page("FACEBOOK_PAGE #10", null),
                new Page("FACEBOOK_PAGE #2", null),
                new Page("FACEBOOK_PAGE #28", null),
                new Page("FACEBOOK_PAGE #13", null),
                new Page("FACEBOOK_PAGE #5", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "electronics",
                "robotics",
                "thermodynamics",
                "frontend",
                "solid mechanics",
                "science",
                "wireless communication",
        };

        facebookPages[1].pageAttributes = new String[]{
                "artifical intelligence",
                "signals",
                "digital systems",
                "building",
                "data science",
                "environmental science",
        };

        facebookPages[2].pageAttributes = new String[]{
                "microcontroller",
                "dynamics",
                "solidworks",
                "dbms",
                "polymers",
                "competitive programming",
        };

        facebookPages[3].pageAttributes = new String[]{
                "data science",
                "digital systems",
                "analog circuits",
                "electromagnetics",
        };

        facebookPages[4].pageAttributes = new String[]{
                "android",
                "software",
                "engineering design",
                "information",
        };

        facebookPages[5].pageAttributes = new String[]{
                "embedded systems",
                "machine learning",
                "telecommunication",
                "dynamics",
                "backend",
        };

        facebookPages[6].pageAttributes = new String[]{
                "IoT",
                "automation",
                "digital systems",
                "electronics",
                "arduino",
                "android",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #6", null),
                new Page("TWITTER_PAGE #26", null),
                new Page("TWITTER_PAGE #19", null),
                new Page("TWITTER_PAGE #30", null),
                new Page("TWITTER_PAGE #8", null),
                new Page("TWITTER_PAGE #4", null),
                new Page("TWITTER_PAGE #12", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "operating systems",
                "logic gates",
                "science",
                "dbms",
        };

        twitterPages[1].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        twitterPages[2].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        twitterPages[3].pageAttributes = new String[]{
                "chemistry",
                "solidworks",
                "embedded systems",
                "surveying",
                "science",
                "materials",
                "software",
        };

        twitterPages[4].pageAttributes = new String[]{
                "science",
                "electromagnetics",
                "materials",
                "data science",
        };

        twitterPages[5].pageAttributes = new String[]{
                "digital systems",
                "analog circuits",
                "computer",
                "engineering design",
                "physical chemistry",
                "data science",
                "solidworks",
                "CAM",
        };

        twitterPages[6].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[11] = new Student(STUDENT_NAMES[11], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #18", null),
                new Page("FACEBOOK_PAGE #29", null),
                new Page("FACEBOOK_PAGE #4", null),
                new Page("FACEBOOK_PAGE #3", null),
                new Page("FACEBOOK_PAGE #10", null),
                new Page("FACEBOOK_PAGE #26", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "network analysis",
                "surveying",
                "dynamics",
                "electric circuits",
                "android",
                "data structures",
                "IoT",
        };

        facebookPages[1].pageAttributes = new String[]{
                "electronics",
                "robotics",
                "thermodynamics",
                "frontend",
                "solid mechanics",
                "science",
                "wireless communication",
        };

        facebookPages[2].pageAttributes = new String[]{
                "finite element analysis",
                "analog circuits",
                "machine learning",
                "react",
                "surveying",
                "algorithms",
                "control systems",
        };

        facebookPages[3].pageAttributes = new String[]{
                "physical chemistry",
                "logic gates",
                "power circuits",
                "wireless communication",
                "network analysis",
                "competitive programming",
                "building",
        };

        facebookPages[4].pageAttributes = new String[]{
                "microcontroller",
                "dynamics",
                "solidworks",
                "dbms",
                "polymers",
                "competitive programming",
        };

        facebookPages[5].pageAttributes = new String[]{
                "logic gates",
                "competitive programming",
                "dbms",
                "wireless communication",
                "algorithms",
                "electric circuits",
                "data structures",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #15", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "JAVA",
                "react",
                "solidworks",
                "power circuits",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #19", null),
                new Page("TWITTER_PAGE #23", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        twitterPages[1].pageAttributes = new String[]{
                "dynamics",
                "data structures",
                "materials",
                "control systems",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[12] = new Student(STUDENT_NAMES[12], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #8", null),
                new Page("INSTAGRAM_PAGE #22", null),
                new Page("INSTAGRAM_PAGE #32", null),
                new Page("INSTAGRAM_PAGE #26", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "microcontroller",
                "material composition",
                "science",
                "IoT",
                "data science",
                "software",
                "control systems",
        };

        instagramPages[1].pageAttributes = new String[]{
                "competitive programming",
                "backend",
                "extraction of elements",
                "python",
                "physical chemistry",
                "CAD",
                "biochemicals",
                "engineering design",
        };

        instagramPages[2].pageAttributes = new String[]{
                "embedded systems",
                "digital systems",
                "backend",
                "polymers",
                "mathematical equations",
                "data science",
                "building",
                "digital circuits",
        };

        instagramPages[3].pageAttributes = new String[]{
                "implantable devices",
                "software",
                "logic gates",
                "control systems",
                "solid mechanics",
                "IoT",
                "operating systems",
                "biochemicals",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #23", null),
                new Page("TWITTER_PAGE #19", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dynamics",
                "data structures",
                "materials",
                "control systems",
        };

        twitterPages[1].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[13] = new Student(STUDENT_NAMES[13], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #29", null),
                new Page("FACEBOOK_PAGE #11", null),
                new Page("FACEBOOK_PAGE #12", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "electronics",
                "robotics",
                "thermodynamics",
                "frontend",
                "solid mechanics",
                "science",
                "wireless communication",
        };

        facebookPages[1].pageAttributes = new String[]{
                "android",
                "software",
                "thermodynamics",
                "machine drawing",
                "networking",
                "digital circuits",
                "computer",
                "physical chemistry",
        };

        facebookPages[2].pageAttributes = new String[]{
                "programming",
                "polymers",
                "solidworks",
                "electric circuits",
                "computer",
                "frontend",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #13", null),
                new Page("INSTAGRAM_PAGE #15", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "networking",
                "finite element analysis",
                "programming",
                "automation",
                "solidworks",
                "communication",
                "electromagnetics",
                "architecture",
        };

        instagramPages[1].pageAttributes = new String[]{
                "JAVA",
                "react",
                "solidworks",
                "power circuits",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #29", null),
                new Page("TWITTER_PAGE #16", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "machine drawing",
                "CAD",
                "electromagnetics",
                "communication",
                "information",
                "wireless communication",
                "thermodynamics",
        };

        twitterPages[1].pageAttributes = new String[]{
                "finite element analysis",
                "biochemicals",
                "dbms",
                "C++",
                "mathematical equations",
                "CAM",
                "machine drawing",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[14] = new Student(STUDENT_NAMES[14], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #10", null),
                new Page("FACEBOOK_PAGE #14", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "microcontroller",
                "dynamics",
                "solidworks",
                "dbms",
                "polymers",
                "competitive programming",
        };

        facebookPages[1].pageAttributes = new String[]{
                "solid mechanics",
                "JAVA",
                "finite element analysis",
                "materials",
                "building",
                "react",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #14", null),
                new Page("INSTAGRAM_PAGE #12", null),
                new Page("INSTAGRAM_PAGE #4", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "react",
                "power circuits",
                "android",
                "dbms",
        };

        instagramPages[1].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        instagramPages[2].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "electromagnetics",
                "embedded systems",
                "thermodynamics",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #4", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "digital systems",
                "analog circuits",
                "computer",
                "engineering design",
                "physical chemistry",
                "data science",
                "solidworks",
                "CAM",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[15] = new Student(STUDENT_NAMES[15], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #20", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "telecommunication",
                "artifical intelligence",
                "materials",
                "dynamics",
                "finite element analysis",
                "react",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #12", null),
                new Page("TWITTER_PAGE #30", null),
                new Page("TWITTER_PAGE #14", null),
                new Page("TWITTER_PAGE #10", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        twitterPages[1].pageAttributes = new String[]{
                "chemistry",
                "solidworks",
                "embedded systems",
                "surveying",
                "science",
                "materials",
                "software",
        };

        twitterPages[2].pageAttributes = new String[]{
                "science",
                "mathematical equations",
                "environmental science",
                "operating systems",
                "dynamics",
                "networking",
                "artifical intelligence",
                "competitive programming",
        };

        twitterPages[3].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[16] = new Student(STUDENT_NAMES[16], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #21", null),
                new Page("INSTAGRAM_PAGE #2", null),
                new Page("INSTAGRAM_PAGE #11", null),
                new Page("INSTAGRAM_PAGE #5", null),
                new Page("INSTAGRAM_PAGE #20", null),
                new Page("INSTAGRAM_PAGE #14", null),
                new Page("INSTAGRAM_PAGE #7", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "power circuits",
                "automation",
                "physical chemistry",
                "electric circuits",
                "robotics",
                "data science",
        };

        instagramPages[1].pageAttributes = new String[]{
                "engineering design",
                "networking",
                "python",
                "analog circuits",
                "materials",
                "machine drawing",
        };

        instagramPages[2].pageAttributes = new String[]{
                "network analysis",
                "operating systems",
                "backend",
                "artifical intelligence",
                "frontend",
                "finite element analysis",
                "microprocessor",
        };

        instagramPages[3].pageAttributes = new String[]{
                "operating systems",
                "physical chemistry",
                "building",
                "software",
                "control systems",
                "dynamics",
                "android",
                "analog circuits",
        };

        instagramPages[4].pageAttributes = new String[]{
                "telecommunication",
                "competitive programming",
                "IoT",
                "building",
                "materials",
                "C++",
                "electronics",
        };

        instagramPages[5].pageAttributes = new String[]{
                "react",
                "power circuits",
                "android",
                "dbms",
        };

        instagramPages[6].pageAttributes = new String[]{
                "programming",
                "control systems",
                "CAM",
                "material composition",
                "arduino",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #3", null),
                new Page("TWITTER_PAGE #22", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "control systems",
                "chemistry",
                "operating systems",
                "dbms",
                "electronics",
        };

        twitterPages[1].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[17] = new Student(STUDENT_NAMES[17], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #6", null),
                new Page("FACEBOOK_PAGE #15", null),
                new Page("FACEBOOK_PAGE #12", null),
                new Page("FACEBOOK_PAGE #21", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "implantable devices",
                "backend",
                "digital systems",
                "dynamics",
                "information",
                "analog circuits",
        };

        facebookPages[1].pageAttributes = new String[]{
                "signals",
                "JAVA",
                "embedded systems",
                "electric circuits",
                "chemistry",
                "wireless communication",
        };

        facebookPages[2].pageAttributes = new String[]{
                "programming",
                "polymers",
                "solidworks",
                "electric circuits",
                "computer",
                "frontend",
        };

        facebookPages[3].pageAttributes = new String[]{
                "artifical intelligence",
                "signals",
                "digital systems",
                "building",
                "data science",
                "environmental science",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #12", null),
                new Page("INSTAGRAM_PAGE #1", null),
                new Page("INSTAGRAM_PAGE #10", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        instagramPages[1].pageAttributes = new String[]{
                "electronics",
                "algorithms",
                "engineering design",
                "machine drawing",
        };

        instagramPages[2].pageAttributes = new String[]{
                "logic gates",
                "operating systems",
                "surveying",
                "wireless communication",
                "engineering design",
                "environmental science",
                "frontend",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #1", null),
                new Page("TWITTER_PAGE #21", null),
                new Page("TWITTER_PAGE #22", null),
                new Page("TWITTER_PAGE #14", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dynamics",
                "control systems",
                "electronics",
                "android",
                "embedded systems",
                "chemistry",
                "dbms",
        };

        twitterPages[1].pageAttributes = new String[]{
                "communication",
                "solid mechanics",
                "operating systems",
                "physical chemistry",
        };

        twitterPages[2].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        twitterPages[3].pageAttributes = new String[]{
                "science",
                "mathematical equations",
                "environmental science",
                "operating systems",
                "dynamics",
                "networking",
                "artifical intelligence",
                "competitive programming",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[18] = new Student(STUDENT_NAMES[18], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #14", null),
                new Page("FACEBOOK_PAGE #31", null),
                new Page("FACEBOOK_PAGE #10", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[1].pageAttributes = new String[]{
                "solid mechanics",
                "JAVA",
                "finite element analysis",
                "materials",
                "building",
                "react",
        };

        facebookPages[2].pageAttributes = new String[]{
                "engineering design",
                "thermodynamics",
                "robotics",
                "algorithms",
                "finite element analysis",
        };

        facebookPages[3].pageAttributes = new String[]{
                "microcontroller",
                "dynamics",
                "solidworks",
                "dbms",
                "polymers",
                "competitive programming",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #15", null),
                new Page("INSTAGRAM_PAGE #21", null),
                new Page("INSTAGRAM_PAGE #1", null),
                new Page("INSTAGRAM_PAGE #12", null),
                new Page("INSTAGRAM_PAGE #3", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "JAVA",
                "react",
                "solidworks",
                "power circuits",
        };

        instagramPages[1].pageAttributes = new String[]{
                "power circuits",
                "automation",
                "physical chemistry",
                "electric circuits",
                "robotics",
                "data science",
        };

        instagramPages[2].pageAttributes = new String[]{
                "electronics",
                "algorithms",
                "engineering design",
                "machine drawing",
        };

        instagramPages[3].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        instagramPages[4].pageAttributes = new String[]{
                "electromagnetics",
                "science",
                "CAD",
                "digital circuits",
                "building",
                "material composition",
        };

        twitterPages = new Page[]{
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[19] = new Student(STUDENT_NAMES[19], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #13", null),
                new Page("FACEBOOK_PAGE #27", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "embedded systems",
                "machine learning",
                "telecommunication",
                "dynamics",
                "backend",
        };

        facebookPages[1].pageAttributes = new String[]{
                "digital circuits",
                "digital systems",
                "control systems",
                "signals",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #13", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "networking",
                "finite element analysis",
                "programming",
                "automation",
                "solidworks",
                "communication",
                "electromagnetics",
                "architecture",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #23", null),
                new Page("TWITTER_PAGE #18", null),
                new Page("TWITTER_PAGE #2", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dynamics",
                "data structures",
                "materials",
                "control systems",
        };

        twitterPages[1].pageAttributes = new String[]{
                "embedded systems",
                "solid mechanics",
                "digital systems",
                "data structures",
                "IoT",
        };

        twitterPages[2].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[20] = new Student(STUDENT_NAMES[20], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #11", null),
                new Page("FACEBOOK_PAGE #12", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "android",
                "software",
                "thermodynamics",
                "machine drawing",
                "networking",
                "digital circuits",
                "computer",
                "physical chemistry",
        };

        facebookPages[1].pageAttributes = new String[]{
                "programming",
                "polymers",
                "solidworks",
                "electric circuits",
                "computer",
                "frontend",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #32", null),
                new Page("INSTAGRAM_PAGE #10", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "embedded systems",
                "digital systems",
                "backend",
                "polymers",
                "mathematical equations",
                "data science",
                "building",
                "digital circuits",
        };

        instagramPages[1].pageAttributes = new String[]{
                "logic gates",
                "operating systems",
                "surveying",
                "wireless communication",
                "engineering design",
                "environmental science",
                "frontend",
        };

        twitterPages = new Page[]{
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[21] = new Student(STUDENT_NAMES[21], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #3", null),
                new Page("FACEBOOK_PAGE #4", null),
                new Page("FACEBOOK_PAGE #27", null),
                new Page("FACEBOOK_PAGE #31", null),
                new Page("FACEBOOK_PAGE #12", null),
                new Page("FACEBOOK_PAGE #26", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "physical chemistry",
                "logic gates",
                "power circuits",
                "wireless communication",
                "network analysis",
                "competitive programming",
                "building",
        };

        facebookPages[1].pageAttributes = new String[]{
                "finite element analysis",
                "analog circuits",
                "machine learning",
                "react",
                "surveying",
                "algorithms",
                "control systems",
        };

        facebookPages[2].pageAttributes = new String[]{
                "digital circuits",
                "digital systems",
                "control systems",
                "signals",
        };

        facebookPages[3].pageAttributes = new String[]{
                "engineering design",
                "thermodynamics",
                "robotics",
                "algorithms",
                "finite element analysis",
        };

        facebookPages[4].pageAttributes = new String[]{
                "programming",
                "polymers",
                "solidworks",
                "electric circuits",
                "computer",
                "frontend",
        };

        facebookPages[5].pageAttributes = new String[]{
                "logic gates",
                "competitive programming",
                "dbms",
                "wireless communication",
                "algorithms",
                "electric circuits",
                "data structures",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #16", null),
                new Page("INSTAGRAM_PAGE #10", null),
                new Page("INSTAGRAM_PAGE #20", null),
                new Page("INSTAGRAM_PAGE #25", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "biochemicals",
                "dynamics",
                "machine drawing",
                "arduino",
                "network analysis",
                "solid mechanics",
                "operating systems",
        };

        instagramPages[1].pageAttributes = new String[]{
                "logic gates",
                "operating systems",
                "surveying",
                "wireless communication",
                "engineering design",
                "environmental science",
                "frontend",
        };

        instagramPages[2].pageAttributes = new String[]{
                "telecommunication",
                "competitive programming",
                "IoT",
                "building",
                "materials",
                "C++",
                "electronics",
        };

        instagramPages[3].pageAttributes = new String[]{
                "implantable devices",
                "dbms",
                "robotics",
                "thermodynamics",
                "communication",
                "algorithms",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #19", null),
                new Page("TWITTER_PAGE #16", null),
                new Page("TWITTER_PAGE #3", null),
                new Page("TWITTER_PAGE #23", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        twitterPages[1].pageAttributes = new String[]{
                "finite element analysis",
                "biochemicals",
                "dbms",
                "C++",
                "mathematical equations",
                "CAM",
                "machine drawing",
        };

        twitterPages[2].pageAttributes = new String[]{
                "control systems",
                "chemistry",
                "operating systems",
                "dbms",
                "electronics",
        };

        twitterPages[3].pageAttributes = new String[]{
                "dynamics",
                "data structures",
                "materials",
                "control systems",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[22] = new Student(STUDENT_NAMES[22], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #20", null),
                new Page("FACEBOOK_PAGE #32", null),
                new Page("FACEBOOK_PAGE #10", null),
                new Page("FACEBOOK_PAGE #9", null),
                new Page("FACEBOOK_PAGE #3", null),
                new Page("FACEBOOK_PAGE #28", null),
                new Page("FACEBOOK_PAGE #15", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "telecommunication",
                "artifical intelligence",
                "materials",
                "dynamics",
                "finite element analysis",
                "react",
        };

        facebookPages[1].pageAttributes = new String[]{
                "competitive programming",
                "network analysis",
                "programming",
                "react",
        };

        facebookPages[2].pageAttributes = new String[]{
                "microcontroller",
                "dynamics",
                "solidworks",
                "dbms",
                "polymers",
                "competitive programming",
        };

        facebookPages[3].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        facebookPages[4].pageAttributes = new String[]{
                "physical chemistry",
                "logic gates",
                "power circuits",
                "wireless communication",
                "network analysis",
                "competitive programming",
                "building",
        };

        facebookPages[5].pageAttributes = new String[]{
                "android",
                "software",
                "engineering design",
                "information",
        };

        facebookPages[6].pageAttributes = new String[]{
                "signals",
                "JAVA",
                "embedded systems",
                "electric circuits",
                "chemistry",
                "wireless communication",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #26", null),
                new Page("TWITTER_PAGE #10", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        twitterPages[1].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[23] = new Student(STUDENT_NAMES[23], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #22", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "competitive programming",
                "backend",
                "extraction of elements",
                "python",
                "physical chemistry",
                "CAD",
                "biochemicals",
                "engineering design",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #16", null),
                new Page("TWITTER_PAGE #20", null),
                new Page("TWITTER_PAGE #27", null),
                new Page("TWITTER_PAGE #7", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "finite element analysis",
                "biochemicals",
                "dbms",
                "C++",
                "mathematical equations",
                "CAM",
                "machine drawing",
        };

        twitterPages[1].pageAttributes = new String[]{
                "arduino",
                "material composition",
                "chemistry",
                "signals",
                "network analysis",
                "thermodynamics",
                "machine drawing",
                "physical chemistry",
        };

        twitterPages[2].pageAttributes = new String[]{
                "JAVA",
                "competitive programming",
                "electric circuits",
                "solidworks",
                "network analysis",
                "programming",
                "wireless communication",
        };

        twitterPages[3].pageAttributes = new String[]{
                "networking",
                "wireless communication",
                "solidworks",
                "extraction of elements",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[24] = new Student(STUDENT_NAMES[24], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #31", null),
                new Page("FACEBOOK_PAGE #1", null),
                new Page("FACEBOOK_PAGE #11", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "engineering design",
                "thermodynamics",
                "robotics",
                "algorithms",
                "finite element analysis",
        };

        facebookPages[1].pageAttributes = new String[]{
                "microcontroller",
                "power circuits",
                "CAM",
                "implantable devices",
        };

        facebookPages[2].pageAttributes = new String[]{
                "android",
                "software",
                "thermodynamics",
                "machine drawing",
                "networking",
                "digital circuits",
                "computer",
                "physical chemistry",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #17", null),
                new Page("INSTAGRAM_PAGE #8", null),
                new Page("INSTAGRAM_PAGE #13", null),
                new Page("INSTAGRAM_PAGE #4", null),
                new Page("INSTAGRAM_PAGE #7", null),
                new Page("INSTAGRAM_PAGE #21", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "building",
                "network analysis",
                "architecture",
                "react",
                "chemistry",
                "signals",
        };

        instagramPages[1].pageAttributes = new String[]{
                "microcontroller",
                "material composition",
                "science",
                "IoT",
                "data science",
                "software",
                "control systems",
        };

        instagramPages[2].pageAttributes = new String[]{
                "networking",
                "finite element analysis",
                "programming",
                "automation",
                "solidworks",
                "communication",
                "electromagnetics",
                "architecture",
        };

        instagramPages[3].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "electromagnetics",
                "embedded systems",
                "thermodynamics",
        };

        instagramPages[4].pageAttributes = new String[]{
                "programming",
                "control systems",
                "CAM",
                "material composition",
                "arduino",
        };

        instagramPages[5].pageAttributes = new String[]{
                "power circuits",
                "automation",
                "physical chemistry",
                "electric circuits",
                "robotics",
                "data science",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #31", null),
                new Page("TWITTER_PAGE #4", null),
                new Page("TWITTER_PAGE #18", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "physical chemistry",
                "data structures",
                "thermodynamics",
                "signals",
                "software",
                "frontend",
        };

        twitterPages[1].pageAttributes = new String[]{
                "digital systems",
                "analog circuits",
                "computer",
                "engineering design",
                "physical chemistry",
                "data science",
                "solidworks",
                "CAM",
        };

        twitterPages[2].pageAttributes = new String[]{
                "embedded systems",
                "solid mechanics",
                "digital systems",
                "data structures",
                "IoT",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[25] = new Student(STUDENT_NAMES[25], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #25", null),
                new Page("FACEBOOK_PAGE #18", null),
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #32", null),
                new Page("FACEBOOK_PAGE #5", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "C++",
                "engineering design",
                "IoT",
                "automation",
        };

        facebookPages[1].pageAttributes = new String[]{
                "network analysis",
                "surveying",
                "dynamics",
                "electric circuits",
                "android",
                "data structures",
                "IoT",
        };

        facebookPages[2].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[3].pageAttributes = new String[]{
                "competitive programming",
                "network analysis",
                "programming",
                "react",
        };

        facebookPages[4].pageAttributes = new String[]{
                "IoT",
                "automation",
                "digital systems",
                "electronics",
                "arduino",
                "android",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #24", null),
                new Page("INSTAGRAM_PAGE #28", null),
                new Page("INSTAGRAM_PAGE #6", null),
                new Page("INSTAGRAM_PAGE #13", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "physical chemistry",
                "implantable devices",
                "telecommunication",
                "machine drawing",
                "backend",
                "extraction of elements",
                "digital systems",
        };

        instagramPages[1].pageAttributes = new String[]{
                "robotics",
                "communication",
                "power circuits",
                "solidworks",
                "network analysis",
                "computer",
                "operating systems",
        };

        instagramPages[2].pageAttributes = new String[]{
                "power circuits",
                "finite element analysis",
                "network analysis",
                "C++",
                "control systems",
                "physical chemistry",
        };

        instagramPages[3].pageAttributes = new String[]{
                "networking",
                "finite element analysis",
                "programming",
                "automation",
                "solidworks",
                "communication",
                "electromagnetics",
                "architecture",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #4", null),
                new Page("TWITTER_PAGE #6", null),
                new Page("TWITTER_PAGE #12", null),
                new Page("TWITTER_PAGE #17", null),
                new Page("TWITTER_PAGE #9", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "digital systems",
                "analog circuits",
                "computer",
                "engineering design",
                "physical chemistry",
                "data science",
                "solidworks",
                "CAM",
        };

        twitterPages[1].pageAttributes = new String[]{
                "operating systems",
                "logic gates",
                "science",
                "dbms",
        };

        twitterPages[2].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        twitterPages[3].pageAttributes = new String[]{
                "solidworks",
                "machine drawing",
                "control systems",
                "competitive programming",
        };

        twitterPages[4].pageAttributes = new String[]{
                "extraction of elements",
                "microcontroller",
                "IoT",
                "CAM",
                "dbms",
                "material composition",
                "chemistry",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[26] = new Student(STUDENT_NAMES[26], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #17", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "android",
                "environmental science",
                "electronics",
                "programming",
                "backend",
                "robotics",
                "engineering design",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #22", null),
                new Page("INSTAGRAM_PAGE #12", null),
                new Page("INSTAGRAM_PAGE #23", null),
                new Page("INSTAGRAM_PAGE #11", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "competitive programming",
                "backend",
                "extraction of elements",
                "python",
                "physical chemistry",
                "CAD",
                "biochemicals",
                "engineering design",
        };

        instagramPages[1].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        instagramPages[2].pageAttributes = new String[]{
                "implantable devices",
                "operating systems",
                "networking",
                "data structures",
                "signals",
                "information",
                "backend",
                "robotics",
        };

        instagramPages[3].pageAttributes = new String[]{
                "network analysis",
                "operating systems",
                "backend",
                "artifical intelligence",
                "frontend",
                "finite element analysis",
                "microprocessor",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #17", null),
                new Page("TWITTER_PAGE #2", null),
                new Page("TWITTER_PAGE #1", null),
                new Page("TWITTER_PAGE #22", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "solidworks",
                "machine drawing",
                "control systems",
                "competitive programming",
        };

        twitterPages[1].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        twitterPages[2].pageAttributes = new String[]{
                "dynamics",
                "control systems",
                "electronics",
                "android",
                "embedded systems",
                "chemistry",
                "dbms",
        };

        twitterPages[3].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[27] = new Student(STUDENT_NAMES[27], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #27", null),
                new Page("FACEBOOK_PAGE #32", null),
                new Page("FACEBOOK_PAGE #24", null),
                new Page("FACEBOOK_PAGE #31", null),
                new Page("FACEBOOK_PAGE #19", null),
                new Page("FACEBOOK_PAGE #21", null),
                new Page("FACEBOOK_PAGE #13", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "digital circuits",
                "digital systems",
                "control systems",
                "signals",
        };

        facebookPages[1].pageAttributes = new String[]{
                "competitive programming",
                "network analysis",
                "programming",
                "react",
        };

        facebookPages[2].pageAttributes = new String[]{
                "data structures",
                "programming",
                "material composition",
                "wireless communication",
        };

        facebookPages[3].pageAttributes = new String[]{
                "engineering design",
                "thermodynamics",
                "robotics",
                "algorithms",
                "finite element analysis",
        };

        facebookPages[4].pageAttributes = new String[]{
                "robotics",
                "physical chemistry",
                "polymers",
                "artifical intelligence",
                "biochemicals",
                "competitive programming",
                "CAM",
        };

        facebookPages[5].pageAttributes = new String[]{
                "artifical intelligence",
                "signals",
                "digital systems",
                "building",
                "data science",
                "environmental science",
        };

        facebookPages[6].pageAttributes = new String[]{
                "embedded systems",
                "machine learning",
                "telecommunication",
                "dynamics",
                "backend",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #30", null),
                new Page("INSTAGRAM_PAGE #29", null),
                new Page("INSTAGRAM_PAGE #26", null),
                new Page("INSTAGRAM_PAGE #1", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "arduino",
                "frontend",
                "machine drawing",
                "environmental science",
        };

        instagramPages[1].pageAttributes = new String[]{
                "react",
                "backend",
                "signals",
                "microprocessor",
                "electromagnetics",
                "robotics",
                "biochemicals",
        };

        instagramPages[2].pageAttributes = new String[]{
                "implantable devices",
                "software",
                "logic gates",
                "control systems",
                "solid mechanics",
                "IoT",
                "operating systems",
                "biochemicals",
        };

        instagramPages[3].pageAttributes = new String[]{
                "electronics",
                "algorithms",
                "engineering design",
                "machine drawing",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #24", null),
                new Page("TWITTER_PAGE #6", null),
                new Page("TWITTER_PAGE #2", null),
                new Page("TWITTER_PAGE #31", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "communication",
                "extraction of elements",
                "information",
                "frontend",
                "C++",
        };

        twitterPages[1].pageAttributes = new String[]{
                "operating systems",
                "logic gates",
                "science",
                "dbms",
        };

        twitterPages[2].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        twitterPages[3].pageAttributes = new String[]{
                "physical chemistry",
                "data structures",
                "thermodynamics",
                "signals",
                "software",
                "frontend",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[28] = new Student(STUDENT_NAMES[28], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #7", null),
                new Page("FACEBOOK_PAGE #5", null),
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #21", null),
                new Page("FACEBOOK_PAGE #30", null),
                new Page("FACEBOOK_PAGE #31", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "solid mechanics",
                "programming",
                "science",
                "data structures",
                "C++",
                "finite element analysis",
                "arduino",
                "frontend",
        };

        facebookPages[1].pageAttributes = new String[]{
                "IoT",
                "automation",
                "digital systems",
                "electronics",
                "arduino",
                "android",
        };

        facebookPages[2].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[3].pageAttributes = new String[]{
                "artifical intelligence",
                "signals",
                "digital systems",
                "building",
                "data science",
                "environmental science",
        };

        facebookPages[4].pageAttributes = new String[]{
                "network analysis",
                "control systems",
                "machine learning",
                "power circuits",
                "mathematical equations",
                "building",
                "logic gates",
        };

        facebookPages[5].pageAttributes = new String[]{
                "engineering design",
                "thermodynamics",
                "robotics",
                "algorithms",
                "finite element analysis",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #2", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "engineering design",
                "networking",
                "python",
                "analog circuits",
                "materials",
                "machine drawing",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #23", null),
                new Page("TWITTER_PAGE #21", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dynamics",
                "data structures",
                "materials",
                "control systems",
        };

        twitterPages[1].pageAttributes = new String[]{
                "communication",
                "solid mechanics",
                "operating systems",
                "physical chemistry",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[29] = new Student(STUDENT_NAMES[29], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #2", null),
                new Page("FACEBOOK_PAGE #19", null),
                new Page("FACEBOOK_PAGE #3", null),
                new Page("FACEBOOK_PAGE #25", null),
                new Page("FACEBOOK_PAGE #9", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "data science",
                "digital systems",
                "analog circuits",
                "electromagnetics",
        };

        facebookPages[1].pageAttributes = new String[]{
                "robotics",
                "physical chemistry",
                "polymers",
                "artifical intelligence",
                "biochemicals",
                "competitive programming",
                "CAM",
        };

        facebookPages[2].pageAttributes = new String[]{
                "physical chemistry",
                "logic gates",
                "power circuits",
                "wireless communication",
                "network analysis",
                "competitive programming",
                "building",
        };

        facebookPages[3].pageAttributes = new String[]{
                "C++",
                "engineering design",
                "IoT",
                "automation",
        };

        facebookPages[4].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #26", null),
                new Page("TWITTER_PAGE #10", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        twitterPages[1].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[30] = new Student(STUDENT_NAMES[30], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #15", null),
                new Page("FACEBOOK_PAGE #8", null),
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #9", null),
                new Page("FACEBOOK_PAGE #17", null),
                new Page("FACEBOOK_PAGE #2", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "signals",
                "JAVA",
                "embedded systems",
                "electric circuits",
                "chemistry",
                "wireless communication",
        };

        facebookPages[1].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "backend",
                "solidworks",
                "algorithms",
                "automation",
                "control systems",
        };

        facebookPages[2].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[3].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        facebookPages[4].pageAttributes = new String[]{
                "android",
                "environmental science",
                "electronics",
                "programming",
                "backend",
                "robotics",
                "engineering design",
        };

        facebookPages[5].pageAttributes = new String[]{
                "data science",
                "digital systems",
                "analog circuits",
                "electromagnetics",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #9", null),
                new Page("INSTAGRAM_PAGE #24", null),
                new Page("INSTAGRAM_PAGE #12", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "environmental science",
                "control systems",
                "machine drawing",
                "algorithms",
                "building",
                "analog circuits",
                "mathematical equations",
                "machine learning",
        };

        instagramPages[1].pageAttributes = new String[]{
                "physical chemistry",
                "implantable devices",
                "telecommunication",
                "machine drawing",
                "backend",
                "extraction of elements",
                "digital systems",
        };

        instagramPages[2].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #18", null),
                new Page("TWITTER_PAGE #2", null),
                new Page("TWITTER_PAGE #12", null),
                new Page("TWITTER_PAGE #25", null),
                new Page("TWITTER_PAGE #27", null),
                new Page("TWITTER_PAGE #10", null),
                new Page("TWITTER_PAGE #24", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "embedded systems",
                "solid mechanics",
                "digital systems",
                "data structures",
                "IoT",
        };

        twitterPages[1].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        twitterPages[2].pageAttributes = new String[]{
                "communication",
                "dbms",
                "implantable devices",
                "algorithms",
        };

        twitterPages[3].pageAttributes = new String[]{
                "dbms",
                "software",
                "operating systems",
                "embedded systems",
                "power circuits",
        };

        twitterPages[4].pageAttributes = new String[]{
                "JAVA",
                "competitive programming",
                "electric circuits",
                "solidworks",
                "network analysis",
                "programming",
                "wireless communication",
        };

        twitterPages[5].pageAttributes = new String[]{
                "signals",
                "algorithms",
                "machine drawing",
                "information",
                "networking",
        };

        twitterPages[6].pageAttributes = new String[]{
                "communication",
                "extraction of elements",
                "information",
                "frontend",
                "C++",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[31] = new Student(STUDENT_NAMES[31], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #18", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "biochemicals",
                "react",
                "electromagnetics",
                "arduino",
                "digital circuits",
                "material composition",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #19", null),
                new Page("TWITTER_PAGE #9", null),
                new Page("TWITTER_PAGE #15", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        twitterPages[1].pageAttributes = new String[]{
                "extraction of elements",
                "microcontroller",
                "IoT",
                "CAM",
                "dbms",
                "material composition",
                "chemistry",
        };

        twitterPages[2].pageAttributes = new String[]{
                "JAVA",
                "arduino",
                "solid mechanics",
                "digital circuits",
                "robotics",
                "data science",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[32] = new Student(STUDENT_NAMES[32], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #12", null),
                new Page("INSTAGRAM_PAGE #30", null),
                new Page("INSTAGRAM_PAGE #15", null),
                new Page("INSTAGRAM_PAGE #8", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "software",
                "network analysis",
                "communication",
                "electric circuits",
                "digital circuits",
                "microprocessor",
                "analog circuits",
        };

        instagramPages[1].pageAttributes = new String[]{
                "arduino",
                "frontend",
                "machine drawing",
                "environmental science",
        };

        instagramPages[2].pageAttributes = new String[]{
                "JAVA",
                "react",
                "solidworks",
                "power circuits",
        };

        instagramPages[3].pageAttributes = new String[]{
                "microcontroller",
                "material composition",
                "science",
                "IoT",
                "data science",
                "software",
                "control systems",
        };

        twitterPages = new Page[]{
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[33] = new Student(STUDENT_NAMES[33], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #13", null),
                new Page("FACEBOOK_PAGE #2", null),
                new Page("FACEBOOK_PAGE #22", null),
                new Page("FACEBOOK_PAGE #19", null),
                new Page("FACEBOOK_PAGE #18", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "embedded systems",
                "machine learning",
                "telecommunication",
                "dynamics",
                "backend",
        };

        facebookPages[1].pageAttributes = new String[]{
                "data science",
                "digital systems",
                "analog circuits",
                "electromagnetics",
        };

        facebookPages[2].pageAttributes = new String[]{
                "algorithms",
                "robotics",
                "thermodynamics",
                "finite element analysis",
                "extraction of elements",
                "arduino",
        };

        facebookPages[3].pageAttributes = new String[]{
                "robotics",
                "physical chemistry",
                "polymers",
                "artifical intelligence",
                "biochemicals",
                "competitive programming",
                "CAM",
        };

        facebookPages[4].pageAttributes = new String[]{
                "network analysis",
                "surveying",
                "dynamics",
                "electric circuits",
                "android",
                "data structures",
                "IoT",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #19", null),
                new Page("INSTAGRAM_PAGE #32", null),
                new Page("INSTAGRAM_PAGE #14", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "digital circuits",
                "react",
                "logic gates",
                "thermodynamics",
                "embedded systems",
                "electronics",
                "microprocessor",
        };

        instagramPages[1].pageAttributes = new String[]{
                "embedded systems",
                "digital systems",
                "backend",
                "polymers",
                "mathematical equations",
                "data science",
                "building",
                "digital circuits",
        };

        instagramPages[2].pageAttributes = new String[]{
                "react",
                "power circuits",
                "android",
                "dbms",
        };

        twitterPages = new Page[]{
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[34] = new Student(STUDENT_NAMES[34], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #9", null),
                new Page("FACEBOOK_PAGE #26", null),
                new Page("FACEBOOK_PAGE #28", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        facebookPages[1].pageAttributes = new String[]{
                "logic gates",
                "competitive programming",
                "dbms",
                "wireless communication",
                "algorithms",
                "electric circuits",
                "data structures",
        };

        facebookPages[2].pageAttributes = new String[]{
                "android",
                "software",
                "engineering design",
                "information",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #4", null),
                new Page("INSTAGRAM_PAGE #14", null),
                new Page("INSTAGRAM_PAGE #16", null),
                new Page("INSTAGRAM_PAGE #2", null),
                new Page("INSTAGRAM_PAGE #19", null),
                new Page("INSTAGRAM_PAGE #20", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "microcontroller",
                "CAM",
                "electromagnetics",
                "embedded systems",
                "thermodynamics",
        };

        instagramPages[1].pageAttributes = new String[]{
                "react",
                "power circuits",
                "android",
                "dbms",
        };

        instagramPages[2].pageAttributes = new String[]{
                "biochemicals",
                "dynamics",
                "machine drawing",
                "arduino",
                "network analysis",
                "solid mechanics",
                "operating systems",
        };

        instagramPages[3].pageAttributes = new String[]{
                "engineering design",
                "networking",
                "python",
                "analog circuits",
                "materials",
                "machine drawing",
        };

        instagramPages[4].pageAttributes = new String[]{
                "digital circuits",
                "react",
                "logic gates",
                "thermodynamics",
                "embedded systems",
                "electronics",
                "microprocessor",
        };

        instagramPages[5].pageAttributes = new String[]{
                "telecommunication",
                "competitive programming",
                "IoT",
                "building",
                "materials",
                "C++",
                "electronics",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #7", null),
                new Page("TWITTER_PAGE #22", null),
                new Page("TWITTER_PAGE #6", null),
                new Page("TWITTER_PAGE #4", null),
                new Page("TWITTER_PAGE #15", null),
                new Page("TWITTER_PAGE #19", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "networking",
                "wireless communication",
                "solidworks",
                "extraction of elements",
        };

        twitterPages[1].pageAttributes = new String[]{
                "science",
                "dynamics",
                "networking",
                "finite element analysis",
                "react",
                "C++",
                "solid mechanics",
                "programming",
        };

        twitterPages[2].pageAttributes = new String[]{
                "operating systems",
                "logic gates",
                "science",
                "dbms",
        };

        twitterPages[3].pageAttributes = new String[]{
                "digital systems",
                "analog circuits",
                "computer",
                "engineering design",
                "physical chemistry",
                "data science",
                "solidworks",
                "CAM",
        };

        twitterPages[4].pageAttributes = new String[]{
                "JAVA",
                "arduino",
                "solid mechanics",
                "digital circuits",
                "robotics",
                "data science",
        };

        twitterPages[5].pageAttributes = new String[]{
                "python",
                "dbms",
                "react",
                "wireless communication",
                "dynamics",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[35] = new Student(STUDENT_NAMES[35], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #9", null),
                new Page("FACEBOOK_PAGE #15", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "android",
                "information",
                "architecture",
                "mathematical equations",
        };

        facebookPages[1].pageAttributes = new String[]{
                "signals",
                "JAVA",
                "embedded systems",
                "electric circuits",
                "chemistry",
                "wireless communication",
        };

        instagramPages = new Page[]{
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #1", null),
                new Page("TWITTER_PAGE #4", null),
                new Page("TWITTER_PAGE #17", null),
                new Page("TWITTER_PAGE #13", null),
                new Page("TWITTER_PAGE #21", null),
                new Page("TWITTER_PAGE #2", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "dynamics",
                "control systems",
                "electronics",
                "android",
                "embedded systems",
                "chemistry",
                "dbms",
        };

        twitterPages[1].pageAttributes = new String[]{
                "digital systems",
                "analog circuits",
                "computer",
                "engineering design",
                "physical chemistry",
                "data science",
                "solidworks",
                "CAM",
        };

        twitterPages[2].pageAttributes = new String[]{
                "solidworks",
                "machine drawing",
                "control systems",
                "competitive programming",
        };

        twitterPages[3].pageAttributes = new String[]{
                "material composition",
                "arduino",
                "analog circuits",
                "logic gates",
                "machine learning",
                "CAD",
        };

        twitterPages[4].pageAttributes = new String[]{
                "communication",
                "solid mechanics",
                "operating systems",
                "physical chemistry",
        };

        twitterPages[5].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[36] = new Student(STUDENT_NAMES[36], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #20", null),
                new Page("INSTAGRAM_PAGE #29", null),
                new Page("INSTAGRAM_PAGE #31", null),
                new Page("INSTAGRAM_PAGE #30", null),
                new Page("INSTAGRAM_PAGE #26", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "telecommunication",
                "competitive programming",
                "IoT",
                "building",
                "materials",
                "C++",
                "electronics",
        };

        instagramPages[1].pageAttributes = new String[]{
                "react",
                "backend",
                "signals",
                "microprocessor",
                "electromagnetics",
                "robotics",
                "biochemicals",
        };

        instagramPages[2].pageAttributes = new String[]{
                "physical chemistry",
                "extraction of elements",
                "building",
                "embedded systems",
                "science",
                "dbms",
                "wireless communication",
        };

        instagramPages[3].pageAttributes = new String[]{
                "arduino",
                "frontend",
                "machine drawing",
                "environmental science",
        };

        instagramPages[4].pageAttributes = new String[]{
                "implantable devices",
                "software",
                "logic gates",
                "control systems",
                "solid mechanics",
                "IoT",
                "operating systems",
                "biochemicals",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #21", null),
                new Page("TWITTER_PAGE #3", null),
                new Page("TWITTER_PAGE #31", null),
                new Page("TWITTER_PAGE #14", null),
                new Page("TWITTER_PAGE #30", null),
                new Page("TWITTER_PAGE #26", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "communication",
                "solid mechanics",
                "operating systems",
                "physical chemistry",
        };

        twitterPages[1].pageAttributes = new String[]{
                "control systems",
                "chemistry",
                "operating systems",
                "dbms",
                "electronics",
        };

        twitterPages[2].pageAttributes = new String[]{
                "physical chemistry",
                "data structures",
                "thermodynamics",
                "signals",
                "software",
                "frontend",
        };

        twitterPages[3].pageAttributes = new String[]{
                "science",
                "mathematical equations",
                "environmental science",
                "operating systems",
                "dynamics",
                "networking",
                "artifical intelligence",
                "competitive programming",
        };

        twitterPages[4].pageAttributes = new String[]{
                "chemistry",
                "solidworks",
                "embedded systems",
                "surveying",
                "science",
                "materials",
                "software",
        };

        twitterPages[5].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[37] = new Student(STUDENT_NAMES[37], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #30", null),
                new Page("FACEBOOK_PAGE #24", null),
                new Page("FACEBOOK_PAGE #18", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "network analysis",
                "control systems",
                "machine learning",
                "power circuits",
                "mathematical equations",
                "building",
                "logic gates",
        };

        facebookPages[1].pageAttributes = new String[]{
                "data structures",
                "programming",
                "material composition",
                "wireless communication",
        };

        facebookPages[2].pageAttributes = new String[]{
                "network analysis",
                "surveying",
                "dynamics",
                "electric circuits",
                "android",
                "data structures",
                "IoT",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #28", null),
                new Page("INSTAGRAM_PAGE #21", null),
                new Page("INSTAGRAM_PAGE #17", null),
                new Page("INSTAGRAM_PAGE #2", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "robotics",
                "communication",
                "power circuits",
                "solidworks",
                "network analysis",
                "computer",
                "operating systems",
        };

        instagramPages[1].pageAttributes = new String[]{
                "power circuits",
                "automation",
                "physical chemistry",
                "electric circuits",
                "robotics",
                "data science",
        };

        instagramPages[2].pageAttributes = new String[]{
                "building",
                "network analysis",
                "architecture",
                "react",
                "chemistry",
                "signals",
        };

        instagramPages[3].pageAttributes = new String[]{
                "engineering design",
                "networking",
                "python",
                "analog circuits",
                "materials",
                "machine drawing",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #5", null),
                new Page("TWITTER_PAGE #2", null),
                new Page("TWITTER_PAGE #30", null),
                new Page("TWITTER_PAGE #26", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "microprocessor",
                "C++",
                "logic gates",
                "implantable devices",
        };

        twitterPages[1].pageAttributes = new String[]{
                "science",
                "digital systems",
                "extraction of elements",
                "chemistry",
                "arduino",
                "embedded systems",
                "logic gates",
        };

        twitterPages[2].pageAttributes = new String[]{
                "chemistry",
                "solidworks",
                "embedded systems",
                "surveying",
                "science",
                "materials",
                "software",
        };

        twitterPages[3].pageAttributes = new String[]{
                "data structures",
                "robotics",
                "digital circuits",
                "engineering design",
                "signals",
                "network analysis",
                "architecture",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[38] = new Student(STUDENT_NAMES[38], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);

        facebookPages = new Page[]{
                new Page("FACEBOOK_PAGE #25", null),
                new Page("FACEBOOK_PAGE #21", null),
                new Page("FACEBOOK_PAGE #27", null),
                new Page("FACEBOOK_PAGE #10", null),
                new Page("FACEBOOK_PAGE #14", null),
                new Page("FACEBOOK_PAGE #23", null),
        };

        facebookPages[0].pageAttributes = new String[]{
                "C++",
                "engineering design",
                "IoT",
                "automation",
        };

        facebookPages[1].pageAttributes = new String[]{
                "artifical intelligence",
                "signals",
                "digital systems",
                "building",
                "data science",
                "environmental science",
        };

        facebookPages[2].pageAttributes = new String[]{
                "digital circuits",
                "digital systems",
                "control systems",
                "signals",
        };

        facebookPages[3].pageAttributes = new String[]{
                "microcontroller",
                "dynamics",
                "solidworks",
                "dbms",
                "polymers",
                "competitive programming",
        };

        facebookPages[4].pageAttributes = new String[]{
                "solid mechanics",
                "JAVA",
                "finite element analysis",
                "materials",
                "building",
                "react",
        };

        facebookPages[5].pageAttributes = new String[]{
                "surveying",
                "environmental science",
                "electric circuits",
                "competitive programming",
                "CAD",
                "physical chemistry",
        };

        instagramPages = new Page[]{
                new Page("INSTAGRAM_PAGE #19", null),
        };

        instagramPages[0].pageAttributes = new String[]{
                "digital circuits",
                "react",
                "logic gates",
                "thermodynamics",
                "embedded systems",
                "electronics",
                "microprocessor",
        };

        twitterPages = new Page[]{
                new Page("TWITTER_PAGE #7", null),
        };

        twitterPages[0].pageAttributes = new String[]{
                "networking",
                "wireless communication",
                "solidworks",
                "extraction of elements",
        };

        physicsMarks = 67;
        chemistryMarks = 71;
        mathsMarks = 75;
        cseMarks = 56;

        students[39] = new Student(STUDENT_NAMES[39], facebookPages, instagramPages, twitterPages, physicsMarks, chemistryMarks, mathsMarks, cseMarks);
    }
}