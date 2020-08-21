import java.util.Scanner

val scan = java.util.Scanner(System.`in`)
fun main() {
    val male = Male("Сергей", 25, 82.5, 182.6)
    male.hello(true)
    val female = Female("Полина", 22, 75.0, 175.5)
    female.hello(false)
}

abstract class Person (var name:String, var age:Int, var weight:Double, var height:Double){

    fun hello(arg:Boolean) {
        val old = when{
            age<5 -> "года"
            else  -> "лет"
        }
        if(arg){
            println("Здравствуйте меня зовут $name я родился $age $old назад сейчас мой вес $weight, рост $height")
        }else{
            println("Здравствуйте меня зовут $name я родилась $age $old назад сейчас мой вес $weight, рост $height")
        }
    }
}
class Male(name: String, age: Int, weight: Double, height: Double) : Person(name, age, weight, height){

}
class Female(name: String, age: Int, weight: Double, height: Double) : Person(name, age, weight, height){

}
