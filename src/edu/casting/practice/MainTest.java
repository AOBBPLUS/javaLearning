package edu.casting.practice;

public class MainTest {
    public static void main(String[] args) {
        Vehicle car =  new Car();
        Vehicle airPlane = new Airplane();
        car.move();
        airPlane.move();
        if(car instanceof Vehicle){
            Car car2 = (Car)car;
            car2.move();
        }
        if(airPlane instanceof Airplane){
            Airplane airplane2 = (Airplane)airPlane;
            airplane2.move();
        }

    }
}
