package com.black3.app.kotlinfromscratchopenclassrooms

class Loop {
}

fun whileLoops() {
    var mustStudy = true
    while (mustStudy) {
        println("While loops: I will learn more")
        mustStudy = false
    }

    var goToStudy = false
    do {
        println("DoWhile loops: I will go to study where my brother´s apartment")
    }while (goToStudy)

}

fun forLoops() {
    for (i in 5 downTo 1)
        println("$i")
    for (i in 1..10 step 2)
        println("$i")
}