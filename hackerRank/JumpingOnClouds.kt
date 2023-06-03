fun main(){
    println(jumpingOnClouds(arrayOf(0,0,1,0),2))
}

fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var energy = 100
    var index = 0
    val n = c.size

    do {
        index = (index + k) % n
        energy--
        if (c[index] == 1) {
            energy -= 2
        }
    } while (index != 0)

    return energy
}