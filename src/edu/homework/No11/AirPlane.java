package edu.homework.No11;

public class AirPlane extends Machine implements CanFly {
    private final String model;
    private final double flySpeed;
    public AirPlane(String model, double flySpeed) {
        this.model = model;
        this.flySpeed = flySpeed;
    }
    @Override
    public void work() {
        System.out.println("正在飞行,速度为"+flySpeed+"km/h");
    }
    @Override
    public void speed() {
        System.out.println("speed:"+flySpeed);
    }
    @Override
    public String toString(){
        return "AirPlane [model=" + model + ", flySpeed=" + flySpeed + "]";
    }
}
