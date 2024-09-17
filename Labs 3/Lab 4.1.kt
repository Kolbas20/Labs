fun main() {
    val number = readLine()!!.toInt()
    
    val firstDigit = number / 10
    val secondDigit = number % 10
    
    if (firstDigit > secondDigit) {
        println("Первая цифра больше второй")
    } else if (secondDigit > firstDigit) {
        println("Вторая цифра больше первой")
    } else {
        println("Цифры одинаковые")
    }
}
