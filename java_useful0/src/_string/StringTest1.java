package _string;

public class StringTest1 {
    // 변수
    // 생성자
    // 메서드 생성가능!

    // main entry
    public static void main(String[] args) {

        // Heap 메모리 안의, String pool 안에 저장
        // String pool 에 있는 문자열을 재활용하기 위해서! Recycle!
        String str1 = "문자열1";

        // Heap 메모리안에 저장
        // new 연산자 사용
        String str2 = new String("abc");
        String str3 = new String("abc");

        // 힙에 올라갔다 = 주소값을 가진다
        // 참조비교 : 각각의 객체의 주소값을 비교한다. 주소 == 주소
        System.out.println("str2 == str3 : " + (str2 == str3)); // false


        // 리터럴 방식
        // 문자열은 아주 많이 사용되는 데이터
        String str4 = "abc";
        String str5 = "abc";
        String str6 = "abc";

        System.out.println("str4 == str5 : " + (str4 == str5)); // true

        String str7 = str6 + " 안녕 ";
        System.out.println(str7);


    } // end of main
} // end of class
