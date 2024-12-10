
// Question: 24. Modify the "distance" class by creating a constructor for assigning values (feet and inches) to the distance object.
// Create another object and assign the second object as a reference variable to another object reference variable.
// Further, create a third object which is a clone of the first object.

package org.AnkitaK65.lab;

// Create a modified Distance class
class DistanceModified implements Cloneable {
    // Instance variables
    int feet;
    int inches;

    // Constructor to initialize the distance
    DistanceModified(int feet, int inches) {
        this.feet = feet;  // Using 'this' to refer to the current object's feet
        this.inches = inches;  // Using 'this' to refer to the current object's inches
    }

    // Method to add two distances
    public void addDistance(DistanceModified d) {
        this.feet += d.feet;  // Use 'this' to access the current object's feet
        this.inches += d.inches;  // Use 'this' to access the current object's inches

        // If inches exceed 12, convert to feet
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }

    // Method to display the distance
    public void display() {
        System.out.println("Distance: " + this.feet + " feet " + this.inches + " inches.");
    }

    // Method to clone the object (creates a new copy)
    public DistanceModified clone() throws CloneNotSupportedException {
        return (DistanceModified) super.clone();
    }

    public static void main(String[] args) {
        // Creating objects of the DistanceModified class
        DistanceModified d1 = new DistanceModified(5, 8); // 5 feet 8 inches
        DistanceModified d2 = new DistanceModified(3, 10); // 3 feet 10 inches

        // Display initial distances
        System.out.print("Initial ");
        d1.display();
        d2.display();

        // Assigning the reference of d2 to d1
        DistanceModified d3 = d2;  // Now d3 points to the same object as d2

        // Display the distances after assignment
        System.out.print("After assigning d2 to d3: ");
        d3.display();

        // Creating a clone of the first object d1
        try {
            DistanceModified d4 = d1.clone();  // Clone d1 to d4
            System.out.print("Cloned object d4 (clone of d1): ");
            d4.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
//Initial Distance: 5 feet 8 inches.
//Distance: 3 feet 10 inches.
//After assigning d2 to d3: Distance: 3 feet 10 inches.
//Cloned object d4 (clone of d1): Distance: 5 feet 8 inches.

///*
//    1. **Assigning reference**: The second object `d2` is assigned to a new reference variable `d3`.
//       Now, both `d2` and `d3` point to the same object, meaning any changes to `d2` will also reflect in `d3`.
//
//    2. **Cloning**: A third object `d4` is created using the `clone()` method.
//       This creates a new object with the same values as `d1`, but `d4` is independent of `d1`. Any changes to `d4` will not affect `d1`.
//*/