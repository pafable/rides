package com.phil.vehicle

class Car {
    String make
    String model
    int topSpeed
    int year
    Date createdOn = new Date()

    // Constructor
    Car(String make, model, int topSpeed, year) {
        this.make = make
        this.model = model
        this.topSpeed = topSpeed
        this.year = year
    }

    def fullName() {
        return "${year} ${make} ${model}"
    }

    // Static method
    def static zoom() {
        return "Vroom!"
    }

    def isFast = (topSpeed >= 100) ? true : false
}
