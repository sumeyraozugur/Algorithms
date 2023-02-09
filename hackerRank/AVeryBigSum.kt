
fun main(){
    println(aVeryBigSum(arrayOf(1,2,3,4,5,6)))
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = "0".toLong()
    ar.map {
        sum +=it
    }
    return sum
}