package org.example.CLass1_topicConstructor;

public class Class {

    public static void main(String[] args) {

        //default constructor will print first
        Student obj = new Student();


        Student obj1 = new Student(1, "saitej", "Delhi");

        System.out.println(obj1.getName() + " " + "is in " + obj1.getAddress());


        Student obj2 = new Student(2, "Rohith", "Baroda");

        System.out.println(obj2.getName() + " " + "is in " + obj2.getAddress());

        Student obj3 = new Student(3, "Rajesh", "Baroda");

        System.out.println(obj3.getName() + " " + "is in " + obj3.getAddress());
    }
}
