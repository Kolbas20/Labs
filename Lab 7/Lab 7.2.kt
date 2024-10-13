import kotlin.system.exitProcess

fun main() {
    val wins = readLine()?.toInt() ?: run {
        println("Пожалуйста, введите количество побед.")
        exitProcess(-1)
    }
    val draws = readLine()?.toInt() ?: run {
        println("Пожалуйста, введите количество ничьих.")
        exitProcess(-1)
    }
    val losses = readLine()?.toInt() ?: run {
        println("Пожалуйста, введите количество поражений.")
        exitProcess(-1)
    }

    fun calculateScore(wins: Int, draws: Int, losses: Int): Int {
        return wins * 3 + draws * 1
    }

    val totalScore = calculateScore(wins, draws, losses)
    println("Общее количество очков команды: $totalScore")
}
