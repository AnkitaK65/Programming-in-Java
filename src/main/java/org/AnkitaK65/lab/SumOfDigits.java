/*
Q12. Write a Java program to calculate the sum of digits of a given number.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        // Loop to extract each digit and add it to the sum
        while (num != 0) {
            sum += num % 10;  // Add the last digit to sum
            num /= 10;         // Remove the last digit
        }

        // Display the sum of digits
        System.out.println("Sum of digits: " + sum);

        // Close scanner
        scanner.close();
    }
}
//Enter a number: 7594
//Sum of digits: 25