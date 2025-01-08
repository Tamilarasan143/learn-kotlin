
//In kotlin by default , the classes are final class
// the final class cannot be subclassed

//by using the open annotation on a class . Compiler allows you to derive new classes form it
open class A (val aValue:Int){
    val a = "base class "
    val value = "properties and it value of class A value =$aValue"
    init {
        println(a)
        println(value)
    }
}
class B(aValue: Int) :A(aValue) {
    val b = "B is one of the derived class form A = $aValue"
    fun bValue(){
        println(b)
    }
}
class C(aValue: Int) :A(aValue) {
    val c = "C is one of the derived class form A = $aValue"
    fun cValue(){
        println(c)
    }
}
fun main() {
    val b= B(20)
    b.bValue()
    val c = C(22)
    c.cValue()
}