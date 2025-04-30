package com._static;

public class Card2 {

    // static variable :
    // 모든 Card2 객체가 공유하며
    // 고유번호를 생성하기 위해 사용가능
    private static int cardCounter = 1;

    // instance variable
    private final int cardId;
    private final String cardName;

    public Card2(String cardName) {
        this.cardName = cardName;
        this.cardId = cardCounter++;
    }
    
    // static method
    public static int getTotalCards() {
        // instance variable is not usable in the static method
        // bc instance variable is usable after 객체 생성
        // System.out.println("cardName = " + cardName);
        // static variable
        return cardCounter;
    }

    // instance method
    public void showInfo() {
        System.out.println(cardCounter);
        System.out.println("Serial number of " + cardName + " is " + cardId);
    }

    // main
    public static void main(String[] args) {
        // static variable is usable before 객체 생성
        // static method is usable before 객체 생성
        // How to use? with class name
        System.out.println(Card2.cardCounter); // = static variable
        System.out.println(Card2.getTotalCards()); // = static method
        
        // Card2 c1 = new Card2("URI card1");
        // System.out.println(c1.cardId);


    } // eom
} // eoc
