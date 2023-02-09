
fun main(){
    miniMaxSum(arrayOf(1,2,3,4,5))
}

fun miniMaxSum(arr: Array<Int>) {

    val minValue = arr.min()!!
    val maxValue =arr.max()!!
    val sum = arr.map{it.toLong()}.sum()

    println("${sum-maxValue} ${sum-minValue} ")

}