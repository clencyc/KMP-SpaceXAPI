import kotlinx.datetime.*

fun dayUntilNewyear(): Int {
    val today = Clock.System.todayAt(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(closestNewYear)

}

fun daysPhrase(): String = "There are only ${dayUntilNewyear()} days left until New Year! 🎆"

