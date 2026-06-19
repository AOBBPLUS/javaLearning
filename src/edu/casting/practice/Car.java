package edu.casting.practice;

public class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("汽车行驶。");
    }
    public void honk(){
        System.out.println("鸣笛。");
    }
}
