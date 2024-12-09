/*
Q6. Write a Java program to perform addition of two matrices.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of rows and columns
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrices: ");
        int columns = scanner.nextInt();

        // Create two matrices for input
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];

        // Input elements for matrix1
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for matrix2
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform addition of matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result of addition
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Close scanner
        scanner.close();
    }
}
//Output:
//Enter the number of rows in the matrices: 3
//Enter the number of columns in the matrices: 2
//Enter elements for Matrix 1:
//1 2
//3 4
//5 6
//Enter elements for Matrix 2:
//1 2
//3 4
//5 6
//Resultant Matrix after addition:
//2 4
//6 8
//10 12