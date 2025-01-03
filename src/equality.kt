//In Kotlin, there are two types of equality:
//
//Structural equality (==) - a check for the equals() function
//
//Referential equality (===) - a check for two references pointing to the same object


fun main() {
    var a = "hello"
    var b = "hello"
    var c: String? = null
    var d: String? = null
    var e = d

    println(a == b)
    // true
    println(a == c)
    // false
    println(c == e)
    // true
     a = "Hello"
     b = a
     c = "world"
     d = "world"

    println(a === b)
    // true
    println(a === c)
    // false
    println(c === d)
    // true
}