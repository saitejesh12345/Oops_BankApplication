package org.example.BankApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HDFC.rateOfInterest=8;
        SBI.rateOfInterest=7;

        SBI account1 = new SBI(100000, "Amazon@123", "Dev");
        SBI account2 = new SBI(150000, "samsung@123", "Rakshit");

        HDFC account3 = new HDFC(150000, "12345", "Suresh");

        //wrong password
        int balance = account1.checkBalance("@123");
        System.out.println("The balance for account1 is :"+ balance);

        //Right balance for correct password
        int balanceCheck = account1.checkBalance("Amazon@123");
        System.out.println("The balance for account1 is :"+ balanceCheck);

            //Add money
       String bankMessage= account2.addMoney(50000);
        System.out.println(bankMessage);

        //wrong password
        String getDraw = account3.withDrawMoney(40000,"1234");
        System.out.println(getDraw);
        //RIght password
        String getDraw2 = account3.withDrawMoney(50000,"12345");
        System.out.println(getDraw2);

        //SBI Total Interest
        double message3 = account1.calculateTotalInterest(10,"Amazon@123");
        System.out.println("Total Interest value is:"+ message3);

        //HDFC Total Interest
        double interest1 = account3.calculateTotalInterest(12,"12345");
        System.out.println("Total Interest value is:"+ interest1);


        //Dynamic
//        System.out.println("Welcome to SBI,please Enter Details to create Account");
//        System.out.println("Enter name: ");
//        Scanner sc = new Scanner(System.in);
//
//        String name =sc.next();
//        System.out.println("Enter balance : ");
//        int initialBalance =sc.nextInt();
//        System.out.println("Enter password: ");
//        String password = sc.next();
//
//        SBI sbiAccount = new SBI(initialBalance,password,name);
//        System.out.println("Enter money and password to add");

    }

}