package edu.abstractlearning.prictice;

public class MainTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.start();
        car.stop();
        car.showInfo();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.showInfo();
    }
}
