package org.example.BankApplication;

import java.util.UUID;

public class HDFC implements BankInterface{
    private int balance;
    private String  accountNo;
    private String password;
    public String name;

    public static double rateOfInterest;

    public HDFC(int balance, String password, String name) {
        //UUID =Unique random Generator
        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if (password == this.password) {
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {

        balance=balance+money;

        String message = money + " has been added to the account "+ accountNo +" "+
                "the total balance now " + balance;

        return  message;

    }

    @Override
    public String withDrawMoney(int drawMoney, String password) {
        if (password==this.password){
            if(drawMoney>balance){
                return "Insufficent Balance";
            }
            else{
                balance=balance-drawMoney;
                return  "Money Withdraw successfully.Total Remaining balance is " + balance;
            }

        }
        else {
            return "wrong password";
        }

    }


    @Override
    public String changePassword(String oldPassword, String newPassword) {

        //this.password means current password for account
        if(this.password==oldPassword){//if(this.password.equals(oldPassword) or if(this.password.compareTo())
            this.password = newPassword;
            return "password has been changed successfully";
        }
        else {
            return "wrong Password";
        }
    }

    @Override
    public double calculateTotalInterest(int years, String password) {
        double interest = balance*rateOfInterest*years/100;
        return interest;
    }
}
