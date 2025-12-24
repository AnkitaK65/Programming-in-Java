package org.AnkitaK65.Unit1;

// Example5: Constants in Java
// Literal, Local, Instance, Static, and Enum Constants

// ---------- ENUM CONSTANT ----------
// Enum represents a fixed set of constant values
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

class Example5 {

    // ---------- INSTANCE CONSTANT ----------
    // final instance variable: value cannot be changed for an object
    final int INSTANCE_CONST = 10;

    // ---------- STATIC CONSTANT ----------
    // static final variable: common constant shared by all objects
    static final double PI = 3.14159;

    public static void main(String[] args) {

        // ---------- LITERAL CONSTANTS ----------
        // Fixed values written directly in the code
        System.out.println(100);        // int literal
        System.out.println(3.14);       // double literal
        System.out.println('A');        // char literal
        System.out.println(true);       // boolean literal
        System.out.println("Java");     // String literal

        // ---------- LOCAL CONSTANT ----------
        // final local variable inside a method
        final int MAX_STUDENTS = 60;

        System.out.println("Max Students: " + MAX_STUDENTS);

        // ---------- USING INSTANCE CONSTANT ----------
        Example5 obj = new Example5();
        System.out.println("Instance Constant: " + obj.INSTANCE_CONST);

        // ---------- USING STATIC CONSTANT ----------
        System.out.println("PI value: " + PI);

        // ---------- USING ENUM CONSTANT ----------
        Day today = Day.TUESDAY;
        System.out.println("Today is: " + today);

        // ERROR: final variables cannot be modified
        // MAX_STUDENTS = 70;
        // PI = 3.14;
    }
}

/*
Output:
100
3.14
A
true
Java
Max Students: 60
Instance Constant: 10
PI value: 3.14159
Today is: TUESDAY
*/