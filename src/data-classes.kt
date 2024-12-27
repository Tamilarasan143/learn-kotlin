//To declare a data class, use the keyword data
data class User(val name: String, val id: Int)
data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countryCode: String)
fun main(){
    val user = User("Alex", 1)

// Automatically uses toString() function so that output is easy to read
    println(user)
// User(name=Alex, id=1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

// Compares user to second user
    println("user == secondUser: ${user.equals(secondUser)}")
// user == secondUser: true

// Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")
// user == thirdUser: false
// Creates an exact copy of user
    println(user.copy())
// User(name=Alex, id=1)

// Creates a copy of user with name: "Max"
    println(user.copy("Max"))
// User(name=Max, id=1)

// Creates a copy of user with id: 3
    println(user.copy(id = 3))
// User(name=Alex, id=3)
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    print(person)
}