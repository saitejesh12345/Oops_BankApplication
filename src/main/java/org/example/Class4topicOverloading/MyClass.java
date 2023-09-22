package org.example.Class4topicOverloading;

public class MyClass {

    public static void main(String[] args) {
System.out.println(add(12,32));
        System.out.println(add(12.00,32));
        System.out.println(add("Hello"," world"));
    }
    //Method overloading we are defining same method name ,different data types with differnt operations
    public static int add(int a,int b){
        return (a + b);
    }

    public static double add(double a,int b){
        return (a + b);
    }

    public static String add(String a,String b){
        return (a + b);
    }
}
