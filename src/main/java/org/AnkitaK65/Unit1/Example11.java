package org.AnkitaK65.Unit1;

// Example11: Relational and Logical Operators in Java

// ==  → compares references (address) for objects, but compares values for primitives
// equals() → compares contents (values) of objects
// Logical operators work on boolean values
// Relational operators compare values and return true/false

class Example11 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // ---------- RELATIONAL OPERATORS ----------
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));   // equal to (==)
        System.out.println("a != b : " + (a != b));   // not equal to (!=)
        System.out.println("a > b  : " + (a > b));    // greater than (>)
        System.out.println("a < b  : " + (a < b));    // less than (<)
        System.out.println("a >= b : " + (a >= b));   // greater than or equal to (>=)
        System.out.println("a <= b : " + (a <= b));   // less than or equal to (<=)

        // ---------- LOGICAL OPERATORS ----------
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));   // logical AND (&&)
        System.out.println("x || y : " + (x || y));   // logical OR (||)
        System.out.println("!x     : " + (!x));       // logical NOT (!)

        // ---------- DIFFERENCE: == vs equals() ----------
        System.out.println("\nDifference between == and equals():");

        String s1 = new String("Java");
        String s2 = new String("Java");

        // == compares references (memory locations)
        System.out.println("s1 == s2      : " + (s1 == s2));

        // equals() compares content (values)
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
    }
}

/*
Output:
Relational Operators:
a == b : false
a != b : true
a > b  : false
a < b  : true
a >= b : false
a <= b : true

Logical Operators:
x && y : false
x || y : true
!x     : false

Difference between == and equals():
s1 == s2      : false
s1.equals(s2) : true
*/