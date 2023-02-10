fun main() {
    println(breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)).contentToString())
}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highScore = scores[0]
    var lowestScore = scores[0]
    var timesHighestScoreBroken = 0
    var timesLowestScoreBroken = 0

    for (score in scores) {
        when {
            score < lowestScore -> {
                lowestScore = score
                timesLowestScoreBroken += 1
            }
            score > highScore -> {
                highScore = score
                timesHighestScoreBroken += 1
            }
        }
    }
    return arrayOf(timesHighestScoreBroken,timesLowestScoreBroken)
}
