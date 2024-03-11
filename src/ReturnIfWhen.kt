fun main() {
    fun sayHello (name: String = ""): String {
        return when (name){
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
/*//        if (name == "") {
        return if (name == "") {
//            return "Hello Bro!"
            "Hello Bro!"

        } else {
            "Hello $name"
        }*/
    }

    println(sayHello(""))
    println(sayHello("Asman"))


}