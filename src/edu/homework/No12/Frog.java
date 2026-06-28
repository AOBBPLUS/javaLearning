package edu.homework.No12;

public class Frog extends Animal implements Eat,Swim{
    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
