package org.AnkitaK65.lab.protection_levels;

import org.AnkitaK65.lab.protection_levels.parentpackage.Parent;
import org.AnkitaK65.lab.protection_levels.parentpackage.SamePackageChild;
import org.AnkitaK65.lab.protection_levels.differentpackage.DifferentPackageChild;
import org.AnkitaK65.lab.protection_levels.parentpackage.SamePackageNotChild;

public class TestAccess {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        System.out.println();

        SamePackageChild samePackageChild = new SamePackageChild();
        samePackageChild.showAccess();
        System.out.println();

        SamePackageNotChild samePackageNotChild = new SamePackageNotChild();
        samePackageNotChild.showAccess();
        System.out.println();

        DifferentPackageChild differentPackageChild = new DifferentPackageChild();
        differentPackageChild.showAccess();
        System.out.println();

        System.out.println("Inside TestAccess Class (Different Package, No Inheritance):");
        System.out.println("Public Variable: " + parent.publicVar); // Accessible
        // System.out.println("Protected Variable: " + parent.protectedVar); // Not Accessible
        // System.out.println("Default Variable: " + parent.defaultVar); // Not Accessible
        // System.out.println("Private Variable: " + parent.privateVar); // Not Accessible




    }
}

//Access Modifiers:-
//public: Accessible from anywhere.
//protected: Accessible in the same package or subclasses in different packages.
//default (no modifier): Accessible only within the same package.
//private: Accessible only within the same class.


//Output:-
//Inside Parent Class:
//Public Variable: 1
//Protected Variable: 2
//Default Variable: 3
//Private Variable: 4
//
//Inside SamePackageChild Class:
//Public Variable: 1
//Protected Variable: 2
//Default Variable: 3
//
//Inside SamePackageNotChild Class (Same Package, No Inheritance):
//Public Variable: 1
//Protected Variable: 2
//Default Variable: 3
//
//Inside DifferentPackageChild Class:
//Public Variable: 1
//Protected Variable: 2
//
//Inside TestAccess Class (Different Package, No Inheritance):
//Public Variable: 1

