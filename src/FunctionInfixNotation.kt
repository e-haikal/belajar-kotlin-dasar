infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    } else {
        return  this.toLowerCase()
    }

}

fun main() {
    val result = "Asman Haikal" to "UP"
    println(result)
}