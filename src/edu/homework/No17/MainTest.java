package edu.homework.No17;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(arrToString(new int[]{}));
    }
    public static String arrToString(int[] array){
        StringBuilder str = new StringBuilder();
        if(array==null){
            return null;
        } else if (array.length==0) {
            return "[]";
        }else {
            for (int j : array) {
                str.append(j).append(",");
            }
        }
        return "[" + str.substring(0, str.length() - 1) + "]";
    }
}
