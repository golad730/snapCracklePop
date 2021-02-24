package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        Write a program that prints out the numbers 1 to 100 (inclusive).
        If the number is divisible by 3, print Crackle instead of the number.
        If it's divisible by 5, print Pop. If it's divisible by both 3 and 5,
        print CracklePop. You can use any language.
         */

        for (int i =1; i<=100; i++){

            int j, k;
            j = i%3;
            k = i%5;

            // Condition for Crackle pop
            if ((j==0)&&(k==0)){
                System.out.println("CracklePop");

                // Condition for Pop
            }else {
                if ((i!=0)&&(k==0)){
                    System.out.println("Pop");

                }else {

                    // Condition for Crackle
                    if ((i != 0) && (j == 0)) {
                        System.out.println("Crackle");
                    }

                    // Print statement
                    else {

                        //System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                        System.out.println( i );
                    }
                }
            }
        }
    }
}
