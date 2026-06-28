package edu.objectlearning;

public class MainTest {
    public static void main(String[] args) {
        Student xx = new Student("xx", 12);
        Student zz = new Student("xx", 12);
        Student yy = new Student("yy", 23);
        System.out.println(xx);

        System.out.println(yy);
        System.out.println(xx.equals(yy));
        System.out.println(xx.equals(zz));
        System.out.println(xx.hashCode());
    }
}
