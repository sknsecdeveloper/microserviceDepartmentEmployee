package org.example.com;

public class DiamondProblemTest extends Parent1/*, Parent2*/ {

    public void process(){
        System.out.println("Processing from extending class");
    }

    public static void main(String[] args) {

        //DiamondProblemTest testObj = new Parent1();
        Parent1 parent1 = new DiamondProblemTest();
        parent1.process();
        //testObj.process();
       /* DiamondProblemTest test = new DiamondProblemTest();
        test.process();
        super.process()*/;

        /*DiamondProblemTest test = new Parent1();*/

    }

    public void test(){
        super.process();
    }
}

class Parent1 {
    public void process(){
        System.out.println("Processing Parent1");
    }
}

class Parent2 {
    public void process(){
        System.out.println("Processing Parent2");
    }
}

