package org.AnkitaK65.lab;

// Q1. Write a Java program to display the Fibonacci series up to a given number of terms.

import java.util.Scanner; // Import Scanner class for user input

public class FibonacciSeries {

    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt(); // Read user input

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Display the Fibonacci series
            System.out.println("Fibonacci series up to " + n + " terms:");

            // Initialize the first two terms of the series
            int firstTerm = 0;
            int secondTerm = 1;

            // Loop to generate and print the Fibonacci series
            for (int i = 1; i <= n; i++) {
                // Print the current term
                System.out.print(firstTerm + " ");

                // Calculate the next term
                int nextTerm = firstTerm + secondTerm;

                // Update the terms for the next iteration
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
//Output:
//Enter the number of terms for the Fibonacci series: 10
//Fibonacci series up to 10 terms:
//0 1 1 2 3 5 8 13 21 34