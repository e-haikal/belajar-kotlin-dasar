fun sum(a: Int, b:Int): Int {
    var total = a + b
    return total

}

fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    } else {
        val pembagian = a / b
        return pembagian
    }

}

fun main() {
    println(sum(10, 10))
    println(sum(100, 100))

    val hasilTambah = sum(200, 200)
    println(hasilTambah)

    //menampilkan hasil bagi
    println(bagi(100, 2))
    println(bagi(100, 0))
}