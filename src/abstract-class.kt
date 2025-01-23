
/*
*   Abstract Class
* */
fun main(args: Array<String>) {

//    var person = MyPerson()   // Not allowed. You cannot create instance of abstract class

    val person = Indian()       // Allowed. Abstract Super class reference variable
//    // pointing to child class object.
//    person.name = "Steve"
    println(person.name)
    person.eat()
    person.goToSchool()
}

abstract class MyPerson {     // you cannot create instance of abstract class

     var name: String = "roger" // abstract properties are 'open' by default

    abstract fun eat()      // abstract properties are 'open' by default

    open fun getHeight() {} // A 'open' function ready to be overridden

    fun goToSchool() {}     // A normal function
}

class Indian: MyPerson() {

     var superName: String = super.name

    override fun eat() {
        // Our own code
    }
}