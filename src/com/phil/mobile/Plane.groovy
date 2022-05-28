package com.phil.mobile

@groovy.transform.ToString
class Plane extends Vehicle {
    Plane(String make, model, int topSpeed, year) {
        this.make = make
        this.model = model
        this.topSpeed = topSpeed
        this.year = year
    }

    @Override
    def zoom() {
        return "Vrooooom!!!!"
    }
}
