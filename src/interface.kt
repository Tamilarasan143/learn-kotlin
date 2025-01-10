import javax.swing.SwingWorker

interface PersonStyle {
    // we cannot create the instance of interface
    var name: String;  // variables in interface are abstract by default
    fun work(): Unit; // Methods in interface are abstract by default
    fun Eat() { // Normal methods are public and open by default but NOT FINAL
        println("do not")
    }
}

interface AnotherPersonStyle {
    // we cannot create the instance of interface
    var name: String;  // variables in interface are abstract by default
    fun work(): Unit; // Methods in interface are abstract by default not final
    fun Eat() { // Normal methods are public and open by default but NOT FINAL
        println("do not")
    }
}

class NormalPerson : PersonStyle, AnotherPersonStyle {

    override var name = "tamil"

    override fun work() {
        println("")
    }

    override fun Eat() {
        super<PersonStyle>.Eat()
        super<AnotherPersonStyle>.Eat()
    }


}

fun main() {
    val person = NormalPerson()
    println(person.name)
}