package cho04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * JDBC 연습, 메서드 분리 연습
 */
public class CafeMenuManager {
    private static final String URL = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PWD = "asd1234";

    // 메뉴 추가 static method
    public static void insertMenu(String name, int price, String category) {
        // main >> insertMenu('Americano', 2000, 'Coffee');
        // mysql >> insert into menu(name, price, category) values('Americano', 2000, 'Coffee');
        try (Connection connection = DriverManager.getConnection(URL,USER,PWD)) {
            String sql = "insert into menu(name, price, category) values(?, ?, ?) ";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, price);
            pstmt.setString(3, category);
            int rowsInsertedCount = pstmt.executeUpdate(); // 쿼리 실행(Insert, update, delete)
            System.out.println(rowsInsertedCount + " 개 메뉴 추가 성공!");

        } catch (Exception e) {
            System.err.println("Error inserting menu" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 테스트 해보기
        insertMenu("Today's coffee" , 2000, "Coffee");
    }
}
