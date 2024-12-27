data class Employee (val name: String, var salary: Int)
//check for the presence of null values within conditional expressions
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}
//By using the Elvis operator ?: to give default value and  using safe call operator ?.
fun salaryById(id: Int) = employeeById(id)?.salary ?: 0




fun main() {
    val nullString: String? = null
    println(describeString(nullString))

    println((1..5).sumOf { id -> salaryById(id) })
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    //neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK
    nullable = null


    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
//    println(strLength(nullable))  // Throws a compiler error
}