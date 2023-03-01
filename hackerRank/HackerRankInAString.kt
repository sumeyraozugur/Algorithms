fun main(){
    println(hackerrankInString("hackerworld"))
}
fun hackerrankInString(s: String): String {

    val targetString = "hackerrank"
    var index = 0
    s.forEach { item->
        if (item == targetString[index]) {
            index++
        }
        if (index == targetString.length) {
            return "YES"
        }
    }
    return "NO"
}

