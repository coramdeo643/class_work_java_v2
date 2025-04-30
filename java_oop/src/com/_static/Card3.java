package com._static;

public class Card3 {
    private static int cardCounter = 1;
    private final int cardId;
    private final String cardName;

    public Card3(String cardName) {
        this.cardId = cardCounter++;
        this.cardName = cardName;
    }
    public static int getTotalCards() {
        return cardCounter;
    }
    public void showInfo() {
        System.out.println(cardCounter);
        System.out.println("Serial number of " + cardName + " is " + cardId);
    }

    public static void main(String[] args) {
        System.out.println(Card3.cardCounter);
        System.out.println(Card3.getTotalCards());
        System.out.println("-");
        Card3 c3 = new Card3("a");
        c3.showInfo();
    }

}
