package org.AnkitaK65.Unit1;

// Example4: Data Types in Java
// Primitive & Non-Primitive Data Types
// Local, Instance, Static variables
public class Example4 {

    // ---------- STATIC VARIABLE ----------
    // Static variable is shared by all objects of the class
    static int staticCount = 100;

    // ---------- INSTANCE VARIABLES ----------
    // Instance variables belong to object of the class
    int instanceInt = 10;
    double instanceDouble = 45.67;
    char instanceChar = 'J';
    boolean instanceBoolean = true;

    public static void main(String[] args) {

        // ---------- LOCAL VARIABLES ----------
        // Local variables are declared inside methods

        // ---- Primitive Data Types ----
        byte b = 10;          // 1 byte
        short s = 200;        // 2 bytes
        int i = 5000;         // 4 bytes
        long l = 900000L;     // 8 bytes

        float f = 45.6f;      // 4 bytes
        double d = 98.76;     // 8 bytes

        char c = 'A';         // 2 bytes (Unicode - global language support. Ex. 'अ')
        boolean flag = true;  // 1 bit (logical)

        // ---- Non-Primitive Data Types ----
        String name = "Java Programming";   // String object
        int[] numbers = {1, 2, 3, 4};        // Array
        Example4 obj = new Example4();       // Object

        // ---------- OUTPUT ----------
        System.out.println("=== Local Variables (Primitive) ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("\n=== Non-Primitive Variables ===");
        System.out.println("String: " + name);
        System.out.println("Array element: " + numbers[0]);

        System.out.println("\n=== Instance Variables ===");
        System.out.println("instanceInt: " + obj.instanceInt);
        System.out.println("instanceDouble: " + obj.instanceDouble);
        System.out.println("instanceChar: " + obj.instanceChar);
        System.out.println("instanceBoolean: " + obj.instanceBoolean);

        System.out.println("\n=== Static Variable ===");
        System.out.println("staticCount: " + staticCount);
    }
}

/*
- Local variable → Declared inside a method
- Instance variable → Declared inside class, outside method
- Static variable → Shared among all objects
- Primitive data types → Store simple values
- Non-primitive data types → Store references to objects
 */

/*
Output:
=== Local Variables (Primitive) ===
byte: 10
short: 200
int: 5000
long: 900000
float: 45.6
double: 98.76
char: A
boolean: true

=== Non-Primitive Variables ===
String: Java Programming
Array element: 1

=== Instance Variables ===
instanceInt: 10
instanceDouble: 45.67
instanceChar: J
instanceBoolean: true

=== Static Variable ===
staticCount: 100
*/