package com.phil.mobile

@groovy.transform.ToString
class Car extends Vehicle implements drivingAbility {
    Car(String make, model, int topSpeed, year) {
        this.make = make
        this.model = model
        this.topSpeed = topSpeed
        this.year = year
    }
}
