package _string;

import _object.Book;

public class StringTest2 {

    public static void main(String[] args) {

        // 스트링 객체는 불변이다!
        String str1 = new String("Hello ");
        String str2 = new String("World ");

//        Book book = new Book(1, "1", "Kim");
//        //_string2
//        System.out.println(str1.toString());
//        System.out.println(book.toString());
//
//        // 원래 객체의 메모리 주소를 확인하는 방법??
//        int addressStr1 = System.identityHashCode(str1);
//        int addressStr2 = System.identityHashCode(str2);
//        System.out.println("addressStr1 : " + addressStr1);
//        System.out.println("addressStr2 : " + addressStr2);

        // 문자열 연결 기능 호출
        System.out.println("고유주소 확인 : " + System.identityHashCode(str1));
        str1 = str1.concat(str2);
        // 원개 객체 주소가 생성되어있고 내부변수값이 변경된다면
        // String 클래스는 수정되지 않고 불변이다
        // 즉, 수정이 된다면, 새로운 String 클래스를 만드는 동작으로 돌아감
        System.out.println("수정후 고유주소 확인 : " + System.identityHashCode(str1));

//        System.out.println("str1 문자열 출력해보자" + str1);
//        System.out.println(System.identityHashCode(str1));
//

    } // end of main
}
