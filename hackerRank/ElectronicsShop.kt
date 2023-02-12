fun main(){
    println(getMoneySpent(arrayOf(40,50,60), arrayOf(5,8,12),60))
}


fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var maxSpend = -1

    for (keyboard in keyboards) {
        for (drive in drives) {
            val total = keyboard + drive
            if (total <= b) {
                maxSpend = maxOf(maxSpend, total)
            }
        }
    }
    return maxSpend
}