package org.AnkitaK65.Unit1;

// Example15: Expressions in Java

// 1. Expression: Combination of variables, operators, and values that produces a result
// 2. Expression types include:
//    - Arithmetic expression        : a + b
//    - Relational expression        : a > b
//    - Logical expression           : x && y
//    - Assignment expression        : c = a + b
//    - Unary expression             : -d, ++d, d--
//    - Ternary expression           : condition ? expr1 : expr2
//    - Type comparison expression   : obj instanceof Class
// 3. Every expression evaluates to a single value
// 4. Expressions can be nested, e.g., (a + b) * c > d && x || y
// 5. Expressions are the building blocks of statements in Java

/*
Key Points:
- Expression ≠ Statement:
- Expression produces a value; statement performs an action.
- Statements can contain expressions: e.g., int c = a + b;
- Expressions can be nested for complex logic
- Type compatibility is important when combining expressions
*/

class Example15 {
    public static void main(String[] args) {

        // ---------- 1. Arithmetic Expression ----------
        int a = 10;
        int b = 5;
        int sum = a + b; // arithmetic expression: a + b
        System.out.println("Arithmetic Expression (a + b) = " + sum);

        // ---------- 2. Relational Expression ----------
        boolean isGreater = a > b; // relational expression: a > b
        System.out.println("Relational Expression (a > b) = " + isGreater);

        // ---------- 3. Logical Expression ----------
        boolean x = true;
        boolean y = false;
        boolean logicalResult = x && y; // logical expression: x && y
        System.out.println("Logical Expression (x && y) = " + logicalResult);

        // ---------- 4. Assignment Expression ----------
        int c;
        c = a + b; // assignment expression: assigns value to c
        System.out.println("Assignment Expression (c = a + b) = " + c);

        // ---------- 5. Unary Expression ----------
        int d = 5;
        int unaryResult = -d; // unary expression: negation of d
        System.out.println("Unary Expression (-d) = " + unaryResult);

        // ---------- 6. Ternary Expression ----------
        int num = 15;
        String parity = (num % 2 == 0) ? "Even" : "Odd"; // ternary expression
        System.out.println("Ternary Expression (num % 2 == 0 ? \"Even\" : \"Odd\") = " + parity);

        // ---------- 7. Type Comparison Expression ----------
        String str = "Java";
        boolean check = str instanceof String; // type comparison expression
        System.out.println("Type Comparison Expression (str instanceof String) = " + check);
    }
}

/*
Output:
Arithmetic Expression (a + b) = 15
Relational Expression (a > b) = true
Logical Expression (x && y) = false
Assignment Expression (c = a + b) = 15
Unary Expression (-d) = -5
Ternary Expression (num % 2 == 0 ? "Even" : "Odd") = Odd
Type Comparison Expression (str instanceof String) = true
*/