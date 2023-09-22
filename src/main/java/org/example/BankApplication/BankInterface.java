package org.example.BankApplication;

public interface BankInterface {

    public int checkBalance(String password);

    public String addMoney(int money );

    public String withDrawMoney(int money,String password);


    public String changePassword(String oldPassword,String newPassword);

    public double calculateTotalInterest(int years,String password);


    /*
    we will try to transfer money
    Transfer money
    within the same bank

     */
}
