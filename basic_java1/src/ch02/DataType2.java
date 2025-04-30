package ch02;

/**
 * 문자 데이터 타입
 * char 2 byte (16)
 */
public class DataType2 {
    // entry
    public static void main(String[] args) {

        // for only one character

        char charBox;
        charBox = 'A'; // 'A' = 문자타입, "AAA" = 문자열
        System.out.println(charBox);

        char alphabetA = 'A';
        char alphabetB = 'B';
        char alphabetBox = alphabetA;
        System.out.println(alphabetBox);

        // 더 많은 글자를 담고 싶으면, 문자열 사용
        String temp = "안녕반가워";
        System.out.println(temp);

    } // end of main
} // end of class
