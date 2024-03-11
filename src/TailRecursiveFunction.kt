fun main() {
    tailrec fun display (value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        when (value){
            1 -> return total
            else ->return factorialRecursive(value-1, total * value)
        }
    }

    println(factorialRecursive(10))


}