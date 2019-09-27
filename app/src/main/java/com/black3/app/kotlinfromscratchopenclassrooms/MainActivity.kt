package com.black3.app.kotlinfromscratchopenclassrooms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Functions
        println(addNumbers(5, 9))
        println(getUsernameUpperCase("johnny"))
        println("Eres profesor? ${isUsernameOfTeacher("Luffy")}")

        //Class
        println("Hola Mundo")
        //holamundo()
        holaMundoDesdeClaseAparte()
        //sumar(3,5)
        //restar(6,2)
        println(minOf(8, 10))
    }

    //var hello  = MainActivity()

    fun addNumbers(a: Int, b: Int) = a + b
    fun getUsernameUpperCase(username: String) = username.toUpperCase()
    fun isUsernameOfTeacher(username: String) = username == "Phil" || username == "George"

    fun minOf(a: Int, b: Int): Int {
        return if (a < b) a else b
    }

    fun getUrlApi() = "www.google.com"

    fun getVideoApi(): String {
        return "www.google.com"
    }

    fun holamundo() {
        println("Hola mundo invocado")
    }

    fun sumar(a: Int, b: Int) {
        println(a + b)
    }
}