package com.inheritance;

public class GoldCustomer extends Customer {

    public GoldCustomer() {
        super();
    }

    public int calcPrice(int bP) {
        double bR = 0.2;
        bP *= bR;
        return bP;

    }

} // end of class
