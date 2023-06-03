
fun main(){
    println(appendAndDelete("hackerhappy","hackerrank",9))
}

fun appendAndDelete(s: String, t: String, k: Int): String {
    val sLength = s.length //10
    val tLength = t.length //10
    val commonLength = getCommonLength(s, t)

    if (sLength + tLength - 2 * commonLength > k) {
        return "No"
    }

    if ((sLength + tLength - 2 * commonLength) % 2 == k % 2 || sLength + tLength < k) {
        return "Yes"
    }
    return "No"
}

fun getCommonLength(s: String, t: String): Int {
    var commonLength = 0
    val minLength = minOf(s.length, t.length)

    for (i in 0 until minLength) {
        if (s[i] == t[i]) {
            commonLength++
        } else {
            break
        }
    }

    return commonLength
}