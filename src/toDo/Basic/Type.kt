package toDo.Basic

fun main() {
    val i = 6
    val b = i;
    val numberofCats = 2
    val numberofDogs = 3
    val n = 10;
    val s = "abc";
    var count = 50
    var arr = arrayOf("people", "animals", "tree")
    var pri3 = 1
    var myList = mutableListOf("guitar", "piano", "violon")
    var testnull: String? = "k"
    var test2: String? = "899";
    val len = test2!!.length
    testnull = null

    println(b)
    println("They have $numberofCats Cats and $numberofDogs")
    println("$s has a length of ${s.length}}")
    println("I have ${numberofDogs + numberofCats} animals")

    if (numberofCats > numberofDogs) {
        println("more cats than dogs")
    } else if (numberofCats == numberofDogs) {
        println("cats is equal to dogs ")
    } else {
        println("cats little than dogs")
    }
    if (count in 1..100) {
        println("$count")
    }
    when (count) {
        0 -> println("No result")
        in 25..123 -> println("It'result is $count")
        else -> println("Not in ranges")
    }
    for (element in arr) {
        println(element + "")
    }
    for ((index, element) in arr.withIndex()) {
        println("Item the ${index + 1} is $element")
    }
    for (ith2 in 5 downTo 1) {
        println(ith2);
        if (ith2 in 3..6 step 2) {   // [3,5]
            println(ith2)
        }
    }
    while (pri3 < 3 || pri3 == 3) {
        println("there are three line code")
        pri3++
    }
    repeat(2) {
        println("Add to there ${b} line code")
    }
    myList.remove(myList.get(2));

    println(myList.indices);
    println(testnull)
    println(len)

}
