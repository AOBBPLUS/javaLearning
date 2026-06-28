package edu.homework.No15;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(isSymmetry("1234321"));
        System.out.println(isSymmetry("123"));
    }
    public static boolean isSymmetry(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        return input.contentEquals(stringBuilder.reverse());
    }
}
