import java.util.*

data class SamplePerson(val name: String, val age: Int)

val personInfo: MutableList<SamplePerson> =
    mutableListOf(
        SamplePerson("shreedar", 24),
        SamplePerson("tamil", 23),
        SamplePerson("sase", 24),
        SamplePerson("naren", 99)
    )

fun match(count: Int, name: List<String>): String {
    return when (count) {
        0 -> "No match found";
        else -> "Age Match found $name"
    }
}

fun main() {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter age: ")

    // nextInt() reads the next integer from the keyboard
    //reader.nextInt()
    val integer: Int = reader.nextInt()
    val found = personInfo.filter { age -> age.age == integer }.map { person -> person.name }
    println(match(found.count(), found))
}