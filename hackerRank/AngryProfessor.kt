fun main(){
    println( angryProfessor(3, arrayOf(-2,-1,0,1,2)))
}

fun angryProfessor(k: Int, a: Array<Int>): String {
    val continueLesson = a.count { students -> students <=0 }
    return if (continueLesson >=k) "NO" //Cancelled no
    else  "YES"
}