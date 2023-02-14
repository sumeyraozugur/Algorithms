fun main(){
    println(utopianTree(4))

}
fun utopianTree(n: Int): Int {
    var height = 1
    for (i in 1..n) {
        if (i % 2 == 1) {
            height *= 2
        } else {
            height += 1
        }
    }
    return height
}