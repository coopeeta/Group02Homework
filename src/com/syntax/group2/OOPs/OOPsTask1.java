package com.syntax.group2.OOPs;
public class OOPsTask1 {
}
/*
    Create an Interface 'Shape' with undefined methods
    as calculateArea and calculatePerimeter. Create 2
    classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code.
 */
interface Shape {

    void calculateArea(int lengthOrRadius);

    void calculatePerimeter(int lengthOrRadius);
}

class Circle implements Shape {

    @Override
    public void calculateArea(int lengthOrRadius) {
        System.out.println("Circle Area = " + Math.PI * lengthOrRadius * lengthOrRadius);
    }

    @Override
    public void calculatePerimeter(int lengthOrRadius) {
        System.out.println("Circle Circumference = " + 2 * Math.PI * lengthOrRadius);
    }
}

class Square implements Shape {
    @Override
    public void calculateArea(int lengthOrRadius) {
        System.out.println("Square Area = " + lengthOrRadius * lengthOrRadius);
    }

    @Override
    public void calculatePerimeter(int lengthOrRadius) {
        System.out.println("Square Perimeter = " + 4 * lengthOrRadius);
    }
}

class ShapeTester {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.calculateArea(9);
        circle.calculatePerimeter(9);

        Square square = new Square();
        square.calculateArea(9);
        square.calculatePerimeter(9);

    }
}