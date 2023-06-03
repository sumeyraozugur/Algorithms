fun main(){
    println(migratoryBirds(arrayOf(1, 4, 4, 4, 5, 3)))
}

fun migratoryBirds(arr: Array<Int>): Int {
    val frequencyMap = HashMap<Int, Int>()

    for (element in arr) {
        if (frequencyMap.containsKey(element)) {
            frequencyMap[element] = frequencyMap[element]!! + 1

        } else {
            frequencyMap[element] = 1
        }
    }

    val maxFrequency = frequencyMap.values.max()

    val mostCommonElements = frequencyMap.filterValues { it == maxFrequency }.keys

    return mostCommonElements.first()
}
