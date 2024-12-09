package org.AnkitaK65.lab.accessspecifiers;

/**
 * Q26. Write a program to show the difference between public and private access specifiers.
 * The program should also show that primitive data types are passed by value and
 * objects are passed by reference, and demonstrate the use of the final keyword.
 */

public class AccessSpecifierDemo {

    // Demonstrating final keyword
    public static final String FINAL_MESSAGE = "This is a constant string!";

    public static void modifyPrimitive(int value) {
        value += 10;
    }

    public static void modifyObject(StringBuilder builder) {
        builder.append(" Modified");
    }

    public static void main(String[] args) {
        // Demonstrate public and private access specifiers
        Data data = new Data();
        System.out.println("Public Data: " + data.publicData);

        // Accessing private data via getter
        System.out.println("Private Data: " + data.getPrivateData());

        // Public members are accessible from anywhere.
        // Private members can only be accessed within the same class and require getters/setters for external access.

        // Modifying private data via setter
        data.setPrivateData("New Private Value");
        System.out.println("Modified Private Data: " + data.getPrivateData());

        // Demonstrate primitive and object passing
        PassByExample example = new PassByExample();

        System.out.println("\nBefore Modification:");
        System.out.println("Primitive Value: " + example.primitiveValue);
        System.out.println("Reference Value: " + example.referenceValue);

        // Pass by value for primitive
        modifyPrimitive(example.primitiveValue);

        // Pass by reference for object
        modifyObject(example.referenceValue);

        System.out.println("\nAfter Modification:");
        System.out.println("Primitive Value (Unchanged): " + example.primitiveValue);
        System.out.println("Reference Value (Modified): " + example.referenceValue);

        // Demonstrate final keyword
        System.out.println("\nFinal Message: " + FINAL_MESSAGE);

        // Uncommenting the following line would result in a compilation error:
        // FINAL_MESSAGE = "This can't be changed!";

        // if uncommented:- java: cannot assign a value to final variable FINAL_MESSAGE
    }
}
//Output:
//Public Data: I am Public
//Private Data: I am Private
//Modified Private Data: New Private Value
//
//Before Modification:
//Primitive Value: 100
//Reference Value: Original
//
//After Modification:
//Primitive Value (Unchanged): 100
//Reference Value (Modified): Original Modified
//
//Final Message: This is a constant string!