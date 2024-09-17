fun main() {
    val number1 = readLine()!!.toDouble()
    val number2 = readLine()!!.toDouble()
    
    if (number1 > number2) {
        println("Больше: $number1")
        println("Меньше: $number2")
    } else {
        println("Больше: $number2")
        println("Меньше: $number1")
    }
}
