package ch03;

import java.sql.*;

public class JDBCExample3 {
    public static void main(String[] args) {
        // MySQL 서버 접근하기위해서 - 주소,계정,비번 = url, user, pw
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        // 자바 -> MySQL 서버 접근하기 위한 준비물 :
        // JDBC 인터페이스를 보고 구현한 각 회사의 JDBC 구현 클래스들이 필요함
        // >> 해당 제품의 library 를 다운 받아서 우리 프로젝트 연결처리 필요
        Connection conn = null;
        // Statement 보다 보안 성능이 좋은 >> Prepared Statement
        PreparedStatement pstmt = null;
        // Statement stmt = null;
        ResultSet rs = null; // Set 이라서 while 사용

        // Class.forName("com.mysql.cj.jdbc.Driver");
        // java 4.0 이후 lib 등록시 자동으로 드라이버 load 되서 필요없음

        try {
            // 1. DB connect
            conn = DriverManager.getConnection(url, user,pwd);
            // 2. create Statement
            // stmt = conn.createStatement();
            // prepareStatement 생성 (미리 쿼리 만들어 줌 - 일부분만)
            pstmt = conn.prepareStatement("select * from tb_student where no = ? and age = ?");
            // pstmt.setInt(); ? 순서 기준으로 해당하는 데이터 타입을 명시
            pstmt.setString(1, "20170001");
            // scanner 이용 사용자 값 받아서 데이터 출력 가능
            pstmt.setInt(2, 25);
            // 3. 쿼리 만들고 실행요청 >> 수행후 ResultSet 객체 생성됨
            // rs = DriverManager.getConnection(url,user,pwd).createStatement().executeQuery("");
            // rs = stmt.executeQuery("select * from tb_student ");
            rs = pstmt.executeQuery();
            // 4. 결과(응용해서 프로그래밍처리)
            // 결과 추출방법(set 자료구조에서)
            while (rs.next()) {
                String no = rs.getString("no");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("| no = " + no + " | name = " + name + " | age = " + age + " |");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
