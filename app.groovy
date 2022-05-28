import com.phil.vehicle.Car
import com.phil.vehicle.Plane

Car c1 = new Car("Chevrolet", "Corvette C8", 195, 2022)
Plane p1 = new Plane("Grumman", "F-14 Tomcat", 761, 1974)

println Car.zoom()
println c1.fullName()
println "Is this car fast: ${c1.isFast}"

println "Is this plane fast: ${p1.isFast}"