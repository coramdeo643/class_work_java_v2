package collections;

import java.util.HashMap;

public class BookMapAddSystem {
    private HashMap<String, Book> bookHashMap;

    public BookMapAddSystem() {
        bookHashMap = new HashMap<>();
    }

    // 저장하는 메서드
    public void addBooks(String title, String author) {
        bookHashMap.put(title, new Book(title, author));
    }

    // 출력하는 메서드(책 제목 + 저자)
    public void printBooks() {
        for (Book b : bookHashMap.values()) {
            System.out.println(b.toString());
        }
    }

    public static void main(String[] args) {
        BookMapAddSystem BMAS = new BookMapAddSystem();
        BMAS.addBooks("Philosopher's Stone", "J.K.Rowling");
        BMAS.addBooks("Chamber of Secret", "J.K.Rowling");
        BMAS.addBooks("Prisoner of Azkaban", "J.K.Rowling");
        BMAS.addBooks("the Goblet of Fire", "J.K.Rowling");

        BMAS.printBooks();
    }
}

// DT declare
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book { " +
                "title : '" + title + '\'' +
                ", author : '" + author + '\'' +
                " } ";
    }
}