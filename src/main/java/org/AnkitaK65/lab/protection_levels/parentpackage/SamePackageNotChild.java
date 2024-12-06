package org.AnkitaK65.lab.protection_levels.parentpackage;

public class SamePackageNotChild {
    public void showAccess() {
        Parent parent = new Parent();
        System.out.println("Inside SamePackageNotChild Class (Same Package, No Inheritance):");
        System.out.println("Public Variable: " + parent.publicVar); // Accessible
        System.out.println("Protected Variable: " + parent.protectedVar); // Accessible
        System.out.println("Default Variable: " + parent.defaultVar); // Accessible
//         System.out.println("Private Variable: " + parent.privateVar); // Not Accessible
    }
}