import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите первое число:")
    val number1 = scanner.nextInt()
    println("Введите второе число:")
    val number2 = scanner.nextInt()
    
    if (number1 == number2) {
        println("Числа равны.")
    } else {
        println("Числа не равны.")
    }
}
