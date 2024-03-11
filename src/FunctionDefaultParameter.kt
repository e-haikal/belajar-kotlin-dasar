fun hello(firstName: String, lastName: String? = "Bisa"){
    if (lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Asman")
    hello("Asman", "Haikal")
    hello("Farel")
    hello("Rafel", "Rahel")
}