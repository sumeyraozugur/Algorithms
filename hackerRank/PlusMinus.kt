
fun main(){
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

fun plusMinus(arr: Array<Int>){
    val positiveNumbers = arr.count{it>0}
    val negativeNumbers = arr.count{it<0}
    val zeroNumbers = arr.count {it ==0}

    val arrSize = arr.size.toDouble()

    println(String.format("%.6f", positiveNumbers/arrSize))
    println(String.format("%.6f", negativeNumbers/arrSize))
    println(String.format("%.6f", zeroNumbers/arrSize))

}