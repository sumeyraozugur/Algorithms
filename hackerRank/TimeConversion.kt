
fun main() {
    println(timeConversion("07:05:45PM"))
}

fun timeConversion(s: String): String {
    var hour =""
    val amPm = s[8].toString()
    when(amPm){
        "A" -> {
            hour = if(s.substring(0,2) == "12") "00"
            else s.substring(0,2)
        }
        "P" -> {
            hour = if(s.substring(0,2) == "12") s.substring(0,2)
            else (s.substring(0,2).toInt()+12).toString()
        }
    }
    return hour +s.substring(2,8)

}