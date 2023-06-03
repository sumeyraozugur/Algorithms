fun main(){
    println(circularArrayRotation(arrayOf(3,4,5),2, arrayOf(1,2)).joinToString())
}

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val n = a.size
    val results = Array(queries.size) { 0 }
    for (i in queries.indices) {
        val rotatedIndex = (queries[i] - k % n + n) % n
        results[i] = a[rotatedIndex]
    }
    return results

}