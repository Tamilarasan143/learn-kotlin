fun main(){
    val range = 1..4;
    println("range $range")
    val rangeNotEnd = 1..<4;
    println("rangeNotEnd $rangeNotEnd")
    val rangeReverse = 1 downTo 4
    println("rangeReverse $rangeReverse")
    //To declare a range that increments in a step that isn't 1, use step and your desired increment value
    val rangeConditionalIncrement = 1..5 step 2
    println("rangeConditionalIncrement $rangeConditionalIncrement");
    //we can also do the same with Char ranges:
    val rangeWithChar = 'a'..'d'
    println("rangeWithChar $rangeWithChar");
    val rangeConditionalCharIncrement = 'z' downTo 's' step 2
    println("rangeConditionalCharIncrement $rangeConditionalCharIncrement");
}