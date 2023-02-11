package com.sum.algorithms

fun main(){
    bonAppetit(arrayOf(3, 10, 2, 9), 1, 12)
}
// k =  item Anna doesn't eat
//b = the amount of money that Anna contributed to the bill


fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    val sum = bill.filterIndexed { index, _ -> index != k }.sum()
    val fairShare = sum / 2
    val overcharge = b - fairShare

    if (overcharge == 0) {
        println("Bon Appetit")
    } else {
        println(overcharge)
    }
}


