package org.AnkitaK65.Unit1;

// Example27: Access Modifiers for Variables and Classes in Java

/*
1. Access Modifiers for Variables:
    - public    : Accessible from anywhere.
    - protected : Accessible within same package and subclasses.
    - default   : Accessible only within same package.
    - private   : Accessible only within same class.

2. Access Modifiers for Classes:
    - public  : Class is accessible from anywhere.
    - default : Class is accessible only within the same package.
    - NOTE: Classes cannot be private or protected at top level (a class written outside any other class).

3. Rules:
    - Variables follow the same access rules as methods.
    - private variables are accessed using public methods (getters/setters).
    - Helps achieve encapsulation and data hiding.
    - Use getters/setters to access private data
    - In Java, a source file (.java) can contain only one public class, 
        and the file name must exactly match that public class name.
*/

public class Example27 {   // public class

    // -------- Variables with different access modifiers --------

    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;        // default (package-private)
    private int privateVar = 40;

    public static void main(String[] args) {

        Example27 obj = new Example27();

        System.out.println("Public Variable = " + obj.publicVar);
        System.out.println("Protected Variable = " + obj.protectedVar);
        System.out.println("Default Variable = " + obj.defaultVar);

        // private variable cannot be accessed directly
        System.out.println("Private Variable = " + obj.getPrivateVar());
    }

    // Public method to access private variable
    public int getPrivateVar() {
        return privateVar;
    }
}

// Default (package-private) class
class DefaultClass {
    void show() {
        System.out.println("This is a default access class");
    }
}

/*
Output:
Public Variable = 10
Protected Variable = 20
Default Variable = 30
Private Variable = 40
*/