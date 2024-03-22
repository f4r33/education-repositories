fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

data class Person(
    val name: String,
    val age: Int,
    val isStudent: Boolean,
    val address: Address,
    val phoneNumbers: List<String>,
    val spouse: String?
)

data class Address(
    val street: String,
    val city: String,
    val zipCode: Int,
    val coordinates: Coordinates
)

data class Coordinates(
    val latitude: Double,
    val longitude: Double
)