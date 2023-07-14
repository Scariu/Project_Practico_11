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
fun main() {
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


