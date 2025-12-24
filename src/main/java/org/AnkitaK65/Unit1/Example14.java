package org.AnkitaK65.Unit1;

// Example14: Type Comparison Operator in Java / Type Checking in Java

// Notes:
// instanceof is the type comparison operator in Java
// It checks the object type at runtime
// It returns true or false
// It works only with objects, not primitive data types
// Child object is also an instance of parent class


class Example14 {
    public static void main(String[] args) {

        String str = "Hello Java";
        Integer num = 100;

        // instanceof checks whether an object belongs to a specific class or interface

        System.out.println("str instanceof String  : " + (str instanceof String));
        System.out.println("str instanceof Object  : " + (str instanceof Object));
        //String is a child of Object. Every class in Java extends Object

        System.out.println("num instanceof Integer : " + (num instanceof Integer));
        System.out.println("num instanceof Object  : " + (num instanceof Object));

        // instanceof with parent-child relationship
        Object obj = "BCA Java";

        System.out.println("obj instanceof String  : " + (obj instanceof String));
        System.out.println("obj instanceof Object  : " + (obj instanceof Object));
        //Even though reference is Object, the actual object is String
        //instanceof checks runtime object, not reference type
    }
}

/*
Output:
str instanceof String  : true
str instanceof Object  : true
num instanceof Integer : true
num instanceof Object  : true
obj instanceof String  : true
obj instanceof Object  : true
*/