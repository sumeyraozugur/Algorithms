fun main(){
    println(formingMagicSquare(arrayOf(arrayOf(5,3,4), arrayOf(1,5,8), arrayOf(6,4,2))))
}

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val possibleSquares = arrayOf(
        arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2)),
        arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4)),
        arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
        arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
        arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)),
        arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
        arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
        arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8))
    )

    /*
    8 1 6
    3 5 7
    4 9 2
     */

    /*
    5 3 4
    1 5 8
    6 4 2
     */

    var minCost = Integer.MAX_VALUE
    for (square in possibleSquares) {
        var cost = 0
        for (i in 0..2) {
            for (j in 0..2) {
                cost += kotlin.math.abs(square[i][j] - s[i][j])
            }
        }
       minCost = kotlin.math.min(minCost, cost)
    }
    return minCost
}




