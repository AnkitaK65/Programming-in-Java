package org.AnkitaK65.lab;

// Q32. Write a program "Divide By Zero" that takes two numbers a and b as input, computes a/b, and invokes an ArithmeticException to generate a message when the denominator is zero.

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            // Taking inputs for a and b
            System.out.print("Enter the numerator (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter the denominator (b): ");
            int b = scanner.nextInt();

            // Attempt division
            int result = a / b; // May throw ArithmeticException if b is zero
            System.out.println("Result of " + a + " / " + b + " = " + result);

        } catch (ArithmeticException e) {
            // Handle divide-by-zero scenario
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle other unexpected exceptions
            System.out.println("Error: An unexpected exception occurred. " + e.getMessage());
        } finally {
            // Close the Scanner to free resources
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Scanner closed.");
        }

        System.out.println("Program execution completed.");
    }
}
//Output:
//Valid Division
//Enter the numerator (a): 10
//Enter the denominator (b): 6
//Result of 10 / 6 = 1
//Scanner closed.
//Program execution completed.

//Case 2: Divide By Zero
//Enter the numerator (a): 12
//Enter the denominator (b): 0
//Error: Division by zero is not allowed.
//Scanner closed.
//Program execution completed.

//Case 3: Invalid Input
//Enter the numerator (a): abc
//Error: An unexpected exception occurred. null
//Scanner closed.
//Program execution completed.


