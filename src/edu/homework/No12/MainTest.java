package edu.homework.No12;

public class MainTest {
    public static void main(String[] args) {
        Animal dog = new Dog(1, "🐕");
        Animal frog = new Frog(2, "青蛙");
        Animal rabbit = new Rabbit(3, "🐇");
        showInfo(dog);
        showInfo(frog);
        showInfo(rabbit);
    }
    public static void showInfo(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.eat();
            dog.swim();
        }else if (animal instanceof Frog frog) {
            frog.eat();
            frog.swim();
        }else if (animal instanceof Rabbit rabbit) {
            rabbit.eat();
        }
    }
}
