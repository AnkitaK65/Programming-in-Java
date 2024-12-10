package org.AnkitaK65.lab;

// Q18. Write a Java program to learn the use of the length property in a two-dimensional array.
import java.util.Scanner;

public class TwoDimensionalArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of the 2D array
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        // Declare and initialize the 2D array
        int[][] array = new int[rows][cols];

        // Populate the 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the number of rows and columns using the length property
        System.out.println("\nUsing length property:");
        System.out.println("Number of rows: " + array.length);
        System.out.println("Number of columns in each row:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Row %d has %d columns\n", i, array[i].length);
        }

        // Print the entire array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//Output:-
//Enter the number of rows:
//2
//Enter the number of columns:
//3
//Enter elements of the array:
//Element at [0][0]: 1
//Element at [0][1]: 2
//Element at [0][2]: 3
//Element at [1][0]: 4
//Element at [1][1]: 5
//Element at [1][2]: 6
//
//Using length property:
//Number of rows: 2
//Number of columns in each row:
//Row 0 has 3 columns
//Row 1 has 3 columns
//
//The 2D array is:
//1 2 3
//4 5 6