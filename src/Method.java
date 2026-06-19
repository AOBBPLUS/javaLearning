public class Method {
    public static void main(String[] args) {
       for (int i = 1; i <= 10; i++) {
           if(i==5){
               continue;
           }
           System.out.println(i);
       }
        System.out.println(getAbsoluteValue(-123.7));
    }
    public static double getAbsoluteValue(double num) {
        return num>0?num:0-num;
    }
//    public static int getAbsoluteRoundValue(double num) {
//        return num>0?num:(0-num);
//    }

}
