package edu.abstractlearning.prictice.practice;

public abstract class Shape {
//    计算面积
    public abstract double calculateArea();
//    计算周长
    public abstract double calculatePerimeter();
    public void displayInfo(){
        System.out.println("图形信息。");
    }
}
