
fun main(){
    println(nonDivisibleSubset(3,arrayOf(1,7,2,4)))
}

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    val remainderCounts = IntArray(k) //[0,3,1]

    for (num in s) {
        remainderCounts[num % k]++
    }

    var count = minOf(remainderCounts[0], 1)

    for (i in 1..k / 2) {
        if (i != k - i) {
            count += maxOf(remainderCounts[i], remainderCounts[k - i])
        } else {
            count += minOf(remainderCounts[i], 1)
        }
    }

    return count
}