/*
Q10. Write a Java program to print a pyramid pattern (e.g., asterisks).
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of rows for the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Print the pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print the asterisks (*) in pyramid shape
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Close scanner
        scanner.close();
    }
}
//Enter the number of rows for the pyramid: 5
//    *
//   ***
//  *****
// *******
//*********