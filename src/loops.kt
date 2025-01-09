fun main(){
    //ranges, you can create a for loop that iterates over numbers 1 to 5 and prints the number each time.
    var i =10
    var sum = 0
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        println(number)
        // 12345
    }
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (w in words) {
        if (w.startsWith("l"))
            println(w)
    }
    while (i != 0 ){
        println("the value of i = $i before")
        sum++
        i--
        println("the value of i = $i after")
    }
    println("the final value of sum = $sum")
    println("do-while")
    do{
        println("the value sum in do - while sum =$sum ")
        --sum
    }while(sum != 0)
}