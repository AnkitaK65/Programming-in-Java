package org.AnkitaK65.Unit1;

// Example23: Semantic & Syntax Differences between C++ and Java

class Example23 {
    public static void main(String[] args) {

        System.out.println("Semantic & Syntax Differences between C++ and Java\n");

        System.out.println("1. Memory Management:");
        System.out.println("   - C++: Programmer manages memory using new/delete.");
        System.out.println("   - Java: Automatic garbage collection, no delete operator.\n");

        System.out.println("2. Pointers:");
        System.out.println("   - C++: Supports pointers and pointer arithmetic.");
        System.out.println("   - Java: No pointers; references used instead.\n");

        System.out.println("3. Multiple Inheritance:");
        System.out.println("   - C++: Supports multiple inheritance of classes.");
        System.out.println("   - Java: No multiple inheritance; uses interfaces.\n");

        System.out.println("4. Platform Dependency:");
        System.out.println("   - C++: Compiled to machine code, platform dependent.");
        System.out.println("   - Java: Compiled to bytecode, platform independent (JVM).\n");

        System.out.println("5. Operator Overloading:");
        System.out.println("   - C++: Supports operator overloading.");
        System.out.println("   - Java: Only built-in operator overloading for + with String, no user-defined overloading.\n");

        System.out.println("6. Function Overloading:");
        System.out.println("   - Both support function/method overloading (compile-time polymorphism).\n");

        System.out.println("7. Exception Handling:");
        System.out.println("   - C++: try-catch, but no mandatory checked exceptions.");
        System.out.println("   - Java: try-catch-finally, checked exceptions must be handled.\n");

        System.out.println("8. Input/Output:");
        System.out.println("   - C++: Uses cin, cout.");
        System.out.println("   - Java: Uses Scanner class, System.out.println().\n");

        System.out.println("9. Header Files vs Packages:");
        System.out.println("   - C++: Uses #include to import headers.");
        System.out.println("   - Java: Uses import statement for packages.\n");

        System.out.println("10. Classes and Objects:");
        System.out.println("   - Both are object-oriented, but Java enforces everything inside class.");
        System.out.println("   - C++ allows global functions and variables.\n");

        System.out.println("11. Data Types:");
        System.out.println("   - C++: Primitive types + pointers + user-defined types.");
        System.out.println("   - Java: Primitive types + wrapper classes + reference types; no pointers.\n");

        System.out.println("12. Keywords:");
        System.out.println("   - C++: ~95 keywords");
        System.out.println("   - Java: 53 keywords (all reserved)\n");

        System.out.println("13. Templates vs Generics:");
        System.out.println("   - C++: Uses templates for generic programming.");
        System.out.println("   - Java: Uses generics for type-safe collections and classes.\n");

        System.out.println("14. Default Values:");
        System.out.println("   - C++: Local variables not initialized automatically.");
        System.out.println("   - Java: Class member variables initialized with default values.\n");

        System.out.println("------------------- Quick Comparison Table -------------------");
        System.out.println("| Feature                  | C++                        | Java                          |");
        System.out.println("|--------------------------|---------------------------|-------------------------------|");
        System.out.println("| Memory Management         | Manual (new/delete)      | Automatic GC                  |");
        System.out.println("| Pointers                  | Yes                       | No                            |");
        System.out.println("| Multiple Inheritance      | Supported                 | Only via interfaces           |");
        System.out.println("| Compilation               | Platform dependent        | Platform independent (bytecode)|");
        System.out.println("| Operator Overloading      | Yes                       | Limited (+ with String only)  |");
        System.out.println("| Input/Output              | cin, cout                 | Scanner, System.out.println   |");
        System.out.println("| Exception Handling        | try-catch                 | try-catch-finally, checked    |");
        System.out.println("| Global Functions          | Allowed                   | Not allowed; inside class     |");
        System.out.println("| Templates/Generics        | Templates                 | Generics                      |");
        System.out.println("| Default Values            | None for locals           | Class members initialized     |");
    }
}

/*
Output:
Semantic & Syntax Differences between C++ and Java

1. Memory Management:
    - C++: Programmer manages memory using new/delete.
    - Java: Automatic garbage collection, no delete operator.

2. Pointers:
    - C++: Supports pointers and pointer arithmetic.
    - Java: No pointers; references used instead.

3. Multiple Inheritance:
    - C++: Supports multiple inheritance of classes.
    - Java: No multiple inheritance; uses interfaces.

4. Platform Dependency:
    - C++: Compiled to machine code, platform dependent.
    - Java: Compiled to bytecode, platform independent (JVM).

5. Operator Overloading:
    - C++: Supports operator overloading.
    - Java: Only built-in operator overloading for + with String, no user-defined overloading.

6. Function Overloading:
    - Both support function/method overloading (compile-time polymorphism).

7. Exception Handling:
    - C++: try-catch, but no mandatory checked exceptions.
    - Java: try-catch-finally, checked exceptions must be handled.

8. Input/Output:
    - C++: Uses cin, cout.
    - Java: Uses Scanner class, System.out.println().

9. Header Files vs Packages:
    - C++: Uses #include to import headers.
    - Java: Uses import statement for packages.

10. Classes and Objects:
    - Both are object-oriented, but Java enforces everything inside class.
    - C++ allows global functions and variables.

11. Data Types:
    - C++: Primitive types + pointers + user-defined types.
    - Java: Primitive types + wrapper classes + reference types; no pointers.

12. Keywords:
    - C++: ~95 keywords
    - Java: 53 keywords (all reserved)

13. Templates vs Generics:
    - C++: Uses templates for generic programming.
    - Java: Uses generics for type-safe collections and classes.

14. Default Values:
    - C++: Local variables not initialized automatically.
    - Java: Class member variables initialized with default values.

------------------- Quick Comparison Table -------------------
| Feature                  | C++                        | Java                          |
|--------------------------|---------------------------|-------------------------------|
| Memory Management         | Manual (new/delete)      | Automatic GC                  |
| Pointers                  | Yes                       | No                            |
| Multiple Inheritance      | Supported                 | Only via interfaces           |
| Compilation               | Platform dependent        | Platform independent (bytecode)|
| Operator Overloading      | Yes                       | Limited (+ with String only)  |
| Input/Output              | cin, cout                 | Scanner, System.out.println   |
| Exception Handling        | try-catch                 | try-catch-finally, checked    |
| Global Functions          | Allowed                   | Not allowed; inside class     |
| Templates/Generics        | Templates                 | Generics                      |
| Default Values            | None for locals           | Class members initialized     |
*/