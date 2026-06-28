package edu.packageclass;

import java.math.BigInteger;

public class MainTest {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(1);
        int i = integer.intValue();
        Integer integer2 = 100;
        Integer integer3 = 100;
        System.out.println(integer2 == integer3); //true，地址相同
        Integer integer4 = 200;
        Integer integer5 = 200;
        System.out.println(integer4 == integer5); //false，地址不同
        BigInteger bigInteger = new BigInteger("8");
        System.out.println(bigInteger.toString(2));
    }
}
