package com.books;

import java.util.Scanner;

/**
 * 모든 프로그래밍의 기본은 CRUD
 */
public class MyBookStore {
    // TODO 샘플 데이터 삭제후 인덱스 번호 0 부터 시작
    static int currentBookIndex = 6;

    // main entry
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 배열 준비
        Book[] books = new Book[100];
        // books = null; // DELETE = no data
        boolean flag = true;

        // TODO 추후 삭제하기(책 데이터 저장받아서 계속 메모리에 넣도록)
        // Sample data 미리 만들어두기
        books[0] = new Book("플러터 UI 실전", "김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
        books[2] = new Book("Go as a River", "Paulo Coelho");
        books[3] = new Book("리딩으로 리드하라", "이지성");
        books[4] = new Book("Sapience", "Yuval Noah Harari");
        books[5] = new Book("홍길동전", "허균");

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        // 큰 뼈대부터 작성 습관 들이자
        // 문자열도 받을수있다 --> String n1 = sc.nextLine();
        while (flag) {
            System.out.println();
            System.out.println("\uD83D\uDCDA > > MENU < < ");
            System.out.println("1. Save 2. Search all 3. Search by title 4. Delete all 5. OFF");
            System.out.print("Your choice is : ");
            String selectedNumber = sc.nextLine();
            // 숫자 비교할때 ==
            // 문자열 비교할때 "문자열".equals("문자열") --> true or false
            // 문자열 비교 --> equals() method
            if (selectedNumber.equals(SAVE)) {
                System.out.println(" > > Save < < ");
                save(sc, books); // 동작

            } else if (selectedNumber.equals(SEARCH_ALL)) {
                System.out.println(" > > Search all < < ");
                readAll(books); // 동작

            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                System.out.println(" > > Search by title < < ");
                readByTitle(sc, books); // 동작

            } else if (selectedNumber.equals(DELETE_ALL)) {
                System.out.println(" > > Delete all < < ");
                deleteAll(books); // 동작

            } else if (selectedNumber.equals(END)) {
                System.out.println(" > > Program off < < ");
                flag = false; // while(false) 종료

            } else {
                System.out.println("Wrong number, Choose number from 1 to 5!");
            } // end of if

        } // end of while

    } // end of main

    // 저장하기 Save
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("> Save <");
        // 사용자에게 값을 받는다.
        System.out.print("책 제목을 입력하세요 : ");
        String title = scanner.nextLine();
        System.out.print("책 저자를 입력하세요 : ");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        // books 배열에 북 객체를 저장하는 코드
        // 인덱스 번호 어디까지 사용했는지에 대한 정보도 필요해서 static 으로 관리
        if (currentBookIndex > books.length) { // 배열 크기 보다 많아지면...
            System.out.println("No available space to save more");
            return;
        }
        books[currentBookIndex] = book;
        currentBookIndex++; // 함수 사용해서 저장할때마다 숫자 1씩 증가
        // 마지막에 사용한 인덱스 다음 인덱스에 새로 저장해야되요 아니면 계속 덮어쓰기됨
        System.out.println("New book [" + title + "] has successfully saved!");
    }

    // search all 전체 조회하기 함수 만들기
    public static void readAll(Book[] books) {
        System.out.println("> Read all <");
        int a = 0;
        for (int i = 0; i < books.length; i++) {
            // Defensive Code
            if (books[i] != null) {
                System.out.println((i + 1) + ". " + books[i].getTitle() + " by " + books[i].getAuthor());
                a++;
            } // end of if
        } // end of for
        System.out.println("Total " + a + " books are found;");
    }

    // search by title
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("> Read by title <");
        System.out.println("> Insert the title of book you want to look for <");
        // 문자열 기능중에 공백 제거 기능이 있음! .trim(); " " + 홍길동 + " " 앞뒤 공백 알아서 제거
        String title = scanner.nextLine();
        // 찾는 기능을 만들어줘야함
        // [] * 100 다 확인해봐야함
        boolean isFound = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title.trim())) { // .trim() 공백제거
                    System.out.println("There is " + books[i].getTitle() + " by " + books[i].getAuthor());
                    isFound = true;
                    break; // 찾았다면 출력되고 탈출.
                } // inner if
            } // outer if
        } // end of for
        if (!isFound) {
            System.out.println("There is no such book available");
        } // end of if
    }

    // delete all - 배열안에 담겨있는 Book() 전부 null 값처리
    public static void deleteAll(Book[] books) {
        System.out.println("> Deleted all the saved data <");
        // 전체 삭제 중
        // books = null; 인덱스 몇개인지 선언 초기화
        // books[0] ~ books[100] = null; 인덱스 마다 데이터 초기화
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        } // end of for
    }


} // end of class
// NullPointer