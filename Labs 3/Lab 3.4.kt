fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    
    if (number1 % number2 == 0) {
        println("Первое число кратно второму.")
    } else {
        println("Первое число не кратно второму. Остаток от деления: $number1 % $number2")
    }
}
