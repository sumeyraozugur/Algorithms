
fun main(){
    println(climbingLeaderboard(arrayOf(100,100,50,40,20,10), arrayOf(5,25,50,120)).contentToString())
}

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    val distinctRanked = ranked.distinct().sortedDescending() //[100, 50, 40, 20, 10]
    val result = mutableListOf<Int>()

    var j = distinctRanked.size - 1
    for (i in player.sortedDescending().indices) {// 0 1 2 3
        while (j >= 0 && player[i] >= distinctRanked[j]) {
            j--
        }
        result.add(j + 2)
    }
    return result.toTypedArray()
}