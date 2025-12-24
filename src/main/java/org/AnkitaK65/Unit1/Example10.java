package org.AnkitaK65.Unit1;

// Example10: Unary Operators in Java

class Example10 {
    public static void main(String[] args) {

        int a = 5;
        int b = -10;
        boolean flag = true;

        // Unary plus (+) : indicates positive value
        System.out.println("Unary plus (+a) = " + (+a));

        // Unary minus (-) : negates the value
        System.out.println("Unary minus (-a) = " + (-a));

        // Increment operator (++)
        System.out.println("Post-increment (a++) = " + (a++));
        System.out.println("After post-increment, a = " + a);

        System.out.println("Pre-increment (++a) = " + (++a));

        // Decrement operator (--)
        System.out.println("Post-decrement (a--) = " + (a--));
        System.out.println("After post-decrement, a = " + a);

        System.out.println("Pre-decrement (--a) = " + (--a));

        // Logical NOT (!)
        System.out.println("Logical NOT (!flag) = " + (!flag));

        // Bitwise complement (~)
        System.out.println("Bitwise complement (~b) = " + (~b));
    }
}
/*
Output:
Unary plus (+a) = 5
Unary minus (-a) = -5
Post-increment (a++) = 5
After post-increment, a = 6
Pre-increment (++a) = 7
Post-decrement (a--) = 7
After post-decrement, a = 6
Pre-decrement (--a) = 5
Logical NOT (!flag) = false
Bitwise complement (~b) = 9
*/
