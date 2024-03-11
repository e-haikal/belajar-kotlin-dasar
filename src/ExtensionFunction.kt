fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Asman"

    println(name.hello())

    name.printHello()

    "Haikal".printHello()
}