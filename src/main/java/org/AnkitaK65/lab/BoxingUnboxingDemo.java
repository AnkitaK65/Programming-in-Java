package org.AnkitaK65.lab;

/*
 * Q28. Write a program to demonstrate the concept of boxing and unboxing.
*/


/*
 * Boxing is the process of converting a primitive type to a corresponding wrapper class.
 * Unboxing is the reverse process, i.e., converting a wrapper class object to a primitive type.
 *
 * Manual Boxing can be done using the constructor or the valueOf method.
 * Automatic Boxing and Unboxing is handled by Java automatically when using primitives and wrapper types together.
 */

public class BoxingUnboxingDemo {

    public static void main(String[] args) {

        // Boxing: Converting primitive type to Wrapper class (Automatic)
        int num = 10;
        Integer numBoxed = num;  // Automatic boxing of primitive int to Integer

        System.out.println("Boxed Integer (Automatic): " + numBoxed);  // Output: Boxed Integer: 10

        // Unboxing: Converting Wrapper class object to primitive type (Automatic)
        Integer anotherBoxedNum = new Integer(20);  // Manually boxing Integer using constructor
        int numUnboxed = anotherBoxedNum;  // Automatic unboxing of Integer to primitive int

        System.out.println("Unboxed Integer: " + numUnboxed);  // Output: Unboxed Integer: 20

        // Manually Boxing using valueOf method
        Double doubleBoxed = Double.valueOf(3.14);  // Manual boxing using valueOf
        System.out.println("Manually Boxed Double using valueOf: " + doubleBoxed);  // Output: Manually Boxed Double: 3.14

        // Manually Boxing using Constructor (older way)
        Double doubleBoxedWithConstructor = new Double(3.14);  // Manual boxing using constructor
        System.out.println("Manually Boxed Double using Constructor: " + doubleBoxedWithConstructor);
        // Output: Manually Boxed Double using Constructor: 3.14

        // Manually Unboxing
        Double anotherDouble = new Double(5.67);  // Manual boxing
        double doubleUnboxed = anotherDouble.doubleValue();  // Manually unboxing using doubleValue() method
        System.out.println("Manually Unboxed Double: " + doubleUnboxed);  // Output: Manually Unboxed Double: 5.67

        // Automatic Boxing for Double (Primitive to Wrapper)
        double primitiveDouble = 7.89;  // Primitive double
        Double boxedDouble = primitiveDouble;  // Automatic boxing (primitive to Double object)
        System.out.println("Automatic Boxing for Double: " + boxedDouble);  // Output: Automatic Boxing for Double: 7.89

        // Automatic Unboxing for Double (Wrapper to Primitive)
        Double wrappedDouble = new Double(9.01);  // Wrapper class object for double
        double unboxedDouble = wrappedDouble;  // Automatic unboxing (Double object to primitive)
        System.out.println("Automatic Unboxing for Double: " + unboxedDouble);  // Output: Automatic Unboxing for Double: 9.01
    }
}
//Output:
//Boxed Integer (Automatic): 10
//Unboxed Integer: 20
//Manually Boxed Double using valueOf: 3.14
//Manually Boxed Double using Constructor: 3.14
//Manually Unboxed Double: 5.67
//Automatic Boxing for Double: 7.89
//Automatic Unboxing for Double: 9.01


// Additional Information:

// Double.valueOf(): Unnecessary boxing
// Using `Double.valueOf(3.14)` will box the primitive double value into a Double object.
// If you already have a primitive double, there's no need to box it, unless required by the method or function.

// Integer anotherBoxedNum = new Integer(20); is deprecated since Java 9.
// This is an older method of manually boxing, and it's not recommended in modern Java.
// Instead, use `Integer.valueOf(20)` to box the integer or use automatic boxing when working with primitives.
