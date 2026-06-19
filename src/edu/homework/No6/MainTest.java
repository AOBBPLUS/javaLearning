package edu.homework.No6;

public class MainTest {
    public static void main(String[] args) {
        Hero hero = new Hero("嘻嘻");
        hero.run();
        new Hero("xx",new Cat("mao")).run();
        new Hero("yy",new Dog("狗")).run();
        new Hero("zz",new Eagle("🦅")).run();


    }
}
