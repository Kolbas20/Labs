//10-4
fun main()//
{
    val number = readLine()!!.toInt()
    println(generateSequence(number))
}
fun generateSequence(n: Int): List<String>
{
    val seq = mutableListOf<String>()
    for (i in 1..n)
    {
        if (i % 3 == 0 && i % 5 == 0)
        {
            seq.add("ВизллБизлл")
        } else if (i % 3 == 0)
        {
            seq.add("Физлл")
        } else if (i % 5 == 0)
        {
            seq.add("Бизлл")
        } else
        {
            seq.add(i.toString())
        }
    }
    return seq
}
//KSEIS223
