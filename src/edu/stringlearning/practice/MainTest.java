package edu.stringlearning.practice;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(getSingleChar("banana"));
//        login1();
        getNum("20250706SH0001");
    }

    public static void login(){
        final String USERNAME = "admin";
        final String PASSWORD = "123456";
        final int TIMES = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < TIMES; i++) {
            int times = TIMES-i-1;
            System.out.println("请输入用户名:");
            String username = sc.nextLine();
            if(!username.equals(USERNAME)){
                System.out.println(i!=2?"用户名输入错误，您还有"+times+"次机会":"账号被锁定，程序推出中......");
                if(i==2)
                    break;
                continue;
            }
            System.out.println("请输入密码:");
            String password = sc.nextLine();
            if(!password.equals(PASSWORD)){
                System.out.println(i!=2?"密码输入错误，您还有"+times+"次机会":"账号被锁定，程序推出中......");
                if(i==2)
                    break;
                continue;
            }
            System.out.println("欢迎admin");
            break;
        }
    }
    public static String getSingleChar(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if(result.indexOf(input.charAt(i)) == -1){
                result += input.charAt(i);
            }
        }
        return result;
    }
    public  static boolean checkLogin(String username,String email){
        if (username.isBlank()||email.isBlank()){
            return false;
        } else if (username.trim().length()<6||username.trim().length()>20) {
            return false;
        }else if (email.trim().indexOf("@")==-1||email.trim().indexOf(".")==-1) {
            return false;
        }
        username=username.trim().replace('_','-');
        String[] info=email.split("@");
        System.out.println("用户名："+username+"，邮箱个人信息："+info[0]+"，域名："+info[1]);
        return true;
    }
    public static void login1(){
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String email = "";
        do {
            System.out.println("请输入用户名：");
             username = scanner.nextLine();
            System.out.println("请输入邮箱：");
             email = scanner.nextLine();
        }while (!checkLogin(username,email));

    }
    public static void getNum(String input){

        final String SH = "SH";
        final String BJ = "BJ";
        final String START = "0001";

        String[] SHArr = input.split(SH);
        String[] BJArr = input.split(BJ);
        if(SHArr.length==2){
            System.out.println(SHArr[0]+"、"+SH+"、"+SHArr[1]);
        }else if(BJArr.length==2){
            System.out.println(BJArr[0]+"、"+BJ+"、"+BJArr[1]);
        }
    }
}
