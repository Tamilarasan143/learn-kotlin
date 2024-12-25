fun main() {
    val tamil = 10;//we can't change a read-only variable once you have given it a value.
    var customers = 10 // There are 10 customers in the queue
    customers = 9
    println(customers)
    println("Hello World! $tamil")
}