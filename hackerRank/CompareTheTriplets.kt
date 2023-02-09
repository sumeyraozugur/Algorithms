
fun main(){
    println(compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10)).contentToString())
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var pointOfAlice = 0
    var pointOfBob = 0
    
    for (index in a.indices) {
        when {
            a[index] > b[index] -> pointOfAlice ++
            b[index] > a[index] -> pointOfBob ++
        }
    }

    return arrayOf(pointOfAlice, pointOfBob)
}