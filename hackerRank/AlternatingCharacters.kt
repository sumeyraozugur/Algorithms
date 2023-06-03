fun main(){
    println(  alternatingCharacters("ABABABABB"))
}

fun alternatingCharacters(s: String): Int {

    var letterOfControl = '?'
    var deleteLetterSize = 0

    s.forEach { letter ->

        when (letter) {
            letterOfControl -> {
                deleteLetterSize += 1
            }
            else -> {
                letterOfControl = letter
            }
        }
    }
    return deleteLetterSize
}