import java.util.*

fun main() {
    allAboutVariables()
    arithmeticOperators()
    kotlinStrings()
    logicalOperators()
    conditions()
}

//    Conditions
fun conditions(){
    val x = 5
    val y = 7

    if (x<y){
        println("X is less than Y")
    }else if (x>y){
        println("X is greater than Y")
    }else{
        println("X is equal to Y")
    }

    println("This here will always be executed") // because it is not inside the if statement

    //assigning if statements when assigning variables in kotlin
    val z = if(x + y == 14) 3 else 4
    println("the value of Z is $z")

    fun conditionsExcercise(){
        val string = "racecar"

        println("The string is $string")
        if (string == string.reversed()){
            println("The string $string is a palindrome")
        }
    }
    conditionsExcercise()
}

//    Logical operators
fun logicalOperators(){
    val a = 5
    val b = 5

    val c = 6
    val d = 10
    println(a == b && c == d)
    println(a == b || c == d)
}

//Strings in Kotlin
fun kotlinStrings(){
    val string = "This is a sample text"
    println("Our string is: ${string.uppercase(Locale.getDefault())}")

    val myName = "Shelly"
    println("This is my name, in uppercase and reversed: ${myName.toUpperCase().reversed()}")

}

//Arithmetic Operators
fun arithmeticOperators(){
    //    Arithmetic operations: we can use (+,-,/,*)
    val x = 15
    val y = 7
    val result = x + y
    val subtractResult = x - y
    println("the result of our vatiables is $result")
    println("the result of our vatiables is $subtractResult")
    println("The result of x + y is: ${x+y}")

//    x+=10 is the same as x = x + 10

//    Decimal numbers
    println("The result of x / y is: ${x/y}")
//    To include the decimal numbers in the operation we declare the variable as a float
    val myX: Float = 20F
    val myY = 8F
    val myZ = 5
    println("The result of myX / myY is: ${myX/myY}")
//    Double variables take more memory compared to a float number. This is why we use float numbers when we do not need the numbers to be as accurate.

//    Calculating sphere volume
    val myRadius= 5.5
    val pi = 3.14159F
    var sphereVolume = 0.75 * pi * Math.pow(myRadius,3.0)
    println("The volume of the sphere with the radius 5.5 is $sphereVolume")

}
fun allAboutVariables(){
    //      outputing various strings
    println("Hello World!")
    println("I'm Awesome")
//      variables in kotlin
    var myVariable: Int = 5
    println(myVariable)
    println("The value of our vaiable is: $myVariable")
    myVariable = 1
    println("The value is now: $myVariable")

//      boolean variables
    var booVariable: Boolean = true
    println("The value of our vaiable is: $booVariable")
    booVariable = false
    println("The value is now: $booVariable")

//      assignment: saving my age and favorite number
    var ageVariable: Int = 23
    println("I am $ageVariable years old")
    var favNumber: Int = 17
    println("My favorite number is $favNumber")
    println("I am $ageVariable years old and my favoritee number is $favNumber")

}