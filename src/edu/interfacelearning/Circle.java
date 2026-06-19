package edu.interfacelearning;

public class Circle implements Shape{
    private double radius;
    private final double PI = 3.14;
    public Circle(double radius){
        if(radius < 0)
            throw new IllegalArgumentException("radius cannot be negative");
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI * radius;
    }

    @Override
    public String getDescription() {
        return "半径为"+radius+"的圆，周长为"+getPerimeter()+"，面积为"+getArea();
    }
}
