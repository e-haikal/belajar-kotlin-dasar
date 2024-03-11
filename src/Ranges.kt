fun main() {
//    val range = 0..100
    val range = 100 downTo 0 step 10

    println(range)
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}