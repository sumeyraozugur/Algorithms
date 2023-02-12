fun main(){
    println(countingValleys(8,"UDDDUDUU"))
}



fun countingValleys(steps: Int, path: String): Int {
    var elevation = 0
    var valley = 0

    for (step in path) {
        when (step) {
            'U' -> { elevation++
                if (elevation == 0) valley++}
            'D' -> elevation--
        }
    }
    return valley
}



