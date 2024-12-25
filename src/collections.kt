fun main(){
// Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    val value = readOnlyShapes[1] + "hello"
    println("value in readOnlyShapes list $value")
// [triangle, square, circle]

// Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    val list = readOnlyShapes.map { s -> s + "hello"  }
    shapes.add("apple")
    println(list)
    println(readOnlyShapes)
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
// [apple, banana, cherry]
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val total = greenNumbers.count() + redNumbers.count()
    print(total);

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}
