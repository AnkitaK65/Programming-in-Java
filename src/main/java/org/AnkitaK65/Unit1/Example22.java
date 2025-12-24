package org.AnkitaK65.Unit1;

// Example22: Built-in Methods in Java
// Demonstrates some commonly used built-in methods from Math, String, Integer, and Character classes

/*
1. Java provides built-in classes in java.lang package (automatically imported) with ready-to-use methods.
2. Common classes and examples:
    a) Math class:
        - Provides mathematical functions like sqrt(), pow(), abs(), ceil(), floor(), round()
    b) String class:
        - Methods for string manipulation: length(), charAt(), substring(), equals(), toUpperCase(), replace(), contains()
        - Strings are immutable
    c) Integer class:
        - Wrapper class for int with methods like parseInt(), valueOf(), toString()
        - Wrapper class for int
    d) Character class:
        - Methods for character checking and conversion: isDigit(), isLetter(), isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()
        - Wrapper class for char
3. These methods simplify common tasks without manual implementation.
4. These methods can be used directly with class name (static) or object (non-static in case of String)
*/

class Example22 {
    public static void main(String[] args) {

        // ---------- 1. Math Class ----------
        int x = -10;
        double y = 25.5;

        System.out.println("Math.abs(x) = " + Math.abs(x));       // absolute value
        System.out.println("Math.sqrt(y) = " + Math.sqrt(y));     // square root
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3)); // power
        System.out.println("Math.ceil(4.2) = " + Math.ceil(4.2)); // rounds up
        System.out.println("Math.floor(4.8) = " + Math.floor(4.8)); // rounds down
        System.out.println("Math.round(4.5) = " + Math.round(4.5)); // rounds to nearest integer

        // ---------- 2. String Class ----------
        String str = "Hello Java";
        System.out.println("\nString: " + str);
        System.out.println("str.length() = " + str.length());     // length of string
        System.out.println("str.charAt(1) = " + str.charAt(1));   // character at index
        System.out.println("str.substring(0,5) = " + str.substring(0,5)); // substring
        System.out.println("str.toUpperCase() = " + str.toUpperCase()); // upper case
        System.out.println("str.toLowerCase() = " + str.toLowerCase()); // lower case
        System.out.println("str.contains(\"Java\") = " + str.contains("Java")); // contains
        System.out.println("str.equals(\"Hello Java\") = " + str.equals("Hello Java")); // equality

        // ---------- 3. Integer Class ----------
        String numStr = "100";
        int num = Integer.parseInt(numStr);   // convert string to int
        Integer numObj = Integer.valueOf(numStr); // convert string to Integer object
        String strFromInt = Integer.toString(num); // int to string
        System.out.println("\nInteger.parseInt(\"100\") = " + num);
        System.out.println("Integer.valueOf(\"100\") = " + numObj);
        System.out.println("Integer.toString(100) = " + strFromInt);

        // ---------- 4. Character Class ----------
        char ch1 = 'A';
        char ch2 = '9';
        char ch3 = 'a';

        System.out.println("\nCharacter.isLetter(ch1) = " + Character.isLetter(ch1)); // true
        System.out.println("Character.isDigit(ch2) = " + Character.isDigit(ch2));     // true
        System.out.println("Character.isUpperCase(ch1) = " + Character.isUpperCase(ch1)); // true
        System.out.println("Character.isLowerCase(ch3) = " + Character.isLowerCase(ch3)); // true
        System.out.println("Character.toLowerCase(ch1) = " + Character.toLowerCase(ch1)); // a
        System.out.println("Character.toUpperCase(ch3) = " + Character.toUpperCase(ch3)); // A
    }
}

/*
Output:
Math.abs(x) = 10
Math.sqrt(y) = 5.049752469181039
Math.pow(2, 3) = 8.0
Math.ceil(4.2) = 5.0
Math.floor(4.8) = 4.0
Math.round(4.5) = 5

String: Hello Java
str.length() = 10
str.charAt(1) = e
str.substring(0,5) = Hello
str.toUpperCase() = HELLO JAVA
str.toLowerCase() = hello java
str.contains("Java") = true
str.equals("Hello Java") = true

Integer.parseInt("100") = 100
Integer.valueOf("100") = 100
Integer.toString(100) = 100

Character.isLetter(ch1) = true
Character.isDigit(ch2) = true
Character.isUpperCase(ch1) = true
Character.isLowerCase(ch3) = true
Character.toLowerCase(ch1) = a
Character.toUpperCase(ch3) = A
*/

