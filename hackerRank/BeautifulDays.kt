import kotlin.math.abs

fun main(){
    println(beautifulDays(20,23,6))
}

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var count = 0
    for (x in i..j) {
        if (abs(x - x.toString().reversed().toInt()) % k == 0) {
            count++
        }
    }
    return count
}