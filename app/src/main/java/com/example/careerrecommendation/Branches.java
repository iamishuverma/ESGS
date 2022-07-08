package com.example.careerrecommendation;

public class Branches {
    static final int NUMBER_OF_BRANCHES = 8;

    static final int CSE = 0;
    static final int IT = 1;
    static final int ECE = 2;
    static final int ELECTRICAL = 3;
    static final int MECHANICAL = 4;
    static final int CIVIL = 5;
    static final int CHEMICAL = 6;
    static final int METALLURGY = 7;

    static final String[] BRANCHES_ATTRIBUTES = new String[]{"computer",
            "programming",
            "data science",
            "machine learning",
            "competitive programming",
            "artifical intelligence",
            "android",
            "react",
            "python",
            "software",
            "C++",
            "JAVA",
            "algorithms",
            "information",
            "networking",
            "dbms",
            "frontend",
            "operating systems",
            "data structures",
            "backend",
            "electronics",
            "communication",
            "telecommunication",
            "IoT",
            "arduino",
            "signals",
            "logic gates",
            "microprocessor",
            "embedded systems",
            "robotics",
            "automation",
            "wireless communication",
            "electromagnetics",
            "power circuits",
            "digital circuits",
            "analog circuits",
            "electric circuits",
            "digital systems",
            "network analysis",
            "microcontroller",
            "control systems",
            "CAD",
            "engineering design",
            "solidworks",
            "dynamics",
            "thermodynamics",
            "CAM",
            "machine drawing",
            "surveying",
            "solid mechanics",
            "mathematical equations",
            "architecture",
            "building",
            "chemistry",
            "physical chemistry",
            "environmental science",
            "science",
            "materials",
            "finite element analysis",
            "material composition",
            "polymers",
            "biochemicals",
            "implantable devices",
            "extraction of elements"
    };

    static final String[] CSE_ATTRIBUTES = new String[]{"computer",
            "programming",
            "data science",
            "machine learning",
            "competitive programming",
            "artifical intelligence",
            "android",
            "react",
            "python",
            "software",
            "C++",
            "JAVA",
            "algorithms",
            "information",
            "networking",
            "dbms",
            "frontend",
            "operating systems",
            "data structures",
            "backend"
    };

    static final String[] IT_ATTRIBUTES = new String[]{"C++",
            "JAVA",
            "algorithms",
            "information",
            "networking",
            "dbms",
            "frontend",
            "operating systems",
            "data structures",
            "backend",
            "computer",
            "programming",
            "data science",
            "machine learning",
            "competitive programming",
            "artifical intelligence",
            "android",
            "react",
            "python",
            "software"
    };

    static final String[] ECE_ATTRIBUTES = new String[]{"electronics",
            "communication",
            "telecommunication",
            "IoT",
            "arduino",
            "signals",
            "logic gates",
            "microprocessor",
            "embedded systems",
            "robotics",
            "automation",
            "wireless communication",
            "mathematical equations"
    };

    static final String[] ELECTRICAL_ATTRIBUTES = new String[]{"electromagnetics",
            "power circuits",
            "digital circuits",
            "analog circuits",
            "electric circuits",
            "digital systems",
            "network analysis",
            "microcontroller",
            "control systems",
            "IoT",
            "arduino"
    };

    static final String[] MECHANICAL_ATTRIBUTES = new String[]{
            "CAD",
            "engineering design",
            "solidworks",
            "dynamics",
            "thermodynamics",
            "CAM",
            "machine drawing",
            "solid mechanics",
            "mathematical equations"
    };

    static final String[] CIVIL_ATTRIBUTES = new String[]{
            "CAD",
            "engineering design",
            "surveying",
            "solid mechanics",
            "mathematical equations",
            "architecture",
            "building"
    };

    static final String[] CHEMICAL_ATTRIBUTES = new String[]{
            "chemistry",
            "physical chemistry",
            "environmental science",
            "science",
            "materials",
            "polymers",
            "biochemicals"
    };

    static final String[] METALLURGY_ATTRIBUTES = new String[]{
            "finite element analysis",
            "material composition",
            "materials",
            "polymers",
            "biochemicals",
            "implantable devices",
            "extraction of elements"
    };

    static String[] getBranchAttributes(int branch)
    {
        String[] branchAttributes = new String[]{};

        switch (branch)
        {
            case CSE:   branchAttributes = CSE_ATTRIBUTES;
                        break;
            case IT:   branchAttributes = IT_ATTRIBUTES;
                        break;
            case ECE:   branchAttributes = ECE_ATTRIBUTES;
                        break;
            case ELECTRICAL:   branchAttributes = ELECTRICAL_ATTRIBUTES;
                        break;
            case MECHANICAL:   branchAttributes = MECHANICAL_ATTRIBUTES;
                        break;
            case CIVIL:   branchAttributes = CIVIL_ATTRIBUTES;
                        break;
            case CHEMICAL:   branchAttributes = CHEMICAL_ATTRIBUTES;
                        break;
            case METALLURGY:   branchAttributes = METALLURGY_ATTRIBUTES;
                        break;
        }

        return branchAttributes;
    }
}
