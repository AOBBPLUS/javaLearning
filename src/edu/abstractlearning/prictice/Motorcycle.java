package edu.abstractlearning.prictice;

public class Motorcycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("摩托启动。");
    }

    @Override
    public void stop() {
        System.out.println("摩托停止。");
    }
}
