//they recommend that you declare properties as read-only (val) unless they need to be changed after an instance of the class is created.
class Contact(val id: Int, var email: String){
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
//    Contact is a class.
//
//    contact is an instance of the Contact class.
//
//    id and email are properties.
//
//    id and email are used with the default constructor to create contact.
//
//    Kotlin classes can have many constructors, including ones that you define yourself. To learn more about how to declare multiple constructors, see Constructors.

    // Calls member function printId()
    contact.printId()
    // 1

    // Prints the value of the property: id
    println(contact.id)
    // 1

    // Updates the value of the property: id
    //contact.id = 2
    // it throws an error called Val cannot be reassigned

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com
}