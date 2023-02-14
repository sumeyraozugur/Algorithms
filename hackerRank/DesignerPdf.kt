fun main(){
    println(designerPdfViewer(arrayOf(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7),"aba"))
}
/*
a,b,c,d,e,f...
 */

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val charHeights = IntArray(26) { i -> h[i] }
    val maxHeight = word.map { charHeights[it - 'a'] }.max() ?: return 0
    return maxHeight * word.length
}
