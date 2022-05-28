package com.phil.mobile

class Vehicle {
    String make
    String model
    int topSpeed
    int year
    Date createdOn = new Date()

    def fullName() {
        return "${year} ${make} ${model}"
    }

    // Static method
//    def static zoom() {
//        return "Vroom!"
//    }

    def zoom() {
        return "Vroom!"
    }

    def isFast = (topSpeed >= 100) ? true : false
}
