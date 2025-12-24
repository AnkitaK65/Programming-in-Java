package org.AnkitaK65.Unit1;

// Example9: Assignment Operators in Java

class Example9 {
    public static void main(String[] args) {

        // ---------- SIMPLE ASSIGNMENT ----------
        int a = 10;   // = assigns value to variable
        System.out.println("a = " + a);

        // ---------- ARITHMETIC COMPOUND ASSIGNMENT ----------
        a += 5;   // += adds RHS to a and assigns result (a = a + 5)
        System.out.println("After a += 5, a = " + a);

        a -= 3;   // -= subtracts RHS from a (a = a - 3)
        System.out.println("After a -= 3, a = " + a);

        a *= 2;   // *= multiplies a by RHS (a = a * 2)
        System.out.println("After a *= 2, a = " + a);

        a /= 4;   // /= divides a by RHS (a = a / 4)
        System.out.println("After a /= 4, a = " + a);

        a %= 3;   // %= stores remainder after division (a = a % 3)
        System.out.println("After a %= 3, a = " + a);

        // ---------- BITWISE COMPOUND ASSIGNMENT ----------
        int b = 5;    // binary: 0101
        int c = 3;    // binary: 0011

        b &= c;   // &= bitwise AND then assign (b = b & c)
        System.out.println("After b &= c, b = " + b);

        b |= c;   // |= bitwise OR then assign (b = b | c)
        System.out.println("After b |= c, b = " + b);

        b ^= c;   // ^= bitwise XOR then assign (b = b ^ c)
        System.out.println("After b ^= c, b = " + b);

        b <<= 1;  // <<= left shift bits and assign (b = b << 1)
        System.out.println("After b <<= 1, b = " + b);

        b >>= 1;  // >>= right shift bits and assign (b = b >> 1)
        System.out.println("After b >>= 1, b = " + b);

        b >>>= 1; // >>>= unsigned right shift and assign (b = b >>> 1)
        System.out.println("After b >>>= 1, b = " + b);

        // Java has no unsigned left shift operator 
        // because left shift (<<) always fills zeros 
        // and behaves the same for signed and unsigned values.

    }
}

/*
Output:
After a -= 3, a = 12
After a *= 2, a = 24
After a /= 4, a = 6
After a %= 3, a = 0
After b &= c, b = 1
After b |= c, b = 3
After b ^= c, b = 0
After b <<= 1, b = 0
After b >>= 1, b = 0
After b >>>= 1, b = 0
*/