package com._interface;

public class CompleteCalc extends Calculator{

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int divide(int n1, int n2) {
        return n1 / n2;
    }

}
