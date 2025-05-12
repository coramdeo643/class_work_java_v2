package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC; Java Database Connectivity
 * DB 접근 기술 = 자바로 DB에 접근
 */
public class JDBCExample {

    public static void main(String[] args) {

        // MySQL 8 버전 접근 하려고함
        // DB 접근 기술 = 정형화되어있음
        // 쓰다보면 외워진다, 일단 따라작성해보자
        // 어느 URL? ID? PW?

        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        // Rule 1. Connection 객체 힙 메모리에 올리기 위해서는
        // 리 약속된 DriverManager class 필요함
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully into the Database");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect into the Database");
        }


    } // end of main
} // end of class
