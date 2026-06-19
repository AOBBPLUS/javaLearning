package edu.homework.No5;

public class MainTes {
    public static void main(String[] args) {
        showEat (new Cat());
        showEat (new Dog());
        showEat(new Eagle());

    }
    public static void showEat(Animal animal) {
        animal.eat();
    }

}
