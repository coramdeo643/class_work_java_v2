package collections;

import java.util.HashMap;

public class BookMapAddSystem {
    private HashMap<String, Book> bookHashMap;

    public BookMapAddSystem() {
        bookHashMap = new HashMap<>();
        //bookHashMap.put("Philosopher's Stone", new Book("Philosopher's Stone", "J.K.Rowling", 2001));
    }

    // 저장하는 메서드
    public void addBooks(String title, String author, int year) {
        bookHashMap.put(title, new Book(title, author, year));

    }

    // 출력하는 메서드(책 제목 + 저자)
    public void printBooks() {
        System.out.println("List of all the books : ");
        for (Book b : bookHashMap.values()) {
            System.out.println(b.toString());
        }
    }

    public void countBooks() {
        System.out.println("Total numbers of the books : " + bookHashMap.size());
    }

    public static void main(String[] args) {
        BookMapAddSystem bookMAS = new BookMapAddSystem();
        bookMAS.addBooks("Philosopher's Stone", "J.K.Rowling", 2001);
        bookMAS.addBooks("Chamber of Secret", "J.K.Rowling", 2002);
        bookMAS.addBooks("Prisoner of Azkaban", "J.K.Rowling", 2004);
        bookMAS.addBooks("Goblet of Fire", "J.K.Rowling", 2005);
        bookMAS.addBooks("Order of the Phoenix", "J.K.Rowling", 2007);
        bookMAS.addBooks("Half-Blood Prince", "J.K.Rowling", 2009);
        bookMAS.addBooks("Deathly Hallows", "J.K.Rowling", 2010);

        bookMAS.printBooks();
        bookMAS.countBooks();

    }
}

// DT declare
class Book {
    String title;
    String author;
    int year;
    int view_count;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}