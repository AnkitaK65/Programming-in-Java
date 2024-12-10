package org.AnkitaK65.lab;

// Question 21: Write a Java program to find the sum of any number of integers interactively,
// where the total number of integers is given as a command line argument.

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        // Check if command line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide the total number of integers as a command line argument.");
            return;
        }

        // Get the total number of integers from the command line argument
        int totalNumbers = Integer.parseInt(args[0]);

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize sum variable to store the total sum
        int sum = 0;

        // Prompt the user to enter the integers
        System.out.println("Enter " + totalNumbers + " integers:");

        // Loop to take the specified number of integers as input
        for (int i = 1; i <= totalNumbers; i++) {
            // Read each integer from the user
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();
            // Add the entered integer to the sum
            sum += num;
        }

        // Close the scanner
        scanner.close();

        // Output the total sum
        System.out.println("The sum of the entered integers is: " + sum);
    }
}
//Output:-

//java SumOfIntegers
//Please provide the total number of integers as a command line argument.

//java SumOfIntegers 5
//Enter 5 integers:
//Enter integer 1: 3
//Enter integer 2: 4
//Enter integer 3: 12
//Enter integer 4: 45
//Enter integer 5: 5
//The sum of the entered integers is: 69