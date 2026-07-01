package edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MainTest {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动
            Connection conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root","weitian123456");
            Statement statement = conn.createStatement();
            String sql = "insert into dept(deptno,dname,loc) values (60,'yuwen','beijing')";
            int result = statement.executeUpdate(sql);//执⾏SQL语句并接收结果
            if(result == 1){
                System.out.println("Success");
            }
            PreparedStatement preparedStatement = conn.prepareStatement("select * from dept");
            statement.close();
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
