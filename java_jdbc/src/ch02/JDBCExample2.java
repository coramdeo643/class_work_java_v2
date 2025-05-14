package ch02;

import java.sql.*;

public class JDBCExample2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select e.emp_no, e.first_name, s.salary, t.title\n" +
                    "from employees as e\n" +
                    "inner join salaries as s on e.emp_no = s.emp_no\n" +
                    "inner join titles as t on e.emp_no = t.emp_no\n" +
                    "where t.title = 'Senior Engineer' and e.first_name like 'ram%' and s.salary > 100000;\n");
            while(rs.next()) {
                int emp_no = rs.getInt("emp_no");
                String first_name = rs.getString("first_name");
                int salary = rs.getInt("salary");
                String title = rs.getString("title");
                System.out.print("| emp_no = " + emp_no + " | ");
                System.out.print("first_name = " + first_name + " | ");
                System.out.print("salary = " + salary + " | ");
                System.out.print("title = " + title + " |\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
        }




    }
}
