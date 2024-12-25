import kotlin.random.Random

fun main(){
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    //if else
    if (firstResult == secondResult)
        println("You win :)")
    else
        println("You lose :(")
//when
    //This example uses a when expression without a subject to check a chain of Boolean expressions:
    val trafficLightState1 = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction1 = when {
        trafficLightState1 == "Green" -> "Go"
        trafficLightState1 == "Yellow" -> "Slow down"
        trafficLightState1 == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction1)
    //However, you can have the same code but with trafficLightState as the subject:
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    val button = "A"

        println(
            when(button){
                "A"-> "Yes"
                "B"->"No"
                "X"->"Menu"
                "Y"->"There is no such button"
                else->"There is no such button"
            }
        )
    }
