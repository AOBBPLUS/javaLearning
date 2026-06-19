package edu.homework.No7;

public class Girl {
    private String name;

    public Girl() {}
    public Girl(String name) {
        this.name = name;
    }

    public void play(Pet pet) {
        System.out.println("Girl " + this.name);
        pet.eat();
        if(pet instanceof Cat cat){
            cat.catchMouse();
        }else if(pet instanceof Dog dog){
            dog.lookDoor();
        }
    }
}
