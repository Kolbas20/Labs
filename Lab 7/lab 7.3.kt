import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите числа через пробел:")
    val numbers = scanner.nextLine().split(' ').map { it.toInt() }

    val minValue = numbers.min()
    println("Минимальное число: $minValue")
}
