import java.util.Scanner

val scan = java.util.Scanner(System.`in`)
fun main() {
    val dog1 = Dog()
    val dog2 = Dog("max")
    val dog3 = Dog("Maxi","Dog")


}
class Dog(private val name:String= "-"){

    constructor(name:String, nextName:String) : this(name){
        print("Имя собаки $name и кличка $nextName")
    }
    init{
        println("Имя собаки $name")
    }
}
//Имя собаки -
//Имя собаки max
//Имя собаки Maxi
//Имя собаки Maxi и кличка Dog
