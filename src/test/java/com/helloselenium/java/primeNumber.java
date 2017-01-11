package com.helloselenium.java;

/**
 * Created by Abhishek Yadav
 */
public class primeNumber {
    public static void main(String args[]) {
        //defining a variable 'num' to check it prime number condition as a type 'int'
        int num = 77;
        // defining a variable 'prime' to put status of prime number condition as a type 'boolean'
        boolean prime = false;
        // defining a variable 'div' to put divisible value as a type 'int'
        int div = 0;

        // 'for loop' to check the prime condition status for 'num' variable
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // setting the 'prime' status as 'false' if 'num' is not a prime number
                prime = false;
                // setting the 'div' status as 'i' if 'num' is not a prime number
                div = i;
                // breaking the 'for loop' if 'num' is not a prime number
                break;
            } else {
                // setting the 'prime' status as 'true' if 'num' is a prime number
                prime = true;
            }
        }
        //printing the status of 'num' whether it is a prime number or not
        if (prime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number, it is divisible by " + div);
        }

    }
}
