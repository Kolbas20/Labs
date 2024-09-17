import kotlin.math.pow

fun main() {
    val sideA = readLine()!!.toDouble()
    val sideB = readLine()!!.toDouble()
    val sideC = readLine()!!.toDouble()
    
    if (sideA > sideB + sideC || sideB > sideA + sideC || sideC > sideA + sideB) {
        println("Треугольник не существует.")
    } else {
        println("Треугольник существует.")
    }
}
