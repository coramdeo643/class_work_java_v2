package _object;

// import java.lang.Object;
// import java.lang.*;
// java.lang.* 패키지도 자동으로 넣어줌

/**
 * Object 최상위 클래스에 대한 이해
 * 기본적으로 Object 클래스 상속 받음,
 * java 는 Object 클래스(모든 클래스의 최상위 클래스)를 제외하고,
 * 단일 상속만을 제공!
 */
// public class Book extends Object{
public class Book {

    private int bookTypeId;
    private String title;
    private String author;

    public Book(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        // 재정의 해보자
        if (obj instanceof Book) {
            // this = book1, obj = Book
            // 재정의
            // Book type 맞다면 추가적으로, 제목이 같다면, 같은 책으로 판단
            if (this.title.equals(((Book) obj).title) && this.author.equals(((Book) obj).author)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // equals() method 재정의 할때 hashcode() method 재정의 해야
    // 의도치않은 동작을 막을수있음!

    @Override
    public int hashCode() {
        // hashCode --> 이 객체의 고유한 정수값을 만들어서 독립적인 녀석이라는 것을 보장하는 정수값

        return bookTypeId;
    }


    // showInfo
//    @Override
//    public String toString() {
//        return "title : " + title + " , " + "author : " + author;
//    }

    // test code
    public static void main(String[] args) {

        // What if?
        // 물리적 객체 주소값은 다르지만 equals() method 재정의해서
        // 논리적으로 책이름과 저자이름이 같으면 같은 녀석으로 보게
        // 프로그램을 만들어달라는 요청?.

        // 책제목과 그리고 저자이름이 같다면 논리적으로 같은 책으로 판별
        Book book1 = new Book(1,"Demian", "Hermann Hesse");
        Book book2 = new Book(1, "Demian", "Hermann Hesse");
        Book book3 = new Book(2, "Java", "Kim");
        Book book4 = new Book(1, "Demian", "Paulo Co");

        String str1 = new String("데미안");
        
        System.out.println(book1.toString()); // 이 객체의 주소값을 반환
        System.out.println(book2.toString()); // 이 객체의 주소값을 반환

        boolean result1 = book1.equals(book2);
        boolean result2 = book1.equals(str1);
        boolean result3 = book1.equals(book3);
        boolean result4 = book1.equals(book4);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

    } // end of main
} // end of class
