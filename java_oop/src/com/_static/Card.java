package com._static;

// Credit card
public class Card {

    private int cardNum;
    private String name;

    static int cardSerialNum = 10001;

    public Card(String name) {
        this.name = name;
        cardNum = cardSerialNum;
        cardSerialNum++;
    }

    public int getCardNum() {
        return cardNum;
    }

    // main entry
    public static void main(String[] args) {
        Card card1 = new Card("A");
        Card card2 = new Card("B");
        Card card3 = new Card("C");
        Card card4 = new Card("D");

        System.out.println("A = " + card1.getCardNum());
        System.out.println("B = " + card2.getCardNum());
        System.out.println("C = " + card3.getCardNum());
        System.out.println("D = " + card4.getCardNum());
    }

} // eoc
