import com.sun.org.apache.xml.internal.security.Init

//they recommend that you declare properties as read-only (val) unless they need to be changed after an instance of the class is created.
class Contact(val id: Int, var email: String){
    lateinit var name:String
    fun printId() {
        println(id)
    }
}
class Person1(fName:String,personage:Int){
    val firstName:String;
    var age:Int;
    init {
        firstName = fName;
        age = personage;
        println(firstName);
        print(age);
    }
}
fun main() {
    val contact = Contact(1, "mary@gmail.com")
    val person = Person1("tamil",23)
    person.firstName

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
    // Prints the value of the lateinit property : name
    println(contact.name)

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