package question_3

open class Product(name: String, price: Double, quantity: Int) {
    val name: String = name
    var price: Double = price
    var quantity: Int = quantity

    open fun identifyProductCategory() {
        println("This product is a base product")
    }
}