fun main() {
    val year = readLine()!!.toInt()
    
    when {
        year % 4 == 0 && year % 100 != 0 || year % 400 == 0 -> {
            println("Високосный год")
            println("Количество дней в году: 366")
        }
        else -> {
            println("Не високосный год")
            println("Количество дней в году: 365")
        }
    }
}
