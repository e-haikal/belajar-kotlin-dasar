import kotlin.Boolean

fun main() {
    val nilaiUts: Int = 70
    val nilaiUas: Int = 70
    val nilaiKuis: Int = 70

    val lulusUts: Boolean = nilaiUts >= 70
    val lulusUas: Boolean = nilaiUas >= 70
    val lulusKuis: Boolean = nilaiKuis >= 70

    val statusLulus: Boolean = lulusUts && lulusUas && lulusKuis

    println(statusLulus)
}