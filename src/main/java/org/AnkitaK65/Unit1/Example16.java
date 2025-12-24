package org.AnkitaK65.Unit1;

// Example16: Type Casting in Java

/*
1. Type Casting: converting one data type to another
2. Types of Casting:
    a) Implicit / Widening: smaller → larger, automatic
        Example: int → double
    b) Explicit / Narrowing: larger → smaller, manual
        Example: double → int (fraction lost)
    c) Primitive ↔ Primitive:
        char ↔ int, byte ↔ int, short ↔ int
    d) Object Casting:
        Upcasting (automatic) Object obj = "Hello";
            -> Upcasting means storing a child class object in a parent class reference.
            -> Automatic → Java does this without you explicitly writing anything.
        Downcasting (manual) String s = (String) obj;
            -> Downcasting converts a parent class reference back to its actual child type.
            -> Must be explicit → Java requires (String) because the compiler cannot guarantee the type.
    e) Boxing / Unboxing:
        int → Integer (boxing)
        Integer → int (unboxing)
        Expressions auto-unbox when needed: Ex: Integer + int
3. Overflow:
    - Occurs when a value exceeds the storage capacity of the type
    - Example: byte range -128 to 127
        int x = 130; byte b = (byte) x; → b = -126 (wraps around)
4. Notes:
    - Implicit casting is safe, explicit may lose data
    - instanceof can be used before downcasting for safety
    - Expressions with mixed types follow Java promotion rules
*/

class Example16 {
    public static void main(String[] args) {

        System.out.println("---------- 1. Implicit Casting (Widening) ----------");
        // smaller → larger type, automatic, safe
        int i = 100;
        double d = i; // int → double
        System.out.println("Implicit Casting (int to double): d = " + d);

        System.out.println("\n---------- 2. Explicit Casting (Narrowing) ----------");
        // larger → smaller type, manual, may lose data
        double pi = 3.14159;
        int piInt = (int) pi; // fraction lost
        System.out.println("Explicit Casting (double to int): piInt = " + piInt);

        System.out.println("\n---------- 3. Casting Between Char and Int ----------");
        char ch = 'A';
        int chValue = (int) ch; // char → int (Unicode)
        System.out.println("Char to Int: 'A' → " + chValue);

        int num = 66;
        char numChar = (char) num; // int → char
        System.out.println("Int to Char: 66 → " + numChar);

        System.out.println("\n---------- 4. Casting Between Byte, Short, and Int ----------");
        int large = 130;
        byte small = (byte) large; // narrowing, overflow occurs
        System.out.println("Int to Byte (overflow example): " + small);
        // Explanation: byte can store -128 to 127, so 130 wraps around to -126

        System.out.println("\n---------- 5. Casting Between Object Types ----------");
        Object obj = "Java"; // upcasting (automatic)
        String str = (String) obj; // downcasting (manual)
        System.out.println("Object to String (downcasting): " + str);

        System.out.println("\n---------- 6. Boxing and Unboxing ----------");
        // Boxing: primitive → wrapper
        int value = 50;
        Integer wrapper = Integer.valueOf(value);
        System.out.println("Boxing int → Integer: " + wrapper);

        // Unboxing: wrapper → primitive
        Integer intObj = 200;
        int primitive = intObj.intValue();
        System.out.println("Unboxing Integer → int: " + primitive);

        // Quick expression example using unboxing automatically
        int sum = intObj + 50; // auto-unboxing of intObj
        System.out.println("Auto-unboxing in expression (intObj + 50) = " + sum);
    }
}

/*
Output:
---------- 1. Implicit Casting (Widening) ----------
Implicit Casting (int to double): d = 100.0

---------- 2. Explicit Casting (Narrowing) ----------
Explicit Casting (double to int): piInt = 3

---------- 3. Casting Between Char and Int ----------
Char to Int: 'A' → 65
Int to Char: 66 → B

---------- 4. Casting Between Byte, Short, and Int ----------
Int to Byte (overflow example): -126

---------- 5. Casting Between Object Types ----------
Object to String (downcasting): Java

---------- 6. Boxing and Unboxing ----------
Boxing int → Integer: 50
Unboxing Integer → int: 200
Auto-unboxing in expression (intObj + 50) = 250
*/


