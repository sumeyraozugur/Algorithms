
fun main(){
    println(birthdayCakeCandles(arrayOf(3,2,1,3))) //2

}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val sortedCandles = candles.sorted()
    val max = sortedCandles.last()
    return candles.count { candle -> (candle == max) }
}