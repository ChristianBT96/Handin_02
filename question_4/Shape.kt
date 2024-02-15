package question_4

abstract class Shape(color: String, isTransparent: Boolean) {

    val color: String = color
    val isTransparent: Boolean = isTransparent

    fun printColor() {
        println("The color of the shape is: $color")
    }

    fun printIsTransparent() {
        if (isTransparent) {
            println("The shape is transparent")
        } else {
            println("The shape is not transparent")
        }
    }

    abstract fun printCalculateArea()

    abstract fun printCalculateCircumference()
}