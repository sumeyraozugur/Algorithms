@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    println(cutTheSticks(arrayOf(1,2,3,4,3,3,2,1)).contentToString())
}

@RequiresApi(Build.VERSION_CODES.N)
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    val result = mutableListOf<Int>()

    val mutableArr = arr.toMutableList() // Convert array to mutable list

    while (mutableArr.isNotEmpty()) {
        result.add(mutableArr.size)

        mutableArr.sort()
        println(mutableArr.sort())

        val front = mutableArr[0]

        mutableArr.replaceAll { it - front }

        val remove = mutableArr.lastIndexOf(0) + 1

        mutableArr.subList(0, remove).clear()
    }

    return result.toTypedArray() // Convert mutable list back to array
}