package org.AnkitaK65.lab.protection_levels.parentpackage;

// Q31. Write a program that illustrates different levels of protection in classes/subclasses
// belonging to the same package or different packages.

public class Parent {
    // Variables with different access modifiers
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // Default (no modifier)
    private int privateVar = 4;

    // Method to display variable values
    public void display() {
        System.out.println("Inside Parent Class:");
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Private Variable: " + privateVar);
    }
}
