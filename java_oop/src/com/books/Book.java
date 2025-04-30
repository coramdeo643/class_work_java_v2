package com.books;

/**
 * 도서 저장 및 관리 프로그램 만들기
 * C R U D
 */
public class Book {

    private String title;
    private String author;
    private int totalPage;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
//        this.title = title;
//        this.author = author;
        this(title, author);
        this.totalPage = totalPage;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    // setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // method
    public void showInfo() {
        System.out.println("=== ℹ\uFE0F I N F O R M A T I O N ℹ\uFE0F ===");
        System.out.println("Title is : " + title);
        System.out.println("Author is : " + author);
        System.out.println("Total Page is : " + totalPage);
    }


} // end of class
