import com.sun.jdi.Value

//function reference di lamda
fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val hasil = contohLambda("Asman", "Haikal")
    println(hasil)

//    val sayHello: (String) -> String = {value: String ->
//        "Hello $value"
//    }
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Asman")
    )

    //function/method reference di lamda
    val toUpperCase : (String) -> String = :: toUpper
    println(toUpperCase("Asman Haikal"))
}