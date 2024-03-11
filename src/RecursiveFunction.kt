fun main() {
    fun factorialLoop (value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    println(factorialLoop(5))

    fun factorialRecursive(value: Int): Int {
        when (value){
            1 -> return 1
            else ->return value * factorialRecursive(value-1)
        }
    }

    println(factorialRecursive(5))
}