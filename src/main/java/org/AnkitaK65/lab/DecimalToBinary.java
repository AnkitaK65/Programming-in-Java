// Q19. Write a Java program to convert a decimal number to a binary number.
package org.AnkitaK65.lab;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Conversion using Integer.toBinaryString() method
        String binaryUsingMethod = Integer.toBinaryString(decimal);
        System.out.println("Binary representation (using Integer.toBinaryString()): " + binaryUsingMethod);

        // Manual conversion to binary (modulus and division method)
        String binaryManually = "";
        int tempDecimal = decimal; // Preserve original decimal for manual conversion
        while (tempDecimal > 0) {
            binaryManually = (tempDecimal % 2) + binaryManually;
            tempDecimal /= 2;
        }
        System.out.println("Binary representation (manual conversion): " + binaryManually);

        // Conversion using bitwise operator
        String binaryUsingBitwise = "";
        int temp = decimal;
        while (temp > 0) {
            binaryUsingBitwise = ((temp & 1) == 1 ? "1" : "0") + binaryUsingBitwise;
            temp = temp >> 1; // Right shift to move to the next bit
        }
        System.out.println("Binary representation (using bitwise operator): " + binaryUsingBitwise);

        scanner.close();
    }
}
//Output:-
//Enter a decimal number: 43
//Binary representation (using Integer.toBinaryString()): 101011
//Binary representation (manual conversion): 101011
//Binary representation (using bitwise operator): 101011

// Input: decimal = 43
// 43 % 2 = 1 → binaryManually = "1", tempDecimal = 21
// 21 % 2 = 1 → binaryManually = "11", tempDecimal = 10
// 10 % 2 = 0 → binaryManually = "011", tempDecimal = 5
// 5 % 2 = 1 → binaryManually = "1011", tempDecimal = 2
// 2 % 2 = 0 → binaryManually = "01011", tempDecimal = 1
// 1 % 2 = 1 → binaryManually = "101011", tempDecimal = 0
// Output: "101011"

// Input: decimal = 43
// 43 & 1 = 1 → binaryUsingBitwise = "1", temp = 21
// 21 & 1 = 1 → binaryUsingBitwise = "11", temp = 10
// 10 & 1 = 0 → binaryUsingBitwise = "011", temp = 5
// 5 & 1 = 1 → binaryUsingBitwise = "1011", temp = 2
// 2 & 1 = 0 → binaryUsingBitwise = "01011", temp = 1
// 1 & 1 = 1 → binaryUsingBitwise = "101011", temp = 0
// Output: "101011"