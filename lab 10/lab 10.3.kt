//10-3
import java.util.*

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`)
    print("Введите сообщение для шифрования: ")
    val message = input.nextLine()
    print("Введите ключ шифрования: ")
    val key = input.nextInt().toChar().code - 'А'.code

    // Создаем результат шифрования
    var encryptedMessage = ""

    for (char in message)
    {
        if (char.isLetter())
        {
            char.lowercaseChar()
            val shiftedCharCode = (char.code + key) % 26 + 'а'.code
            encryptedMessage += Character.toString(shiftedCharCode)
        } else
        {
            encryptedMessage += char
        }
    }
    println("Шифрованное сообщение: $encryptedMessage")
}
//KSEIS223
