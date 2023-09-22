package org.example.Class4polymorphismConcept;

public class MyClass {
    public static void main(String[] args) {
        //All Objects are Bank Class which is reffering to differnt Classes
        Bank bank1 = new Bank_abc();
        Bank bank2 = new Bank_def();
        Bank bank3 = new Bank_ghi();

        System.out.println(bank1.getIntrestRates());
        System.out.println(bank2.getIntrestRates());
        System.out.println(bank3.getIntrestRates());
    }
}
