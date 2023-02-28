package com.sum.algorithms

fun main(){
    println( camelcase("saveChangesInTheEditor"))
}

fun camelcase(s: String): Int {

    var count = 1 //first word is lower case

    s.forEach {
        if(it.isUpperCase()){
            count++
        }
    }
    return count
}
