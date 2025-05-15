package ch02;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class qwe extends JFrame {

    private MyPanel myPanel;

    public qwe() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("MyPaintFrame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitLayout() {
        super.add(myPanel);
    }

    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            String str = "emp_no" ;
            g.drawString(str,100,100);
        }
    } // end of static inner class

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select e.emp_no, e.first_name, s.salary, t.title\n" +
                    "from employees as e\n" +
                    "inner join salaries as s on e.emp_no = s.emp_no\n" +
                    "inner join titles as t on e.emp_no = t.emp_no\n" +
                    "where t.title = 'Senior Engineer' and e.first_name like 'ram%' and s.salary > 100000;\n");
            while (rs.next()) {
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
        new qwe();
    } // end of main
} // end of class
