package day_03

const val CONST = 100
fun main() {

    val listNumber = mutableListOf<Int>()
    listNumber.add(CONST * CONST)
    listNumber.add(CONST * CONST * CONST)
    listNumber.add(CONST * CONST * CONST * CONST)
    println(listNumber)

    val someText: String = "meow"
    println(someText)

    val someNum: Int
    someNum = 1
    ////// hello

    val `hello world` = "String"
    println(`hello world`)

    println(getLastDigit(-44314))

    val a = 500000000000
    val b = 200000000000
    println(    divide(a,b))

    println(isVowel('A'))
    println(isVowel('a'))
    println(isVowel('b'))
    println(isVowel('T'))
}

fun ageCheck(age: Int) {

    if(age < 18) println("Minor")
    if(age in 18..<65) println("Adult")
    if(age >= 65) println("Senior")

}

fun getLastDigit(num: Int): Int{
    var res = num % 10
    if (res < 0)
        res *= -1
    return res

}

fun divide(num1: Long, num2: Long): Double {
    return num1.toDouble() / num2.toDouble()
}

fun isVowel(char: Char): Boolean {

    val x = char.lowercaseChar()

    if(x == 'y') return false

    if (x == 'a' || x == 'e' ||
            x == 'i' || x == 'o' || x == 'u') return true

    return false
}

fun isGreater(n1: Int, n2: Int, n3: Int, n4: Int): Boolean {
    return n1 + n2 > n3 + n4
}

class FixError {

}