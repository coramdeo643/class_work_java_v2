package com.mytest;

public class PhoneNumber {

    private String name;
    private String numbers;

    public PhoneNumber(String name, String numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setInfo(String name, String numbers) {
        this.name = name;
        this.numbers = numbers;
    }
}
