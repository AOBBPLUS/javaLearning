package edu.abstractlearning.prictice.practice;

public class Rectangle extends Shape
{
    private double length;
    private double width;
    public Rectangle(double length, double width)
    {
        if(length < 0 || width < 0)
            throw new IllegalArgumentException("矩形宽高不能<0");
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length*width;
    }
    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }
    @Override
    public void displayInfo() {
        System.out.println("Area is "+calculateArea()+"\nPerimeter is "+calculatePerimeter());
    }
}
