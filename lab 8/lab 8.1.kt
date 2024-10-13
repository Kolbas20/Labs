import kotlin.math.max
import kotlin.math.min

fun maxMinDiff(numbers: List<Int>): Int {
    val min = numbers.minOrNull() ?: return 0 // Проверка на пустой список
    val max = numbers.maxOrNull() ?: return 0 // Проверка на пустой список
    return max - min
}
