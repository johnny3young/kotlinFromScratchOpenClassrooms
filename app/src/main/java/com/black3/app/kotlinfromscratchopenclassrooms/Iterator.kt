package com.black3.app.kotlinfromscratchopenclassrooms

class Iterator {

}

fun iterator() {
    //Iterators
    val oneToTwenty = 1..20
    for (i in oneToTwenty)
        println(i)
    println(oneToTwenty.first)

    val oneToForty = 1..40
    oneToForty.forEach {
        println(it)
    }

    for (letra in 'A'..'D')
        println(letra)

    val daysOfWeek =
        listOf<String>("Lunes", "Martes", "Mércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    daysOfWeek.forEach {
        println(it)
    }
    daysOfWeek.forEachIndexed { index, s ->
        println("$index :$s")
    }

    daysOfWeek.withIndex().forEach {
        println(it.index)
    }

    val numbers = arrayOf(2, 3, 5, 10)
    var suma = 0.00
    for (i in numbers) {
        suma += i
        println(suma)

        var average = suma / numbers.size.toFloat()
        println(average)

    }
}
