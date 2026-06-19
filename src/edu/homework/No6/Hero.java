package edu.homework.No6;

public class Hero {
    private String name;
    private Pet pet;
    public Hero(String name) {
        this.name = name;
    }
    public Hero(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public void run(){
        System.out.println(name + " is running");
        if(pet != null){
            pet.follow();
        }

    }
}
