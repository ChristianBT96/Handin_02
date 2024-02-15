package question_4

import kotlin.math.pow

class Circle(color: String, isTransparent: Boolean, radius: Double ) : Shape(color, isTransparent) {

    private var _radius: Double = radius

    var radius: Double = _radius
        get() {
            if (_radius < 0) {
                field = 0.0
            }
            return field
        }
        set(value) {
            if (value < 0) {
                println("Radius cannot be < 0, it has been adjusted to 0")
                field = 0.0
            } else {
                field = value
            }
        }

    override fun printCalculateArea() {
        // The formula for the area of a circle is: π * r^2
        // where r is the radius of the circle
        // .pow(2) is the same as squaring the radius
        // Math.PI is a constant in the Math class
        println("The area of the circle is:" + (Math.PI * radius.pow(2)))
    }

    override fun printCalculateCircumference(){
        // The formula for the circumference of a circle is: 2 * π * r
        println("The circumference of the circle is: " + (2 * Math.PI * radius))
    }
}