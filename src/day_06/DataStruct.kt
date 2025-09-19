package day_06

import java.util.Scanner

fun main(){

    println("If you want to say \"hello world\" just say it lol ")


    val someString = "Hello"

    println(someString.reversed())

    val toPrint = "I'm learning Kotlin!\n"
    println(toPrint.repeat(6))

    val textToPrint = """
{
    "firstName": "John",
    "lastName": "Smith",
    "age": 35,
    "phoneNumbers": [
        {
            "type": "mobile",
            "number": "123 567-7890"
        }
    ]
}
    """.trimIndent()

    println(textToPrint)

    val s = "string"
    print("$s.length")

    val scanner = Scanner(System.`in`)

    /*val value = scanner.nextInt()
    val res: Boolean
    res = if (value is 0){
        false
    } else {
        true
    }*/

    println()

    var a = 5
    var b = a
    print("$a $b")
    a += 1
    print("$a $b")

}