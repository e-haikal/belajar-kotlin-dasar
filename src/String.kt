fun main() {
    val firstName: String = "Asman"
    val lastName: String = "Haikal"

    //gunakan petik tiga untuk string 1 baris lebih
    val address: String ="""
        Jl. Mancasan Indah 3,
        No, 23a, Condong Catur, 55512
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

    //menggabungkan string
//    val fullName: String = firstName + " " + lastName

    //menggabungkan string menggukanan string template
    var fullName: String = "$firstName $lastName"
    println(fullName)

    //string dengan dua ekspresi, menggunakan kurung kurawal
    val desc: String = "$fullName length ${fullName.length}"
    println(desc)


}