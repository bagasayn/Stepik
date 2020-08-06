
val scan = java.util.Scanner(System.`in`)
fun main() {

    val rez = ReturnSolve()
    println("${rez.A.replace(rez.B,"_")} ${countSubstring(rez.A,rez.B)}")


}

fun countSubstring(s: String, sub: String): Int = s.split(sub).size - 1

class ReturnSolve(){
    val A: String = scan.next()
    val B: String = scan.next()


}

