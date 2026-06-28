package edu.homework.No12;

public class Rabbit extends Animal implements Eat{
    public Rabbit(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
