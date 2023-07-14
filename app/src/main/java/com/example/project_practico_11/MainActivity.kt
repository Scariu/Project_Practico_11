package com.example.project_practico_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//Ejercicio A
/*fun main() {
    var num1 = 10
    val num2 = 33
    val num3 = 66
    var resultado = num1 + num2 + num3
    println(resultado)

    num1 = 55
    resultado = num1 + num2 + num3
    println(resultado)

    val promedio = resultado/3

    println("El promedio es $promedio")
}
*/

//Ejercicio C
fun main(){

    val amanda = Person("Amanda", 33, "play tennis", null)
    val atigah = Person("Atigah", 28, "climb", amanda)

    amanda.showProfile()
    atigah.showProfile()
}
class Person(val name:String, val age:Int, val hobby:String, val referrer: Person?){
    fun showProfile(){
        println("Amanda: $name")
        println("Age: $age")
        println("Likes to: $hobby")

        if(referrer==null){
            println("Doesn't have a referrer.")
        }else{
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}")
        }
    }
}
