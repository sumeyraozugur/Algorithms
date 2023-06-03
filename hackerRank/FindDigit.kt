fun main(){
    println(findDigits(124))
}

fun findDigits(n: Int): Int {
    // Write your code here
    var count = 0


    n.toString().forEach {
        val a =it.toString().toInt()
        if(a != 0 && n % a ==0) {
            count++
        }
    }
    return  count
}