// Base class for all vehicles
open class Vehicle(val make: String, val model: String) {
    open fun displayInfo() {
        println("Vehicle: $make $model")
    }
}

// Interface for vehicles that can fly
interface Flyable {
    fun fly()
}

// Interface for vehicles that can swim
interface Swimmable {
    fun swim()
}

// Derived class for Cars
class Car(make: String, model: String) : Vehicle(make, model) {
    override fun displayInfo() {
        println("Car: $make $model")
    }
}

// Derived class for Boats
// TODO: Implement Swimmable
//class Boat(make: String, model: String) : Vehicle(make, model), Swimmable {
//    override fun displayInfo() {
//        super.displayInfo()
//        // Additional boat-specific info can be displayed here
//    }
//    // Implement swim method
//}

// Derived class for AmphibiousVehicle
// TODO: Implement Swimmable
//class AmphibiousVehicle(make: String, model: String) : Vehicle(make, model), Swimmable {
//    override fun displayInfo() {
//        println("Amphibious Vehicle: $make $model")
//    }
//    // Implement swim method
//}

// Derived class for Planes
// TODO: Implement Flyable
//class Plane(make: String, model: String) : Vehicle(make, model), Flyable {
//    override fun displayInfo() {
//        println("Plane: $make $model")
//    }
//    // Implement fly method
//}

fun main() {
    // TODO: Instantiate each vehicle and demonstrate their capabilities
}
