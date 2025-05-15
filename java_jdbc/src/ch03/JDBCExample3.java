package ch03;

import java.sql.*;

public class JDBCExample3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // Set 이라서 while 사용

        // try{} catch(){}
        // >> try(){} catch(){}
        try (
                Connection conn1 = DriverManager.getConnection(url,user,pwd);
                PreparedStatement pstmt1 = conn1.prepareStatement("select * from tb_student");
                ResultSet rs1 = pstmt1.executeQuery();
        ) {
            System.out.println("DB Connected");
            while (rs1.next()) {
                String name = rs1.getString("name");
                int age = rs1.getInt("age");
                System.out.println("| name = " + name + " | age = " + age);
            }
        } catch(Exception e){
        }
    }
}
