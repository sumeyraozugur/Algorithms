
fun main(){
    stairCase(6)
}
/*
     #
    ##
   ###
  ####
 #####
######

*/

fun stairCase(n: Int) {
    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i))
    }
}


