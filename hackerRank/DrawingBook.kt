fun main(){
    println(pageCount(6,2))
}


fun pageCount(n: Int, p: Int): Int {
    return Math.min(p / 2, (n -p) / 2)
}



