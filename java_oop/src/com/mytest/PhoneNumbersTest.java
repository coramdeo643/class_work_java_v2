package com.mytest;

import java.util.Scanner;

public class PhoneNumbersTest {
    static int currentIndex = 0;
    // main entry
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneNumber[] phoneNumbers = new PhoneNumber[100];
        boolean flag = true;
        // Sample
//        phoneNumbers[0] = new PhoneNumber("Apple", "1000");
//        phoneNumbers[1] = new PhoneNumber("Apple", "1000");
//        phoneNumbers[2] = new PhoneNumber("Apple", "1000");

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_NAME = "3";
        final String UPDATE = "4";
        final String DELETE_ALL = "5";
        final String END = "6";

        while (flag) {
            System.out.println(" = = = M E N U = = = ");
            System.out.println("1. Save 2. Search all 3. Search by name 4. Update 5. Delete all 6. Off");
            System.out.print("Choose the number : ");
            String selectNumber = scanner.nextLine();
            if (selectNumber.equals(SAVE)) {
                save(scanner, phoneNumbers);
            } else if (selectNumber.equals(SEARCH_ALL)) {
                readAll(phoneNumbers);
            } else if (selectNumber.equals(SEARCH_BY_NAME)) {
                readByName(scanner, phoneNumbers);
            } else if (selectNumber.equals(UPDATE)) {
                System.out.println("Who are you looking for?");
                update(scanner, phoneNumbers);
            } else if (selectNumber.equals(DELETE_ALL)) {
                deleteAll(scanner, phoneNumbers);
            } else if (selectNumber.equals(END)) {
                System.out.println("Program is off");
                flag = false;
            } else {
                System.out.println("Wrong number, Choose numbers between 1 to 6.");
            } // end of if
            System.out.println();
        } // end of while
    } // end of main

    public static void save(Scanner scanner, PhoneNumber[] phoneNumbers) {
        System.out.println("Saving the new contact,");
        System.out.print("Name : ");
        String name = scanner.nextLine();
        System.out.print("PhoneNumber : ");
        String number = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber(name, number);
        if (currentIndex > phoneNumbers.length) {
            System.out.println("No available space to save more");
            return;
        }
        phoneNumbers[currentIndex] = phoneNumber;
        currentIndex++;
        System.out.println("Saved successfully!");
    }

    public static void readAll(PhoneNumber[] phoneNumbers) {
        System.out.println("Loading all the contacts...");
        int a = 0;
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] != null) {
                System.out.println((i + 1) + ". " + phoneNumbers[i].getName() + " : " + phoneNumbers[i].getNumbers());
                a++;
            } // end of if
        } // end of for
        System.out.println("Total " + a + " data are found!");
    }

    public static void readByName(Scanner scanner, PhoneNumber[] phoneNumbers) {
        System.out.print("Name : ");
        String name = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] != null) {
                if (phoneNumbers[i].getName().equals(name.trim())) {
                    System.out.println(" = " + phoneNumbers[i].getName() + " : " + phoneNumbers[i].getNumbers());
                    isFound = true;
                    break;
                }
            }
        } // end of for
        if (!isFound) {
            System.out.println("There is no contact");
        } // end of if
    }

    public static void update(Scanner scanner, PhoneNumber[] phoneNumbers) {
        System.out.print("Name : ");
        String name = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] != null) {
                if (phoneNumbers[i].getName().equals(name.trim())) {
                    System.out.println(" = " + phoneNumbers[i].getName() + " : " + phoneNumbers[i].getNumbers());
                    System.out.print("Do you want to update its numbers? (y/n) : ");
                    final String YES = "y";
                    String yesOrNo = scanner.nextLine();
                    if (yesOrNo.equals(YES)) {
                        System.out.print("Name : ");
                        String updatedName = scanner.nextLine();
                        System.out.print("PhoneNumber : ");
                        String updatedNumber = scanner.nextLine();
                        PhoneNumber updatedPhoneNumber = new PhoneNumber(updatedName, updatedNumber);
                        phoneNumbers[i] = updatedPhoneNumber;
                        System.out.println("Updated successfully!");
                    } // end of if
                    isFound = true;
                    break;
                }
            }
        } // end of for
        if (!isFound) {
            System.out.println("There is no contact");
        } // end of if
    }

    public static void deleteAll(Scanner scanner, PhoneNumber[] phoneNumbers) {
        System.out.print("Are you sure to delete all the numbers? (y/n) : ");
        final String YES = "y";
        String yesOrNo = scanner.nextLine();
        if (yesOrNo.equals(YES)) {
            for (int i = 0; i < phoneNumbers.length; i++) {
                phoneNumbers[i] = null;
            } // end of for
            System.out.println("All the phone numbers are deleted");
        } // end of if
    }

} // end of class
