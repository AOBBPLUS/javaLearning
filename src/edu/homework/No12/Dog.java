package edu.homework.No12;

public class Dog extends Animal implements Eat,Swim{

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    @Override
    public void swim() {
        System.out.println("狗刨式游泳");
    }
}
