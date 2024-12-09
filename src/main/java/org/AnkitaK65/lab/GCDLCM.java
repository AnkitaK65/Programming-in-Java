/*
Q11. Write a Java program to find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class GCDLCM {

    // Function to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;  // Formula for LCM
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find GCD
        int gcd = findGCD(num1, num2);

        // Find LCM using the formula: LCM = (num1 * num2) / GCD
        int lcm = findLCM(num1, num2, gcd);

        // Display results
        System.out.println("Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);

        // Close scanner
        scanner.close();
    }
}
//LCM(a,b)= (a*b) / GCD(a,b)

//Enter the first number: 12
//Enter the second number: 18
//Greatest Common Divisor (GCD) of 12 and 18 is: 6
//Least Common Multiple (LCM) of 12 and 18 is: 36