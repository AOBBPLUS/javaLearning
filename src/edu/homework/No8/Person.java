package edu.homework.No8;

public class Person {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public Person() {
    }
    public Person(String name, int age,char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void eat(){}

}
