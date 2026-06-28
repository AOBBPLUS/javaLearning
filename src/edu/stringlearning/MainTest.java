package edu.stringlearning;

public class MainTest {
    public static void main(String[] args) {
        String s = new String("abc");
//        System.out.println(s);
        String a=  new String(new char[]{'a','b','c'});
        String a1=  new String(new byte[]{97,98,99});
        String str = "abc";
//        System.out.println(s==str);
        String s1 = new String("   ");
//        System.out.println(s1);
        System.out.println("xx".compareToIgnoreCase("1"));
    }
}
