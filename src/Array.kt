fun main() {
    val names: Array<String> = arrayOf("Asman", "Haikal", "Digital")

    //ubah isi string
    names[0] = "Asmana"

    //bisa juga diubah dengan

    names.set(1, "Haikala")
    println(names[0])
    println(names[1])
    println(names[2])

    //array untuk simpan nilai
    val nilais: Array<Int> = arrayOf(100, 80, 20)
    println("")
    println(nilais[0])
    println(nilais[1])
    println(nilais[2])

    //membuat tipe data array nulls
    val members: Array<String?> = arrayOfNulls(3)
    members.set(0, "Asman")
    members.set(1, "Haikal")
    members.set(2, "Digital")

    println("")
    println(members[2])
}