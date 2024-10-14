//10-2
fun main()
{
    val lvlcnt = readLine()!!.toInt()
    generatePyramid(lvlcnt)
}
fun generatePyramid(n: Int): Unit
{
    if (n == 0)
    {
        println("")
        return
    }
    val spaces = "".repeat((n - 1) / 2)
    val pyramidL = "#".repeat(n)
    println("$spaces$pyramidL")
    generatePyramid(n - 1)
}
//KSEIS223
