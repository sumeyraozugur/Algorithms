fun main(){
    println(pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
}

fun pickingNumbers(a: Array<Int>): Int {
    val frequency = IntArray(100)
    for (num in a) {
        frequency[num]++
    }

    var maxLength = 0
    for (i in 1 until 100) {
        maxLength = max(maxLength, frequency[i] + frequency[i - 1])
        println(maxLength)
    }
    return maxLength
}
