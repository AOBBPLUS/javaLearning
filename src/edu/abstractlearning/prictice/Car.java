package edu.abstractlearning.prictice;

public class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("汽车启动。");
    }
    @Override
    public void stop(){
        System.out.println("汽车停止。");
    }
}
