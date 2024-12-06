package org.AnkitaK65.lab.multilevel.fibonacci;

/*
 * Q30. Write a program to create a multilevel package and also create a reusable class
 * to generate the Fibonacci series, where the function to generate the Fibonacci series
 * is given in a different file belonging to the same package.
 */

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci series:");
        int terms = scanner.nextInt();

        // Create an object of the FibonacciGenerator class
        FibonacciGenerator generator = new FibonacciGenerator();

        // Generate and display the Fibonacci series
        String fibonacciSeries = generator.generateFibonacci(terms);
        System.out.println("Fibonacci Series: " + fibonacciSeries);

        // Close the scanner
        scanner.close();
    }
}

//Output:
//Enter the number of terms for the Fibonacci series:
// 10
//Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34