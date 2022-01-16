package oop;

// Base Class Vehicle
class Vehicle {

    // Private Fields
    private String make;
    private String color;
    private int year;
    private String model;

    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }

}

// Derived Class Car
class Car extends Vehicle {

    // Private field
    private String bodyStyle;

    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }
    //details of car
    public void carDetails() {
        //calling method from parent class
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }
}

class Main1 {

    public static void main(String[] args) {
        //creation of car Object
        Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan");
        elantraSedan.carDetails(); //calling method to print details
    }

}
