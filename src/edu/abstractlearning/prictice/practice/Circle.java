package edu.abstractlearning.prictice.practice;

public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;
    public Circle(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException("圆的半径>0");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }
    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
    @Override
    public void displayInfo() {
        System.out.println("Area is "+calculateArea()+"\nPerimeter is "+calculatePerimeter());
    }
}
