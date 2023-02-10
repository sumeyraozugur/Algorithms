/*
s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree
*/

fun main(){
    println(countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6)))
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {

    var appleCount = 0
    var orangeCount = 0

    for (apple in apples) {
        if (s <= apple + a && apple+a <= t) appleCount++
    }
    for (orange in oranges) {
        if (s <= orange + b && orange+b <= t) orangeCount++
    }
    println(appleCount)
    println(orangeCount)
}
