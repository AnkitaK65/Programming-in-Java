package org.AnkitaK65.Unit1;

// Example12: Bitwise Operators in Java
// Bitwise operators work on individual bits of integer data types

// &  → bitwise AND
// |  → bitwise OR
// ^  → bitwise XOR
// ~  → bitwise NOT (one's complement)
// << → left shift (fills 0)
// >> → signed right shift (keeps sign bit)
// >>>→ unsigned right shift (fills 0)

class Example12 {
    public static void main(String[] args) {

        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        // Bitwise AND (&)
        System.out.println("a & b  = " + (a & b));   // 0101 & 0011 = 0001 (1)

        // Bitwise OR (|)
        System.out.println("a | b  = " + (a | b));   // 0101 | 0011 = 0111 (7)

        // Bitwise XOR (^)
        System.out.println("a ^ b  = " + (a ^ b));   // 0101 ^ 0011 = 0110 (6)

        // Bitwise NOT (~)
        System.out.println("~a     = " + (~a));      // Inverts all bits

        // Left Shift (<<)
        System.out.println("a << 1 = " + (a << 1));  // 0101 << 1 = 1010 (10)

        // Signed Right Shift (>>)
        System.out.println("a >> 1 = " + (a >> 1));  // 0101 >> 1 = 0010 (2)

        // Unsigned Right Shift (>>>)
        System.out.println("a >>> 1 = " + (a >>> 1));// Shifts right, fills with 0
    }
}

/*
Output:
a & b  = 1
a | b  = 7
a ^ b  = 6
~a     = -6
a << 1 = 10
a >> 1 = 2
a >>> 1 = 2
*/