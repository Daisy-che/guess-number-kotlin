import java.util.Scanner //for getting input from user
import kotlin.random.Random //for getting random numbers

fun main(args: Array<String>) {
    val randomNumber = Random.nextInt(1,101)
    var attempt = 0
    var input = Scanner(System.`in`)

    while (true){
        println("Enter any number of your choice: ")
        val guessNumber = input.nextInt()
        if (guessNumber == 0){
            println("Invalid input. Enter only numbers greater than 0")
            continue
        }
        attempt ++
        if (guessNumber > randomNumber){
            println("High")
        } else if (guessNumber < randomNumber){
            println ("Low")
        } else {
            println ("You're doing a great work, Well done.")
            break
        }
    }

}
