import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
//    var array = arrayOf(1,2,3)
//    var array2 = arrayOf(1,2,3)
    val personArray = arrayListOf<Name>(Name("tamil","Arasan"),Name("naren","roy"),Name("shree","dhar"))
    println("Enter your First Name")

    val first = scanner.next()
    var founded = false
    for(name in personArray.indices){
        if(personArray[name].first == first){
            println("your full name = ${personArray[name].first} ${personArray[name].last}")
            founded = true;
        }

    }
    if(!founded){
        println("your name not in the list, please enter your last name to caught up next time")
        val last = scanner.next()
        personArray.add(Name(first,last))
        println("successfully your name added in the list")
        println(personArray)
    }
    scanner.close()
}