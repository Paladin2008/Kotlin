package lessons1

fun main() {

    val second = 5409

    fun timeSecondsToStr(seconds: Int): String {
        val hour = seconds / 3600
        val minute = (seconds % 3600) / 60
        val second = seconds % 60
        return String.format("%02d:%02d:%02d", hour, minute, second)
    }
    println(timeSecondsToStr(second))
}

