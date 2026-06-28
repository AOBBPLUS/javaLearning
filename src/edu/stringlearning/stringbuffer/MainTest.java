package edu.stringlearning.stringbuffer;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println(getStringBuffer());
    }
    public static String getString(){
        String str = "";
       long current =  System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str += i;
        }
        System.out.println("耗时："+(System.currentTimeMillis()-current));
        return str;
    }
    public static StringBuffer getStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        long current =  System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append(i);
        }
        System.out.println("耗时："+(System.currentTimeMillis()-current));
        return stringBuffer;
    }
}
