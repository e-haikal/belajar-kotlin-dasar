fun main() {
    var nilai = "C"

    //single option expression
    when (nilai){
        "A" -> println("Amazing")
        "B" -> println("Good Job")
        "C" -> println("Not Bad")
        "D" -> println("OMG Bad")
        else -> println("Uuups")
    }

    //when multiple expression

    when (nilai) {
        "A", "B", "C" -> println("Hooray, Anda lulus!")
        else -> println("Maaf, tidak lulus")
    }

//    nilai = "E"
    //penggunaan in --lebih sederhana
    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when (nilai){
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        else -> println("MAAF TIDAK LULUS")
    }

    //penggunaan "is" untuk mengecek type data

    val name = "Asman"
    when (name){
        is String -> println("$name adalah String")
        !is String -> println("$name bukan String")
    }

    //when sebagai pengganti if else

    val nilaiTotal = 20
    when {
        nilaiTotal > 90 -> println("Amazing :>")
        nilaiTotal > 70 -> println("Good Job :)")
        nilaiTotal > 60 -> println("Not Bad ><")
        else -> println("Ngulang bro :(")
    }
}