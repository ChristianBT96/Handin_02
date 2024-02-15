package question_2

class SmartPhone(operatingSystem: String, price: Int, releaseYear: Int, hasCamera: Boolean) : Computer(operatingSystem, price, releaseYear) {

    val hasCamera: Boolean = hasCamera

    fun printHasCamera() {
        println("The item has a camera: $hasCamera.")
    }

}