package question_1

class Employee(firstName: String, lastName: String, salary: Double) {

    val firstName: String = firstName
    val lastName: String = lastName

    private var _salary: Double = salary

    var salary: Double
        get() {
            if (_salary < 0) {
                println("Salary cannot be < 0, it has been adjusted to 0")
                return 0.0
            }
            return _salary
        }
        set(value) {
            if (value < 0) {
                println("Salary cannot be < 0, it has been adjusted to 0")
                _salary = 0.0
            } else {
                _salary = value
            }
        }
}