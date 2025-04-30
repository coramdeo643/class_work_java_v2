package _string;

public class StringTest3 {
    // main entry
    public static void main(String[] args) {

        // .length()
        String str1 = "Count how many my letters are";
        int countStr1 = str1.length();
        System.out.println("countStr1 = " + countStr1); // 29

        // .replace() method
        // : 문자열 내에서 특정 문자열을 다른 문자나 문자열로 교체

        String str2 = "Hello World";
        String str3 = str2.replace("World", "Java");
        System.out.println("str3 = " + str3); // Hello Java

        // .substring() method
        // : 문자열 일부분을 추출, 새로운 문자열을 반환
        // 두가지 오버로딩 된 메서드 제공
        // startIndex (included), endIndex (not included), starting from Index 0
        String str4 = str2.substring(0,5);
        System.out.println("str4 = " + str4); // Hello
        

    } // end of main
}
