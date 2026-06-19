package edu.homework.No8;

public class Chinese extends Person{

    public Chinese(String name, int age,char sex) {
        super(name, age, sex);
    }
    @Override
    public void eat(){
        System.out.println("我是中国人，我喜欢吃饭!");
    }

    public  void shadowBoxing(){
        System.out.println(super.getName()+"在练习太极拳!");
    }

}
