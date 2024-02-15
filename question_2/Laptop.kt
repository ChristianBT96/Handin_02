package question_2

class Laptop(operatingSystem: String, price: Int, releaseYear: Int, screenSize: Double) : Computer(operatingSystem, price, releaseYear) {

    val screenSize: Double = screenSize

    fun printScreenSize() {
        println("The screen size of the item is $screenSize inches.")
    }

}