
fun main(){
    println(pangram("We promptly judged antique ivory buckles for the next prize"))
}

fun pangram(s: String): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val lowercaseS = s.toLowerCase()
    val missingChars = StringBuilder()


    alphabet.forEach {
        if (!lowercaseS.contains(it)) {
            missingChars.append(it)
        }
    }
    return if (missingChars.isEmpty()) "pangram" else "not pangram"
}
