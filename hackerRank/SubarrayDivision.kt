
fun main(){
    birthday(arrayOf(1, 2, 1, 3, 2),3,2)
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var counter = 0
    for(start in 0..s.size-m){
        if(s.copyOfRange(start, start+m).sum() == d){
            counter +=1
        }
    }
    return counter
}