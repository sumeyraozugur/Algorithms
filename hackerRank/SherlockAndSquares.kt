
fun main(){
    println(squares(24,49))
}

fun squares(a: Int, b: Int): Int {
    val start = ceil(sqrt(a.toDouble())).toInt()
    val end = floor(sqrt(b.toDouble())).toInt()
    return end - start + 1
}