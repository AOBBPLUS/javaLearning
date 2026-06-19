package edu.abstractlearning.prictice.practice;

public class MainTest {
    public static void main(String[] args) {
        Shape circle = new Circle(-5);
        Shape rectangle = new Rectangle(5,5);
        Shape triangle = new Triangle(5,5,5);
        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }
}
