package com.black3.app.kotlinfromscratchopenclassrooms

class OtherUser (val email: String?, val password: String?)

fun fail(message: String): Nothing = throw IllegalStateException(message)