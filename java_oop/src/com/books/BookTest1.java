package com.books;

/**
 * Array test code practice
 */
public class BookTest1 {

    public static void main(String[] args) {

        // 배열 안 요소는 = primitive DT or reference DT
        // CREATE
        Book[] books = new Book[10]; // Book DT 담을수있는 array declare / index 0 ~ 9
        books[0] = new Book("플러터 UI 실전", "김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
        books[2] = new Book("Go as a River", "Paulo Coelho");
        books[3] = new Book("리딩으로 리드하라", "이지성");
        books[4] = new Book("Sapience", "Yuval Noah Harari");
        books[9] = new Book("홍길동전", "허균");

        // READ
        String title9 = books[9].getTitle();
        String author9 = books[9].getAuthor();
        System.out.println("title of 9 : " + title9);
        System.out.println("author of 9 : " + author9);

        // 배열은 반복문과 함께 많이 쓰여진다
        // CAUTION ! 배열의 길이와 안의 ELEMENTS 는 꼭 가득 차 있는 것은 아니다.
        for (int i = 0; i < books.length; i++) {
            // !!! DEFENSIVE CODE !!!
            // IF element is not null, print
            if (books[i] != null) {
                // print when not null
                System.out.println(books[i].getTitle());
            } // end of if
        } // end of for

    } // end of main

} // end of class
