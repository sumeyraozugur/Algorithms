fun main(){
    println(catAndMouse(1,2,3))
}
/*
x-> catA
y-> catB
z-> Mouse
 */

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val catADistance = kotlin.math.abs(z - x)
    val catBDistance = kotlin.math.abs(z - y)

    return when {
        catADistance < catBDistance -> "Cat A"
        catBDistance < catADistance -> "Cat B"
        else -> "Mouse C"
    }
}

