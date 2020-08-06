
val scan = java.util.Scanner(System.`in`)
fun main() {

    val rez = ReturnSolve()

        if(rez.A.toByte() in 67 .. 89) print(true) else print(false) // 67-89

}


class ReturnSolve(){
    val A: Char = scan.next().first()

}

