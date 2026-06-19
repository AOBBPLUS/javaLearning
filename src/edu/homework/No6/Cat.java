package edu.homework.No6;

public class Cat extends Pet{
    public Cat(String name){
        super(name);
    }
    @Override
    public void follow(){
        System.out.println("🐱跟随");
    }
}
