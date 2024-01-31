package org.example.com;

public class DiamondProblemSolutionTest implements Super1, Super2 {




    public static void main(String[] args) {

        DiamondProblemSolutionTest solutionTestObj = new DiamondProblemSolutionTest();
        solutionTestObj.process();

    }

    @Override
    public void process() {
        System.out.println("Processing from implementing class");
    }
}


interface Super1{

    public void process();
}

interface Super2{

    public void process();
}


