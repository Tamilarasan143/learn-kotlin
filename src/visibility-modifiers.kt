// Buy default function and the variables always in public   inside or outside the class
//So the keyword public is omitted

//private modifier
class Lamb {
    private var isOn = false;
    fun turnOn(): Boolean {
        isOn = true
        return isOn
    }

    fun turnOff(): Boolean {
        isOn = false
        return isOn
    }
}


fun main() {
    val lamb = Lamb();
    val turnOn = lamb.turnOn()
    println(turnOn)
    val turnOff = lamb.turnOff()
    println(turnOff)
}