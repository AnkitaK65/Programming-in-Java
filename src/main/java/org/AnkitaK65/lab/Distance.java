// Question: 23. Write a program to create a "distance" class with methods where distance is computed in terms of feet and inches.
// Demonstrate how to create objects of a class and the use of the this pointer.

package org.AnkitaK65.lab;

// Create a class to represent Distance
class Distance {
    // Instance variables
    int feet;
    int inches;

    // Constructor to initialize the distance
    Distance(int feet, int inches) {
        this.feet = feet;  // Using 'this' to refer to the current object's feet
        this.inches = inches;  // Using 'this' to refer to the current object's inches
    }

    // Method to add two distances
    public void addDistance(Distance d) {
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

    public static void main(String[] args) {
        // Creating objects of the Distance class
        Distance d1 = new Distance(5, 8); // 5 feet 8 inches
        Distance d2 = new Distance(3, 10); // 3 feet 10 inches

        // Display initial distances
        System.out.print("Initial ");
        d1.display();
        d2.display();

        // Adding distances using the addDistance method
        d1.addDistance(d2);

        // Display the new distance after addition
        System.out.print("After addition: ");
        d1.display();
    }
}
//Output:
//Initial Distance: 5 feet 8 inches.
//Distance: 3 feet 10 inches.
//After addition: Distance: 9 feet 6 inches.
