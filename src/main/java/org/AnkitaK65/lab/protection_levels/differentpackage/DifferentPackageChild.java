package org.AnkitaK65.lab.protection_levels.differentpackage;

import org.AnkitaK65.lab.protection_levels.parentpackage.Parent;

public class DifferentPackageChild extends Parent {
    public void showAccess() {
        System.out.println("Inside DifferentPackageChild Class:");
        System.out.println("Public Variable: " + publicVar); // Accessible
        System.out.println("Protected Variable: " + protectedVar); // Accessible
        // System.out.println("Default Variable: " + defaultVar); // Not Accessible
        // System.out.println("Private Variable: " + privateVar); // Not Accessible
    }
}
