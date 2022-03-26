package com.syntax.group2.OOPs;
/*
    We have to calculate the average of marks obtained
    in three subjects by student A and by student B.
    Create   class   'Marks'   with   an   abstract   method
    'getPercentage' that will be returning the average
    percentage   of   marks.   Provide   implementation   of
    abstract   method   in   classes   'A'   and   'B'.   The
    constructor of student A takes the marks in three
    subjects as its parameters and the marks in four
    subjects as its parameters for student B. Test your
    code
 */
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double sub1, sub2, sub3;

    public A(double s1, double s2, double s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3) / 300 * 100;
    }
}

class B extends Marks {
    private double sub1, sub2, sub3, sub4;

    public B(double s1, double s2, double s3, double s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 400 * 100;
    }
}

class OOPsTask2 {
    public static void main(String[] args) {

        A a = new A(87, 84, 82);
        B b = new B(74, 77, 67, 70);

        double p1 = a.getPercentage();
        double p2 = b.getPercentage();

        System.out.println("Percentage of student A : " + p1);
        System.out.println("Percentage of student B : " + p2);
    }
}