fun main(){
    extraLongFactorials(5)
}
fun extraLongFactorials(n: Int) {
    var result = BigInteger.ONE

    for (i in 2..n) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }

    println(result)
}