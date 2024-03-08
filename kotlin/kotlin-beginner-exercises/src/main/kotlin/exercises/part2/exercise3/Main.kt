package exercises.part2.exercise3

// Generic class for holding items
class ItemContainer<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun getItem(index: Int): T? = items.getOrNull(index)
}

// Custom class Book
class Book(val title: String, val author: String) {
    override fun toString(): String {
        return "Book(title='$title', author='$author')"
    }
}

// Custom class Electronic
class Electronic(val name: String, val category: String) {
    override fun toString(): String {
        return "Electronic(name='$name', category='$category')"
    }
}

fun main() {
    // Example usage with String
    val stringContainer = ItemContainer<String>()
    stringContainer.addItem("Hello")
    println(stringContainer.getItem(0))

    // TODO: Create an ItemContainer for Books and add a few Book objects
    // Retrieve and print a book from the container

    // TODO: Create an ItemContainer for Electronics and add a few Electronic objects
    // Retrieve and print an electronic item from the container
}
