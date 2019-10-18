import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val current = LocalDateTime.now()
    println("Current Date and Time is: $current")

    val timeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss")
    val timeFormatted = current.format(timeFormatter)


    println("The formatted current date time is: $timeFormatted") 
}
