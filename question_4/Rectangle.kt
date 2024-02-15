package question_4

class Rectangle(height: Double, length: Double, color: String, isTransparent: Boolean): Shape(color, isTransparent) {

    private var _height: Double = height
    private var _length: Double = length

    override fun printCalculateArea() {
        // The formula for the area of a rectangle is: height * length
        println("The area of the rectangle is: ${_height * _length}")
    }

    override fun printCalculateCircumference() {
        // The formula for the circumference of a rectangle is: 2 * (height + length)
        println("The circumference of the rectangle is: ${2 * (_height + _length)}")
    }

}