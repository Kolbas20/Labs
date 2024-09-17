fun main() {
    println(getNonEvenSum(4, 7)) // Вывод: 11
    println(getNonEvenSum(6, 8)) // Вывод: 0
}

fun getNonEvenSum(a: Int, b: Int): Int {
    return if ((a % 2 != 0) xor (b % 2 != 0)) a + b else 0
}
