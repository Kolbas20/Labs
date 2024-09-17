fun main() {
    val number = readLine()!!.toInt()
    
    val digits = number.toString().map { it - '0' }
    
    val firstTwoDigitsSum = digits[0] + digits[1]
    val lastTwoDigitsSum = digits[2] + digits[3]
    
    val allDigitsSum = digits.sum()
    
    val productOfDigits = digits.fold(1) { acc, digit -> acc * digit }
    
    if (firstTwoDigitsSum == lastTwoDigitsSum) {
        println("Сумма первых двух цифр равна сумме последних двух цифр")
    } else {
        println("Сумма первых двух цифр не равна сумме последних двух цифр")
    }
    
    if (allDigitsSum % 3 == 0) {
        println("Сумма цифр кратна трем")
    } else {
        println("Сумма цифр не кратна трем")
    }
    
    if (productOfDigits % 4 == 0) {
        println("Произведение цифр кратно четырем")
    } else {
        println("Произведение цифр не кратно четырем")
    }
    
    val multiplier = readLine()!!.toInt()
    
    if (productOfDigits % multiplier == 0) {
        println("Произведение цифр кратно $multiplier")
    } else {
        println("Произведение цифр не кратно $multiplier")
    }
}
