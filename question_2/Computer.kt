package question_2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

open class Computer(operatingSystem: String, price: Int, releaseYear: Int) {

    val operatingSystem: String = operatingSystem
    var price: Int = price
    val releaseYear: Int = releaseYear


    fun printWhatOperatingSystem() {
        println("The operating system of the item is $operatingSystem.")
    }

    // Used to get the current year
    @RequiresApi(Build.VERSION_CODES.O)
    fun printHowOld() {
        // Get the current year
        val currentDate = LocalDate.now()
        val currentYear = currentDate.year
        // Print the age of the item
        println("The item is ${currentYear - releaseYear} years old.")
    }

    fun printPrice() {
        println("The price of the item is $price.")
    }

}