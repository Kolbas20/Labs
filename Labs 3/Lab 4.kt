fun main() {
    val number = readLine()!!.toInt()
    
    if (number % 2 == 0) {
        println("Четное число")
    } else {
        println("Нечетное число")
    }
    
    val lastDigit = number % 10
    if (lastDigit == 7) {
        println("Завершается цифрой 7")
    } else {
        println("Не завершается цифрой 7")
    }
}
