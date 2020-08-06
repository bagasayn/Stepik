
val scan = java.util.Scanner(System.`in`)
fun main() {

    val rez = ReturnSolve()
    if(rez.A.isLetter()) {
        when {
            rez.A.toLowerCase() == rez.A -> print(rez.A.toUpperCase())
            rez.A.toUpperCase() == rez.A -> print(rez.A.toLowerCase())

        }
    }else print("incorrect")

}


class ReturnSolve(){
    val A: Char = scan.next().first()

}

