/*
Q16. Write a Java program to find the sum of any number of integers entered as command-line arguments.
*/

package org.AnkitaK65.lab;

public class CommandLineSum {
    public static void main(String[] args) {
        // Check if any arguments are passed
        if (args.length == 0) {
            System.out.println("No numbers provided. Please enter integers as command-line arguments.");
            return;
        }

        int sum = 0;

        // Iterate over the command-line arguments
        for (String arg : args) {
            try {
                // Parse each argument to an integer and add to sum
                int number = Integer.parseInt(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + arg + "' is not an integer. Skipping this value.");
            }
        }

        // Display the result
        System.out.println("The sum of the valid integers is: " + sum);
    }
}
//Output:-

//java CommandLineSum 10 20 30
//The sum of the valid integers is: 60

//java CommandLineSum 10 ab 30
//Invalid input: 'ab' is not an integer. Skipping this value.
//The sum of the valid integers is: 40

//java CommandLineSum
//No numbers provided. Please enter integers as command-line arguments.