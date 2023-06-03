fun main(){
    println(permutationEquation(arrayOf(5,2,1,3,4)).joinToString())
}

fun permutationEquation(p: Array<Int>): Array<Int> {
    val result = Array(p.size){0}

    for (x in 1..p.size) {
        val index1 = p.indexOf(x) + 1
        val index2 = p.indexOf(index1) + 1
        result[x - 1] = index2
    }
    return result
}