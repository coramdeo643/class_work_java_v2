package com.inheritance;

public class Customer {

    private int customerID;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;

    public Customer() {
    }

    public int calcPrice(int bP) {
        bonusRatio = 0.1;
        this.bonusPoint *= bonusRatio;
        return bP;
    }

    public String showCustomerInfo() {
        System.out.println(" > > > INFO < < < ");
        return null;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.showCustomerInfo();
    }


} // end of class
