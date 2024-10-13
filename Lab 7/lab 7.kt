//калькулятор, делали вместе с "Gigachat"
fun main() {
    println("Привет! Это простой калькулятор.")
    print("Выберите операцию: ")
    print("1. Сложение")
    print("2. Вычитание")
    print("3. Умножение")
    print("4. Деление\n")

    val input = readLine()!!
    when(input) {
        "1" -> calculateAddition()
        "2" -> calculateSubtraction()
        "3" -> calculateMultiplication()
        "4" -> calculateDivision()
        else -> println("Неверный выбор. Попробуйте снова.")
    }
}

fun calculateAddition() {
    var result = 0.0
    while (true) {
        print("Введите первое число: ")
        val firstNumber = readLine()!!.toDoubleOrNull() ?: continue
        print("Введите второе число: ")
        val secondNumber = readLine()!!.toDoubleOrNull() ?: continue
        if (firstNumber != null && secondNumber != null) {
            result += firstNumber + secondNumber
            println("Сумма $firstNumber и $secondNumber равна $result")
        }
        break
    }
}

fun calculateSubtraction() {
    var result = 0.0
    while (true) {
        print("Введите первое число: ")
        val firstNumber = readLine()!!.toDoubleOrNull() ?: continue
        print("Введите второе число: ")
        val secondNumber = readLine()!!.toDoubleOrNull() ?: continue
        if (firstNumber != null && secondNumber != null) {
            result -= firstNumber - secondNumber
            println("Разность $firstNumber и $secondNumber равна $result")
        }
        break
    }
}

fun calculateMultiplication() {
    var result = 1.0
    while (true) {
        print("Введите первое число: ")
        val firstNumber = readLine()!!.toDoubleOrNull() ?: continue
        print("Введите второе число: ")
        val secondNumber = readLine()!!.toDoubleOrNull() ?: continue
        if (firstNumber != null && secondNumber != null) {
            result *= firstNumber * secondNumber
            println("Произведение $firstNumber и $secondNumber равно $result")
        }
        break
    }
}

fun calculateDivision() {
    var result = 1.0
    while (true) {
        print("Введите делимое: ")
        val dividend = readLine()!!.toDoubleOrNull() ?: continue
        print("Введите делитель: ")
        val divisor = readLine()!!.toDoubleOrNull() ?: continue
        if (dividend != null && divisor != null) {
            result /= dividend / divisor
            println("Частное от деления $dividend на $divisor равно $result")
        }
        break
    }
}
