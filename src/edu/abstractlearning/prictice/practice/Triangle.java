package edu.abstractlearning.prictice.practice;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0)
            throw new IllegalArgumentException("三角形边长不能小于0");
        if (a+b<=c||a+c<=b||b+c<=a)
            throw new IllegalArgumentException("三角形边长不是有效边长");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
    @Override
    public void displayInfo(){
        System.out.println("Area is "+calculateArea()+"\nPerimeter is "+calculatePerimeter());
    }
}
