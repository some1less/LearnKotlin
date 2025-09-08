fun main() {

    fun capibara(x : Int) {

        if (x == 1) println("capibara")
        else println("this is not 1")
    }

    capibara(1)
    capibara(2)

    fun listManipulation(x : List<String>) : List<String> {

        return x.map { it + "add" }

    }

    /*
    *
    *  map() goes through all elements in collection
    *  it actually an element of collection
    *
    * */

    var strings = mutableListOf<String>("one", "two", "three", "four", "five", "six")
    println(listManipulation(strings))




}