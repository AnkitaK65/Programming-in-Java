/*
Q15. Write a Java program to find the transpose of a given matrix.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][columns];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Compute the transpose of the matrix
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transpose of the matrix
        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
//Output:
// Enter the number of rows: 2
//Enter the number of columns: 3
//Enter the elements of the matrix:
//Element [0][0]: 1
//Element [0][1]: 2
//Element [0][2]: 3
//Element [1][0]: 4
//Element [1][1]: 5
//Element [1][2]: 6
//
//Original Matrix:
//1 2 3
//4 5 6
//
//Transpose of the Matrix:
//1 4
//2 5
//3 6