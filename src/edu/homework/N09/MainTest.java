package edu.homework.N09;

public class MainTest {
    public static void main(String[] args) {
        animalHonk(new Bird());
        animalHonk(new Dog());

    }
    public static void animalHonk(Animal animal){
        animal.honk();
    }
}
