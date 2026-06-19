package edu.homework.No6;

public class Eagle extends Pet{
    public Eagle(String name){
        super(name);
    }
    @Override
    public void follow(){
        System.out.println("🦅跟随");
    }

}
