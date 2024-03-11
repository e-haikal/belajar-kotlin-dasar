fun sayHello (firstName: String, lastName: String? ) {
    if (lastName == null){
        println("$firstName")
    } else {
        println("$firstName $lastName")
    }
}

fun main() {
    sayHello("Asman", "haikal")
    sayHello("SMK", null)
    sayHello("Rahel", "Putra")
}