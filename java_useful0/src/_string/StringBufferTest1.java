package _string;

public class StringBufferTest1 {
    // StringBuffer
    // Why? bc of string property
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");

        // new~
        StringBuffer buffer2 = new StringBuffer(str1);

        System.out.println("수정전 : " + System.identityHashCode(buffer2));
        // buffer1 에 값을 수정해보자. 문자어 변경
        buffer2.append(str2);
        buffer2.append(str2);
        System.out.println("수정후 : " + System.identityHashCode(buffer2));

        // 이전 버전은 hashCode(); 해당 객체의 유일성 보장하는 정수값
        // APU 8 버전에서는 buffer2.toString() 해야 값을 확인 가능
        System.out.println(buffer2);

        // StringBuffer DT -> String DT, to convert, .toString() method call!
        String result = buffer2.toString();

    }
}
