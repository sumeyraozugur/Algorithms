
fun main(){
    println(getTotalX(arrayOf(2,6), arrayOf(24,36)))
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {

    val startNumber = a.max()!!
    val endNumber = b.min()!!

    return (startNumber..endNumber).count{ number->
        a.all{number%it == 0} && b.all{ it%number ==0}
    }
}