package com.black3.app.kotlinfromscratchopenclassrooms

import java.lang.Exception

class TryCatch {
}

fun subtractNumber(a: Int, b: Int){
    if (a >= b) a - b
    else throw Exception ("a es menor que b")
}