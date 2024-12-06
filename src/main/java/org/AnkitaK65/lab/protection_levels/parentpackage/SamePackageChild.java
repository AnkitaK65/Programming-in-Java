package org.AnkitaK65.lab.protection_levels.parentpackage;

public class SamePackageChild extends Parent {
    public void showAccess() {
        System.out.println("Inside SamePackageChild Class:");
        System.out.println("Public Variable: " + publicVar); // Accessible
        System.out.println("Protected Variable: " + protectedVar); // Accessible
        System.out.println("Default Variable: " + defaultVar); // Accessible
        // System.out.println("Private Variable: " + privateVar); // Not Accessible
    }
}
