package org.AnkitaK65.Unit1;

// Example26: Access Modifiers in Methods (Java)

/*
Access modifiers define the visibility (scope) of methods.

1. public
    - Method is accessible from anywhere.
    - Used when method should be available to all classes.

2. protected
    - Accessible within the same package.
    - Also accessible in subclasses (even in different packages).

3. default (no modifier)
    - Accessible only within the same package.
    - Also called package-private.

4. private
    - Accessible only within the same class.
    - Used for data hiding and encapsulation.

Order of visibility (from most open to most restricted):
public → protected → default → private

Rules:
- Methods in interfaces are public by default.
- private methods cannot be overridden.
- Access level cannot be reduced while overriding a method.
*/

class Example26 {

    public static void main(String[] args) {

        Example26 obj = new Example26();

        // public method
        obj.publicMethod();

        // protected method (same class/package)
        obj.protectedMethod();

        // default method (same package)
        obj.defaultMethod();

        // private method cannot be accessed directly
        obj.callPrivateMethod(); // indirect access
    }

    // 1. Public method
    public void publicMethod() {
        System.out.println("Public Method: Accessible from anywhere");
    }

    // 2. Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within package and subclasses");
    }

    // 3. Default method (no modifier)
    void defaultMethod() {
        System.out.println("Default Method: Accessible within same package only");
    }

    // 4. Private method
    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class");
    }

    // Helper method to access private method
    public void callPrivateMethod() {
        privateMethod();
    }
}

/*
Access Modifier | Accessibility
-----------------------------------------
public          | Everywhere
protected       | Same package + subclasses
default         | Same package only
private         | Same class only

- private → most restrictive
- public → least restrictive
- Used to achieve encapsulation and security
*/

/*
Output:
Public Method: Accessible from anywhere
Protected Method: Accessible within package and subclasses
Default Method: Accessible within same package only
Private Method: Accessible only within this class
*/