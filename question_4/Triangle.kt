package question_4

class Triangle(height: Double, base: Double, color: String, isTransparent: Boolean): Shape(color, isTransparent) {

    private var _height: Double = height
    private var _base: Double = base

    override fun printCalculateArea() {
        // The formula for the area of a triangle is: 0.5 * base * height
        println("The area of the triangle is: ${0.5 * _height * _base}")
    }

    override fun printCalculateCircumference() {
        // The formula for the circumference of a triangle is: base + height + sqrt(height^2 + base^2)
        println("The circumference of the triangle is: ${_height + _base + Math.sqrt((_height * _height) + (_base * _base))}")
    }
}