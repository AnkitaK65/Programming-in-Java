/*
Q2. Write a Java program to calculate the factorial of a given number using both iterative and recursive methods.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class FactorialCalculator {

    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorialRecursive(n - 1); // Recursive call
    }

    // Iterative method to calculate factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by current number
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using recursive method
            long factorialRec = factorialRecursive(number);

            // Calculate factorial using iterative method
            long factorialItr = factorialIterative(number);

            // Display the results
            System.out.println("Factorial of " + number + " (Recursive): " + factorialRec);
            System.out.println("Factorial of " + number + " (Iterative): " + factorialItr);
        }

        // Close the scanner
        scanner.close();
    }
}
//Output:
//Enter a non-negative integer to calculate its factorial: 5
//Factorial of 5 (Recursive): 120
//Factorial of 5 (Iterative): 120