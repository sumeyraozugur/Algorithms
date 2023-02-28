fun main(){
    println( chocolateFeast(15,3,2))
}


fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    var chocolates = n / c
    var wrappers = chocolates

    while (wrappers >= m) {

        val extraChocolates = wrappers / m
        chocolates += extraChocolates
        wrappers = extraChocolates + (wrappers % m)
    }
    return chocolates
}
