/*
Q3. & Q20. Write a Java program to check whether a given number is prime or not (without using a function).
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = true; // Assume the number is prime

        if (number <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            // Check divisors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Not prime if divisible by i
                    break; // No need to check further
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
//Output:
//Enter a number to check if it is prime: -5
//-5 is not a prime number.

//Enter a number to check if it is prime: 13
//13 is a prime number.

//Enter a number to check if it is prime: 22
//22 is not a prime number.


//if 36 = a × b, we can find pairs like (1, 36), (2, 18), (3, 12), (4, 9), and (6, 6).
//For each of these pairs, at least one number is ≤ √36 = 6.