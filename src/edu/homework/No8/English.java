package edu.homework.No8;


public class English extends Person {

    public English(String name, int age,char sex) {
        super(name, age, sex);
    }

    @Override
    public void eat(){
        System.out.println("我是英国人，我喜欢吃三明治!");
    }

    public void horseRiding(){
        System.out.println(super.getName()+"在练习骑马！");
    }

}
