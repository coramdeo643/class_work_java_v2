package _object;

public class EBook {
    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() method 재정의

    @Override
    public String toString() {
        return "title : " + title + " / " + "author : " + author;
    }

    // equals() method 재정의

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            if (this.title.equals(((EBook) obj).title) &&this.author.equals(((EBook)obj).author)){
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }

    // hashCode() method 재정의

    @Override
    public int hashCode() {
        return bookTypeId * 1000;
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "Demian", "Hermann Hesse");
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
    }

}
