package edu.casting;

public class MainTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        Animal dog = new Dog();
        if(cat instanceof Cat) {
            Cat c = (Cat) cat;
            c.eat();
        }
        if(dog instanceof Cat) {
            Cat d = (Cat) dog;
            d.eat();
        }

    }
}
