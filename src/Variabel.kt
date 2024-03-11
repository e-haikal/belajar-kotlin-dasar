const val APP_NAME: String = "Belajar Kotlin"
const val VERSION: String = "0.0.1"

fun main() {
    val firstName = "Asman"
    val lastName = "Haikal"

    println(firstName)
    println(lastName)

    //test nullable
    var name:String? = null
    name = "\nAsman"
    println(name)
    println(name?.length)

    //belajar variabel constant / global variabel
    print("$APP_NAME : $VERSION")
}