import android.os.Build
import androidx.annotation.RequiresApi
import question_1.Employee
import question_2.Laptop
import question_2.SmartPhone
import question_3.Book
import question_3.Shoe
import question_3.TShirt
import question_4.Circle
import question_4.Rectangle
import question_4.Triangle

// Used to get the current year
@RequiresApi(Build.VERSION_CODES.O)

fun main() {

    // 1)
    // Creating two Employee objects
    println("Exercise 1:")
    val employee1: Employee = Employee("Jane", "Doe", 1000.0)
    val employee2: Employee = Employee("John", "Doe", -45.0)
    println("Displaying each object's yearly salary")
    println(employee1.salary)
    println(employee2.salary)
    println()

    println("Giving each Employee a 10% raise and displaying each Employee's yearly salary again")
    employee1.salary = employee1.salary * 1.1
    println(employee1.salary)
    println()

    // Since employee2's salary has been set to 0.0, it is first adjusted to 200.0 and then given a 10% raise
    employee2.salary = 200.0
    println(employee2.salary)
    employee2.salary = employee2.salary * 1.1
    println(employee2.salary)
    println()

    // 2)
    println("Exercise 2:")
    val smartPhone1: SmartPhone = SmartPhone("Android", 499, 2020, true)
    smartPhone1.printWhatOperatingSystem()
    smartPhone1.printHowOld()
    smartPhone1.printHasCamera()
    println()
    val laptop1: Laptop = Laptop("Windows", 899, 2021, 15.6)
    laptop1.printWhatOperatingSystem()
    laptop1.printHowOld()
    laptop1.printScreenSize()
    laptop1.printPrice()
    println()

    // 3)
    println("Exercise 3:")
    val book1: Book = Book("The Hobbit", 15.99, 5)
    book1.identifyProductCategory()
    println()
    val shoe1: Shoe = question_3.Shoe("Nike", 99.99, 10)
    shoe1.identifyProductCategory()
    println()
    val tShirt1: TShirt = TShirt("Adidas", 29.99, 20)
    tShirt1.identifyProductCategory()
    println()


    // 4)
    println("Exercise 4:")
    val circle1: Circle = Circle("Red", true, 5.0)
    circle1.printCalculateArea()
    circle1.printCalculateCircumference()
    println()
    val rectangle1: Rectangle  = Rectangle(5.0, 10.0, "Yellow", false)
    rectangle1.printCalculateArea()
    rectangle1.printCalculateCircumference()
    println()
    val triangle1: Triangle = Triangle(5.0, 10.0, "Magenta", true)
    triangle1.printCalculateArea()
    triangle1.printCalculateCircumference()

}

// 1.
// Create a class called Employee that includes three pieces of information as instance variables
//      * A first name
//      * A last name
//      * A monthly salary
// Your class should have a constructor that initializes the three instance variables.
// If the monthly salary is not positive, set it to 0.0.
// Create two Employee objects and display each object’s yearly salary.
// Then give each Employee a 10% raise and display each Employee’s yearly salary again.

// See Employee class in "Question_1" package.

// 2.
// Create a new class called Computer. Before you add any more code, know that you will need to add two additional classes: Laptop and SmartPhone
//  * For a parent class add 3 properties, 2 methods, and a constructor.
//  * For a child class add at least 1 additional property and 1 additional method.
// In the main method create a Laptop and a SmartPhone

// See Computer/Laptop/SmartPhone class in "Question_2" package.

// 3.
// Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
// Subclass it to create specific product types like Shoe, T-shirt, and Book.
// Override the function such that:
// * The shoe outputs "I am a shoe" .
// * The T-shirt outputs "I am a T-shirt"
// * The book outputs "I am a book"

// See Product/Book/Shoe/TShirt class in "Question_3" package.

// 4.
// Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape.
// Every shape has two attributes
// * color
// * isTransparent
// Furthermore every class has private attributes to calculate perimeter and area for each shape.
// E.g. a Rectangle has the attributes: height, width, color & isTransparent
// The attributes are set in the constructor
// The 3 classes all overrides the following abstract methods from their parent class:
// * calculatePermeter
// * calculateArea
// The functions will return the permeter or area of the shape.

// See Shape/Circle/Rectangle/Triangle class in "Question_4" package.