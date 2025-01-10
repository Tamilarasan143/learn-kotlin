import java.util.*

val names = arrayOf("Shreedar", "Tamil", "Sase", "Khosa", "Arun")
val ages = arrayOf(24, 23, 24, 99, 24)

fun main() {
    val scanner = Scanner(System.`in`)


    println("Enter the age")

    val enteredAge = scanner.nextInt()
    var found = false
    for (i in names.indices) {
        if (ages[i] == enteredAge) {
            println(names[i])
            found = true
        }
    }
    if (!found) {
        println("No one found with that age.")
    }
    scanner.close()
}