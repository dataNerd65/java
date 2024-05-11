package com.kkiarie.mypackage;
public class Sasii {
    public Sasii() {
        System.out.println("A new class in learning Java Arrays");
    }

    public void printMessage() {
        System.out.println("A new instance is created to ensure first statement is executed");
    }
    //concepts on multidimensional arrays
    public void MultiArrays() {
        int [] [] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 23;
        System.out.println(myNumbers[1][2]);
        for(int[] row: myNumbers) {
            for(int f : row){
                System.out.println(f);
            }
        }
        System.out.println("Now using for loop in multidimensional arrays.");
        for(int g =  0; g < myNumbers.length; ++g){
            for(int u = 0; u < myNumbers[g].length; ++u){
                System.out.println(myNumbers[g][u]);
            }
        }
    }
}