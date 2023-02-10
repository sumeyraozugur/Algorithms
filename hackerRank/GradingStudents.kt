
fun main() {
    println(gradingStudents(arrayOf(73,67,38,33)).contentToString())
}

fun gradingStudents(grades: Array<Int>): Array<Int> {

    for (index in grades.indices) {
        if (grades[index] >= 38) {
            val diff = 5 - (grades[index] % 5)
            if (diff < 3) grades[index] += diff
        }
    }
    return grades
}