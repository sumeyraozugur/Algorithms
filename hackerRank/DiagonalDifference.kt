
fun main(){
    
    println(diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))))

    /*
  11 2 4
  4 5 6
  10 8 -12
     */
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    val arrSize = arr.size

    val diagonalOne =(0 until arrSize).sumOf{arr[it][it]}
    val diagonalTwo =(0 until arrSize).sumOf{arr[it][arrSize-it-1]}

    return Math.abs(diagonalOne -diagonalTwo)

}