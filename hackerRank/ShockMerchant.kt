
fun main(){
    println(sockMerchant(9,arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)))
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val hashSet = HashSet<Int>()
    var pairedSock = 0

    ar.forEach { element ->
        if (hashSet.contains(element)) {
            pairedSock ++
            hashSet.remove(element)
        } else {
            hashSet.add(element)
        }
    }
    return pairedSock
}



