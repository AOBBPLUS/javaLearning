package edu.homework.No11;

public class MainTest {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane("波音", 700);
        airPlane.work();
        CanFly canFly = airPlane;
        canFly.speed();
        System.out.println(canFly.toString());
    }
}
