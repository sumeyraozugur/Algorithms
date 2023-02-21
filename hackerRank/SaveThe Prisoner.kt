fun main(){
    println(saveThePrisoner(4, 6, 2))
}
/*
int n: the number of prisoners
int m: the number of sweets
int s: starts at seat number
2 3 4 1 2 3
 */

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val lastPrisoner = (m - 1 + s) % n
    return if (lastPrisoner == 0) n else lastPrisoner
}