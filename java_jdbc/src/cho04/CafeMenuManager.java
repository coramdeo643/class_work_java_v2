package cho04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

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
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
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

    // Price update method
    // update menu set price = 3000 where name = "Today's coffee";
    public static void updateMenuPrice(int price, String name) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "update menu set price = ? where name = ? ";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, price);
            pstmt.setString(2, name);
            int rowsUpdatedCount = pstmt.executeUpdate(); // 쿼리 실행(Insert, update, delete)
            System.out.println(rowsUpdatedCount + " 개 메뉴 가격 수정 성공!");
        } catch (Exception e) {
            System.err.println("Error updating price" + e.getMessage());
            e.printStackTrace();
        }
    }

    // Update menu name
    public static void updateMenuName(String changedName, String name) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "update menu set name = ? where name = ? ";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, changedName);
            pstmt.setString(2, name);
            int rowsUpdatedCount = pstmt.executeUpdate(); // 쿼리 실행(Insert, update, delete)
            System.out.println(rowsUpdatedCount + " 개 메뉴 이름 수정 성공!");
        } catch (Exception e) {
            System.err.println("Error updating price" + e.getMessage());
            e.printStackTrace();
        }
    }

    // delete menu
    public static void deleteMenu(String name) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "delete from menu where name = ? ";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            int rowsUpdatedCount = pstmt.executeUpdate(); // 쿼리 실행(Insert, update, delete)
            System.out.println(rowsUpdatedCount + " 개 메뉴 삭제 성공!");
        } catch (Exception e) {
            System.err.println("Error deleting price" + e.getMessage());
            e.printStackTrace();
        }
    }

    // select all menu
    public static void selectAllMenu() {
        // 반드시 쿼리 확인하고 복사붙여넣기 하기
        // >> 그리고 메서드 파라미터 결정
        // >> 필요 코드 구현 및 테스트
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "select * from menu ";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("| name : " + rs.getString("name")
                        + " | price : " + rs.getInt("price")
                        + " | category : " + rs.getString("category") + " |");
            }
            System.out.println("전 메뉴 조회 성공!");
        } catch (Exception e) {
            System.err.println("Error selecting all menu" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 테스트 해보기
        // insertMenu("Espresso" , 1000, "Coffee");
        // updateMenuPrice(3000, "Today's coffee");
        // updateMenuName("Brewed coffee", "Today's coffee");
        // deleteMenu("Today's coffee");
        // selectAllMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 카페 메뉴 관리 시스템 ===");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 가격 수정");
            System.out.println("3. 메뉴 삭제");
            System.out.println("4. 메뉴 목록 조회");
            System.out.println("5. 종료");
            System.out.print("선택 (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            // switch 사용해서 동작 흐름 만들어 보기
            switch (choice) {
                case 1:
                    System.out.print("메뉴 이름 : ");
                    String name = scanner.nextLine();
                    System.out.print("메뉴 가격 : ");
                    int price = scanner.nextInt();
                    // 버그(정수값)
                    scanner.nextLine(); // 버퍼 비우기
                    System.out.println("메뉴 카테고리 : ");
                    String category = scanner.nextLine();
                    insertMenu(name, price, category);
                    break;
                case 2:
                    System.out.print("수정할 메뉴 이름 : ");
                    String updatedName = scanner.nextLine();
                    System.out.print("수정할 메뉴 가격 : ");
                    int newPrice = scanner.nextInt();
                    updateMenuPrice(newPrice, updatedName);
                    // scanner.nextLine(); // 버퍼 비우기
                    break;
                case 3:
                    System.out.print("삭제할 메뉴 이름 : ");
                    String deleteName = scanner.nextLine();
                    deleteMenu(deleteName);
                    break;
                case 4:
                    selectAllMenu();
                    break;
                case 5:
                    System.out.println("Program closed");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 1-5 사이 숫자 입력하세요");
            }
        }
    }
}
