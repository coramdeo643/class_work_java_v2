package com.array;

import java.util.Collections;
import java.util.Random;

public class PasswordRandom {
    // main
    public static void main(String[] args) {

        Random random = new Random();
        int[] pw1 = new int[4];
//        for (int i = 0; i < pw1.length; i++) {
//            pw1[i] = random.nextInt(8) + 1;
//            System.out.print(pw1[i] + " ");
//        }
//        System.out.println(" ");
        int[] pw2 = new int[4];
        int[] pw3 = new int[4];
        // char[] alpha = new char[26];

        System.out.println(random.nextInt(3)+1);
        // rand = {}

        System.out.println("=========================================");
        System.out.print("Your lucky password is : ");
//        for (int i = 0; i < pw2.length; i++) {
//            pw1[i] = random.nextInt(9) + 1;
//            pw2[i] = 65 + (random.nextInt(26));
//            pw3[i] = 97 + (random.nextInt(26));
//            System.out.print((char) pw3[i]);
//            System.out.print((char) pw2[i]);
//            System.out.print(pw1[i]);
//        }
//        // end of for
//        System.out.println();
        // yF3yK2mJ6dD6
        // int[] newPwd = pw2 + pw1 + pw3;

        char[] mPwd = new char[12];

        // a ~ z == 97 ~ 123
        for (int i = 0; i < 12; i++) {
            mPwd[i] = (char)(65 + (random.nextInt(26)));
        }
        System.out.printf(" [ ");
        for (int i = 0; i < mPwd.length ; i++) {
            System.out.printf( mPwd[i] + "" );
        }
        System.out.printf(" ]");





    } // end of main

} // end of class
