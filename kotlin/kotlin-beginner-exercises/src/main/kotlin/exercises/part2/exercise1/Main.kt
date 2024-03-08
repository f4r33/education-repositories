package exercises.part2.exercise1

// Base class representing an Animal
open class Animal(val name: String, val age: Int) {
    // Method to make a sound - should be overridden by subclasses
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

// Bird class inheriting from Animal
// TODO: Override the makeSound method to print "Chirp"
class Bird(name: String, age: Int) : Animal(name, age) {
    // Your code here
}

// Mammal class inheriting from Animal
// TODO: Override the makeSound method to print "Roar"
class Mammal(name: String, age: Int) : Animal(name, age) {
    // Your code here
}

fun main() {
    // TODO: Create an instance of Bird and Mammal
    // Call the makeSound method on each instance to demonstrate polymorphism

    // Example:
    // val bird = Bird("Parrot", 5)
    // bird.makeSound()

    // Your code here
}
