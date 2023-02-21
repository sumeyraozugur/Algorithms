fun main(){
    println(viralAdvertising(3))
}

fun viralAdvertising(n: Int): Int {
    var shared = 5
    var cumulativeLikes = 0
    repeat(n) {
        val liked = shared / 2
        cumulativeLikes += liked
        shared = liked * 3
    }
    return cumulativeLikes
}