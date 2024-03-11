fun main() {
    val result  = 10.0 / 3.0
    val result2 = 10 + 10 / 2

    println(result)
    println(result2)

    //augmented assignment

    var total:Int = 0

    val barang1 = 100
    total = total + barang1

    //bisa disederhanakan
    val barang2 = 100
    total += barang2

    val barang3 = 100
    total += barang3

    println("\nTotal Harga Anda")
    println(total)
    //unary operator
    total++
    println(total)

    val suhu = 5
    println("\nSuhu Anda")
    println(suhu)

    //boolean kebalikan
    val sehat = true
    println(!sehat)

}