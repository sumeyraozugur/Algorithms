
fun main(){
    println(kangaroo(2081, 8403, 9107, 8400))
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    var answer = ""

    for (i in 1 until 10000){
        if(x1 + v1*i == x2 +v2*i){
            answer= "YES"
            break
        }else  answer=  "NO"
    }
    return answer
}