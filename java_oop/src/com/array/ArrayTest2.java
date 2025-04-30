package com.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        char[] alphabet = new char[26];

        // char 타입은 원래 정수값이다

        // encoding
        // 문자를 컴퓨터가 이해할수있는 숫자(코드값)로 바꾸는 과정
        int code1 = (int)'A'; // encode

        // decoding
        // 숫자(코드값)을 사람이 읽을수있는 문자로 바꾸는 과정
        char code2 = (char)66; // decode
        
        alphabet[0] = 'A';

        // 반복문 활용해서 알파벳 A ~ Z 까지 출력
//        for (int i = 65; i < 91; i++) {
//             System.out.print((alphabet[0] = (char)i));
//        } // end of for

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('a' + i);
        }
        System.out.println(" ");
        for(int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i]);
        }

    } // end of main
}
