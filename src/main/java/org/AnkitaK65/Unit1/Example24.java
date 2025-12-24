package org.AnkitaK65.Unit1;

// Example24: Method Scope in Java

/*
1. Scope of a variable: Region of program where the variable is accessible.
2. Types of variable scope:
    a) Local Variables:
        - Declared inside a method, constructor, or block.
        - Only accessible within that method/block.
        - Not initialized automatically; must assign a value before use.

    b) Instance Variables:
        - Declared inside a class but outside methods/constructors.
        - Each object has its own copy.
        - Initialized with default values automatically.

    c) Class (Static) Variables:
        - Declared with 'static' keyword inside class.
        - Shared by all objects of the class.
        - Accessed using class name or object reference.

3. Method Parameters:
    - Treated as local variables within the method.

4. Notes
    - Minimize local variable scope for readability.
    - Use instance variables for object-specific data.
    - Use static variables for shared data across objects.
    - Local variables disappear after method execution.
    - Instance variables exist as long as object exists.
    - Static variables exist as long as class is loaded.

*/

class Example24 {

    // Instance variable
    int instanceVar = 100;

    // Static variable (class variable)
    static int staticVar = 500;

    public static void main(String[] args) {

        Example24 obj1 = new Example24();
        Example24 obj2 = new Example24();

        System.out.println("---------- 1. Local Variable ----------");
        int localVar = 10; // local variable
        System.out.println("localVar = " + localVar);

        System.out.println("\n---------- 2. Instance Variable ----------");
        System.out.println("obj1.instanceVar = " + obj1.instanceVar);
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);

        obj1.instanceVar = 200; // change only obj1's instance variable
        System.out.println("After modification:");
        System.out.println("obj1.instanceVar = " + obj1.instanceVar);
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);

        System.out.println("\n---------- 3. Static Variable ----------");
        System.out.println("Example24.staticVar = " + Example24.staticVar);

        Example24.staticVar = 600; // changes for all objects
        System.out.println("After modification:");
        System.out.println("Example24.staticVar = " + Example24.staticVar);
        System.out.println("obj1.staticVar = " + obj1.staticVar);
        System.out.println("obj2.staticVar = " + obj2.staticVar);

        System.out.println("\n---------- 4. Method Parameters (Local Scope) ----------");
        obj1.showSum(5, 10);
    }

    // Method with parameters (treated as local variables)
    void showSum(int a, int b) {
        int sum = a + b; // local variable
        System.out.println("Sum of " + a + " and " + b + " = " + sum);
    }
}

/*
Output:
---------- 1. Local Variable ----------
localVar = 10

---------- 2. Instance Variable ----------
obj1.instanceVar = 100
obj2.instanceVar = 100
After modification:
obj1.instanceVar = 200
obj2.instanceVar = 100

---------- 3. Static Variable ----------
Example24.staticVar = 500
After modification:
Example24.staticVar = 600
obj1.staticVar = 600
obj2.staticVar = 600

---------- 4. Method Parameters (Local Scope) ----------
Sum of 5 and 10 = 15
*/
