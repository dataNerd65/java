package com.kaparo.mypackage.ifo;

public class Ifo {
    //creating a checkAge() method with an int age
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access Denied! You aren't old enough!");
        }else {
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args){
        checkAge(16); // calling the checkAge method and passing along an age 20
    }
}
