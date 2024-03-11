fun main() {
    val names: Array<String> = arrayOf("Asman", "Haikal", "Bisa", "Farel", "Rahel", "Bimasakti")
    var totalPerulangan = 0
    for (name in names){
        println(name)

        totalPerulangan++
    }
    println("Jumlah perulangan : $totalPerulangan")

    println("=========================================================")
    val jurusans: Array<String> = arrayOf("Sistem Informasi", "Informatika", "Teknologi Informasi", "Teknik Komputer")

    val jumlahKampus = jurusans.size
    val indexKampus = jumlahKampus-1

    println(jumlahKampus)
    for (i in 0 .. indexKampus){
        println("Indeks ke-$i = Jurusan ${jurusans.get(i)}")
    }

}