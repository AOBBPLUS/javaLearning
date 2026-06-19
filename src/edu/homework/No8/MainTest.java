package edu.homework.No8;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        showEating(new Chinese("xx",20,'女'));
        showEating(new English("yy",20,'女'));
    }
    public static void showEating(Person person) {
        person.eat();
        if(person instanceof Chinese chinese){
            chinese.shadowBoxing();
        } else if (person instanceof English english) {
            english.horseRiding();
        }
    }
}
