package edu.homework.No6;

public class Dog extends Pet{
    public Dog(String name){
        super(name);
    }
    @Override
    public void follow() {
        System.out.println("🐕跟随");
    }
}
