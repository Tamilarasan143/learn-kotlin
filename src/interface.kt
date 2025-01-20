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
 // As per the rule we implement two interface and that interfaces have same name methods we have to override it
    override fun Eat() {
        // we have to use generic to mention which interface Eat() method we are use . Without generic, it throws error
        super<PersonStyle>.Eat()
        super<AnotherPersonStyle>.Eat()
    }


}

fun main() {
    val person = NormalPerson()
    println(person.name)
}