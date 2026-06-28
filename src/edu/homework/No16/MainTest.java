package edu.homework.No16;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(isRight("50022820000812655"));
    }
   public static boolean isRight(String ID){
//       号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
       if(ID.charAt(0)==0||ID.length()!=18){
           System.out.println('1');
           return false;
       }
       for(int i=0;i<17;i++){
           if(ID.charAt(i)<'0'||ID.charAt(i)>'9'){
               System.out.println(i);
               return false;
           }
       }
       if(ID.charAt(ID.length()-1)!='X'&&(ID.charAt(ID.length()-1)<'0'||ID.charAt(ID.length()-1)>'9')){
           System.out.println('x');
           return false;
       }
       return true;
   }
}
