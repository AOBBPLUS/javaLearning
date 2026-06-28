package edu.homework.No13;

import java.util.Random;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        String code="";
        StringBuilder sb = new StringBuilder();
        do {
            code = getString();
            System.out.println("当前验证码是："+code);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入验证码：");
            sb.replace(0, sb.length(), scanner.next());
        }while(!checkCode(code, sb.toString()));
        System.out.println("验证成功！");
    }
    public static Boolean checkCode(String code, String input) {
        return code.compareToIgnoreCase(input) == 0;
    }
    public static String getString(){
        final StringBuilder s = new StringBuilder("0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm");
        StringBuilder s2 = new StringBuilder("");
        for (int i = 0; i<4; i++) {
            Random index = new Random();
            int a = index.nextInt(s.length());
            s2.append(s.charAt(a));
        }
        return s2.toString();
    }

}
