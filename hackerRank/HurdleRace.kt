fun main(){
    println(hurdleRace(1, arrayOf(1,2,3,3,4)))

}

fun hurdleRace(k: Int, height: Array<Int>): Int {
    val maxHeight = height.max() ?: return 0 // check array is empty or not
    return if (maxHeight <= k) 0 else maxHeight - k
}