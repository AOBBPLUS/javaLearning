package edu.homework.No18;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(getJavaCount("Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"));
    }
    public static  int getJavaCount(String input)
    {
        final String str ="Java" ;
        int count=0;
       while(input.indexOf(str) != -1){
           System.out.println(input.indexOf(str));
           System.out.println(input);
           count++;
           input = input.substring(input.indexOf(str)+str.length());
       }
       return count;
    }
}
