import com.phil.mobile.Car
import com.phil.mobile.Plane

Car c1 = new Car("Chevrolet", "Corvette C8", 195, 2022)
Plane p1 = new Plane("Grumman", "F-14 Tomcat", 761, 1974)

println "C8 goes ${c1.zoom()}"
println "F-14 goes ${p1.zoom()}"
println c1.fullName()

println "Is this car fast: ${c1.isFast}"
println "Is this plane fast: ${p1.isFast}"