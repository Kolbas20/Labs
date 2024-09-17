fun main() {
    val distance1InKilometers = readLine()!!.toDouble()
    val distance2InFeet = readLine()!!.toDouble()
    
    val distance2InMeters = distance2InFeet * 0.305
    val distance2InKilometers = distance2InMeters / 1000
    
    if (distance1InKilometers < distance2InKilometers) {
        println("Расстояние в километрах меньше")
    } else {
        println("Расстояние в футах меньше")
    }
}
