// File: DifferenceObjectsClasses.java

public class DifferenceObjectsClasses {

    // The Car class serves as a blueprint for creating Car objects
    static class Car {
        // Class attributes (also called instance variables)
        private String make;
        private String model;
        private int year;
        private double mileage;

        // Constructor: Used to initialize objects of this class
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.mileage = 0.0;
        }

        // Class methods: Define the behavior of Car objects
        public void drive(double distance) {
            this.mileage += distance;
            System.out.println(this.make + " " + this.model + " drove " + distance + " miles.");
        }

        public void displayInfo() {
            System.out.println("Car: " + this.year + " " + this.make + " " + this.model);
            System.out.println("Mileage: " + this.mileage + " miles");
        }
    }

    // The main method demonstrates the creation and use of objects based on the Car class
    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2023);

        // Demonstrating that objects have their own state
        car1.drive(100.5);
        car2.drive(75.2);

        // Displaying information for each car object
        System.out.println("\nCar 1 Info:");
        car1.displayInfo();

        System.out.println("\nCar 2 Info:");
        car2.displayInfo();

        // Demonstrating that objects of the same class can have different states
        car1.drive(50.0);

        System.out.println("\nUpdated Car 1 Info:");
        car1.displayInfo();
    }
}