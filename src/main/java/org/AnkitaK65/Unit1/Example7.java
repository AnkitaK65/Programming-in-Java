package org.AnkitaK65.Unit1;

// Example7: Operators in Java – Types and Precedence
// This program JUST LISTS:
// 1. Types of operators with one-line use
// 2. Operator precedence (highest to lowest)

class Example7 {
    public static void main(String[] args) {

        System.out.println("TYPES OF OPERATORS IN JAVA\n");

        System.out.println("1. Arithmetic Operators      : Perform mathematical operations (+, -, *, /, %, ++, --)");
        System.out.println("2. Assignment Operators      : Assign values to variables (=, +=, -=, *=, /=)");
        System.out.println("3. Relational Operators      : Compare values and return true or false (==, !=, >, <, >=, <=)");
        System.out.println("4. Logical Operators         : Combine boolean expressions (&&, ||, !)");
        System.out.println("5. Unary Operators           : Operate on a single operand (-, ++, --, !)");
        System.out.println("6. Bitwise Operators         : Perform operations at bit level (&, |, ^, ~, <<, >>)");
        System.out.println("7. Ternary Operator          : Short form of if-else (condition ? expr1 : expr2)");
        System.out.println("8. Type Comparison Operator  : Check object type at runtime (instanceof)");

        System.out.println("\n--------------------------------------------\n");

        System.out.println("OPERATOR PRECEDENCE IN JAVA (Highest to Lowest)\n");

        System.out.println("1. Parentheses ()             : Control order of evaluation");
        System.out.println("2. Unary                      : ++  --  +  -  !  ~");
        System.out.println("3. Multiplicative             : *  /  %");
        System.out.println("4. Additive                   : +  -");
        System.out.println("5. Shift                      : <<  >>  >>>");
        System.out.println("6. Relational                 : <  >  <=  >=");
        System.out.println("7. Equality                   : ==  !=");
        System.out.println("8. Bitwise AND                : &");
        System.out.println("9. Bitwise XOR                : ^");
        System.out.println("10. Bitwise OR                : |");
        System.out.println("11. Logical AND               : &&");
        System.out.println("12. Logical OR                : ||");
        System.out.println("13. Ternary                   : ? :");
        System.out.println("14. Assignment                : =  +=  -=  *=  /=  %=");
    }
}

/*
Output:
TYPES OF OPERATORS IN JAVA

1. Arithmetic Operators      : Perform mathematical operations (+, -, *, /, %, ++, --)
2. Assignment Operators      : Assign values to variables (=, +=, -=, *=, /=)
3. Relational Operators      : Compare values and return true or false (==, !=, >, <, >=, <=)
4. Logical Operators         : Combine boolean expressions (&&, ||, !)
5. Unary Operators           : Operate on a single operand (-, ++, --, !)
6. Bitwise Operators         : Perform operations at bit level (&, |, ^, ~, <<, >>)
7. Ternary Operator          : Short form of if-else (condition ? expr1 : expr2)
8. Type Comparison Operator  : Check object type at runtime (instanceof)

--------------------------------------------

OPERATOR PRECEDENCE IN JAVA (Highest to Lowest)

1. Parentheses ()             : Control order of evaluation
2. Unary                      : ++  --  +  -  !  ~
3. Multiplicative             : *  /  %
4. Additive                   : +  -
5. Shift                      : <<  >>  >>>
6. Relational                 : <  >  <=  >=
7. Equality                   : ==  !=
8. Bitwise AND                : &
9. Bitwise XOR                : ^
10. Bitwise OR                : |
11. Logical AND               : &&
12. Logical OR                : ||
13. Ternary                   : ? :
14. Assignment                : =  +=  -=  *=  /=  %=
*/