fun main(){
    println(dayOfProgrammer(2017))
}
//fun dayOfProgrammer(year: Int): String {
//    var result = ""
//
//    result = when{
//        year<1918 -> {if (year%4==0) "12.09.$year"
//                      else "13.09.$year" }
//        year > 1918 -> {if((year%400==0) || (year%4==0 && year%100 != 0)) "12.09.$year"
//                        else "13.09.$year" }
//        else -> "26.09.1918"
//    }
//    return  result
//}

fun dayOfProgrammer(year:Int) = when{
    year == 1918 -> "26"
    year.isLeap() -> "12"
    else -> "13"
} + ".09."+ year


fun Int.isLeap() = when{
    this < 1918 -> isDivisibleBy(4)
    else -> isDivisibleBy(400) || isDivisibleBy(4) && !isDivisibleBy(100)
}

fun Int.isDivisibleBy(divisor:Int) = this % divisor == 0


