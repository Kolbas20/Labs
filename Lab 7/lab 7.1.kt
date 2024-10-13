import java.util.Scanner

fun main(args: Array<String>) {
    // Ввод слова
    val scanner = Scanner(System.`in`)
    print("Введите слово: ")
    val inputWord = scanner.next().toString()

    // Проверка длины слова
    if (inputWord.length <= 1) {
        println("Слово должно содержать минимум два символа.")
        return
    }

    // Проверка палиндрома
    val reversedWord = inputWord.reversed()
    if (inputWord == reversedWord) {
        println("$inputWord - это палиндром.")
    } else {
        println("$inputWord - не является палиндромом.")
    }
}
