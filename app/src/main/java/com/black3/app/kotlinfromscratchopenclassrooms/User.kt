package com.black3.app.kotlinfromscratchopenclassrooms

class User (var email:String, var password:String, var age:Int) {

    //Puedo usar private val o val en alguna de las propiedades para evitar el getter y/o setter
    //Tambien puedo dejarlo sin val o var y declararlo yo mismo así:
    // var password : String = password
    //get(){ return field}
    //set(value){field = value}

    //si quiero que me aparezca la información en la consola puedo usar esto:
    //var email: String = email
    //get() { println("User is getting his email."); return field }
    //set(value) { println("User is setting his email."); field = value }

}

fun printUserAge(){
    var user2 = User("otromundo@gmail.com", "abcdef",30)
    println(user2.age)
}