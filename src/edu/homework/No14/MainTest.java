package edu.homework.No14;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(statistics(new Scanner(System.in).nextLine()));

    }
    public static String statistics(String str) {
        int numCount = 0;
        int charCount = 0;
        for (char c : str.toCharArray()) {
                if(c >= 'a' && c <= 'z'||c >= 'A' && c <= 'Z') {
                    charCount++;
                } else if (c>'0'&&c<'9') {
                    numCount++;
                }
        }
        return "字母："+charCount+"个，数字："+numCount+"个。";
    }
}
