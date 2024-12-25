import kotlin.math.PI
//function with parameters called int which is number and action called return lambda function
val upperCaseString = { text : String -> text.uppercase() }
fun repeatN(n: Int, action: (i:Int) -> Unit) {
    for (i in 1..n) {
        action(i)
    }
}
//function with list parameter
fun iterateURLS(list:List<String>) {
    for (i in list) {
        println(i)
    }
}
//default values for your function parameters.
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds
//single-expression function.
fun circleArea(radius: Int) =  PI * radius * radius

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))
    println(circleArea(2))
    println(upperCaseString("hello"))
    repeatN(5) {i->
        println("Hello $i")
    }
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map({t->prefix +"/$id/$t"})
    val filterURLS = actions.map({t->prefix +"/$id/$t"}).filter { u-> u.endsWith("title") }
    println(urls)
    iterateURLS(filterURLS)
}