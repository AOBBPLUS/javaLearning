package edu.interfacelearning;

public class Rectangle implements Shape {
    private double width;
    private double height;
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public String getDescription() {
        return width+"x"+height+"的矩形周长为"+getPerimeter()+"，面积为"+getArea();
    }

    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        if(width<=0||height<=0)
            throw new RuntimeException("矩形的宽高不能<=0");
        this.width = width;
        this.height = height;
    }
}
