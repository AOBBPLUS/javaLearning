package edu.casting.practice;

public class Airplane extends Vehicle{

    @Override
    public void move(){
        System.out.println("飞机飞行。");
    }

    public void takeOff(){
        System.out.println("起飞。");
    }
}
