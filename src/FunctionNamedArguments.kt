fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")

}

fun main() {
    fullName("Asman", "Haikal", "Bisa")
    fullName(
        lastName = "Bisa",
        firstName = "Asman",
        middleName = "Haikal"
    )
}