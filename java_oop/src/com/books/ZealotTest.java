package com.books;

import com.startcraft_v01.Zealot;

public class ZealotTest {
    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5];
        zealots[0] = new Zealot("Tim cruise");
        zealots[1] = new Zealot("Tam cruise");
        zealots[3] = new Zealot("Tom cruise");

        // zealots[0].showInfo();
        for (int i = 0; i < zealots.length; i++) {
            if (zealots[i] != null) {
                zealots[i].showInfo();
            } // end of if
        } // end of for


    } // end of main
} // end of class
