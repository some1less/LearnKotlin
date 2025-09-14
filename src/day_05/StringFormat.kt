package day_05

fun main(){

    val string = String.format("%1\$s %3\$S", "Hello", "HOW", "are", "YOU")
    println(string)



    fun doubleFormat(value: Double, width: Int, precision: Int): String {
        // write your code here

        return String.format("%${width}.${precision}f", value)


    }

    println(    doubleFormat(672.457,7,1))

}