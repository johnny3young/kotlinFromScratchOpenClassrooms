package com.black3.app.kotlinfromscratchopenclassrooms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iterator()
        printlnFromClass()
        var user = User("holamundo@gmail.com","123456",35)
        printUserAge()
        whileLoops()
        forLoops()
        //TryCatch
        try {
            subtractNumber(10,20)
        }catch (e: Exception){
            println("Caught!!!")
        }finally {

        }

        val otherUser = OtherUser("holamundo@gmail.com",null)
        val password = otherUser.password ?: fail("No password and password is required")

        val s1 = "123"
        println(s1.toIntOrNull()) // 123
        println(s1.toInt())       // 123

        val s2 = "Nobody is perfect"
        println(s2.toIntOrNull()) // null
        //println(s2.toInt())       // NumberFormatException

        var x = 50
        var y = 40
        var result = if (x>y){
            x++
            x
        }else{
            y
        }
        println("The result is: $result")

        var apiResponse = 404

        when (apiResponse) {
            200 -> println("OK")
            404 -> println("NOT FOUND")
            401 -> println("UNAUTHORIZED")
            403 -> println("FORBIDDEN")
            else -> println("UNKNOWN")
        }

        fun isOk(apiResponse : Int) = apiResponse == 201
        fun isNotFound(apiResponse : Int) = apiResponse == 404

        when {
            isOk(apiResponse) -> println("OK")
            isNotFound(apiResponse) -> println("NOT FOUND")
        }

        val response: ApiResponse = ApiResponse.OK
        when(response) {
            ApiResponse.OK -> println("OK")
            ApiResponse.NOT_FOUND -> println("NOT_FOUND")
            ApiResponse.UNAUTHORIZED -> println("UNAUTHORIZED")
            ApiResponse.FORBIDDEN -> println("FORBIDDEN")
            ApiResponse.UNKNOWN -> println("UNKNOWN")
        }

        val numberToFind = 55

        when(numberToFind) {
            in 1..33 -> println("Number is between 1 and 33")
            in 34..66 -> println("Number is between 34 and 66")
            in 67..100 -> println("Number is between 67 and 100")
        }

        //Local Functions
        println(addNumbers(5, 9))
        println(getUsernameUpperCase("johnny"))
        println("Eres profesor? ${isUsernameOfTeacher("Luffy")}")

    }

    enum class Color {RED , BLUE, GREEN }

    fun colorToString (color: Color) = when (color){
        Color.RED -> "RED"
        Color.BLUE-> "BLUE"
        Color.GREEN-> "GREEN"
    }

    enum class ApiResponse(val code: Int) {

        OK (200),
        NOT_FOUND (404),
        UNAUTHORIZED (401),
        FORBIDDEN (403),
        UNKNOWN (0)
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