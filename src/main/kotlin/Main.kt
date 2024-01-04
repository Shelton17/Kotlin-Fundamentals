import java.util.*

fun main() {
//    allAboutVariables()
//    arithmeticOperators()
//    kotlinStrings()
//    logicalOperators()
//    conditions()
//    userInputs()
//    arraysInKotlin()
//    forLoops()
//    understandingLists()
    whenKeyword()
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

//Nullable values and user input in Kotlin
fun userInputs(){
    val userInput = readLine()
    println("You entered $userInput")
    println(userInput?.uppercase())// the question mark ensures that the variable is not null
    //working with user input as integers
    if (userInput != null)
        println(userInput.toInt() - 5)

    fun userInputExercise(){
        print("Please enter your age: ")
        val ageInput = readLine()
        if (ageInput != null){
            if (ageInput.toInt()<18){
                println("You are a baby")
            }else{
                println("You're an adult")
            }
        }
    }
    userInputExercise()
}
//arrays
fun arraysInKotlin(){
    val myArray = arrayOf("hello","guys", "whats up?")
    println(myArray[1])

//    While Looping
    var x = 0
    while (x<3){
        println("Looping")
        x ++ //increment to ensure the while loop can be broken
    }

    var myArrayLength = myArray.size
    var i = 0
    while (i <myArrayLength){
        println(myArray[i])
        i++
    }
    fun whileLoopExercise(){
        println("Please enter a number:")
        var number = readLine()?.toInt()

        if (number != null){
            if (number >= 0){
                println("Let's count from 10 down to 0:")
                while(number >= 0){
                    println(number)
                    number--
                }
            }
        }

        println("Enter number 1:")
        var number1 = readLine()?.toInt()
        println("Enter number 2:")
        var number2 = readLine()?.toInt()
        var result: Int = 1
        var n = 0

        while (number1 != null && number2 != null && n < number2){
            result *= number1
            n++
        }
        println("$number1 to the power of $number2 is $result")

    }
    fun dailyPushups(){
        var initalPushup = 50
        var i = 1
        while (i<365){
            initalPushup += 10
            if (initalPushup == 500){
                println("You get to 500 pushups on day $i")
            }
            i++
        }
        println("The number of pushups i'll be doing on 31st December: $initalPushup")
    }
    dailyPushups()
    //whileLoopExercise()
}

fun forLoops(){
//    val myArray = arrayOf(1,2,3)
//    for(i in myArray){
//        println(i)
//    }
    for (i in 1..10)
        println(i)
    for (i in 20 downTo 0 step 5)
        println(i)

    val myArray = arrayOf(4,5,8,10,20,6,7)
    var max = myArray[0]

    for (item in myArray){
        if (item > max){
            max = item
        }
    }
    fun forLoopExercise(){
        var sum = 0
        for (i in myArray){
            sum += i
        }
        println("The sum of the array is $sum")

        fun averageOfNumbers(){
            println("Enter 5 numbers:")
            var avg = 0.0
            for (i in 1..5){
                var input = readLine()?.toInt()

                if(input != null){
                    avg += input / 5.0
                }
            }
            println("The average value is $avg")

        }
        averageOfNumbers()
    }
    forLoopExercise()
}

fun understandingLists(){
    val array = arrayOf(1,2,3) //values cannot be changed during run time
   // val list = listOf(1,2,3) //values cannot be changed during run time

    //mutable lists can change nad you can add or remove at run time but with arrays you cannot
    val mutableList = mutableListOf(1,2,3)

    mutableList.add(4)
    //print(mutableList)

//    val list = mutableListOf<Int>()
//    for (i in 1..10){
//        val x = readLine()?.toInt()
//        if (x != null){
//            list.add(x)
//        }
//    }
//    println(list)
    fun listExercise(){
        var numList = mutableListOf<Int>()
        println("Please enter 5 number")
        for (i in 1..5){
            val item = readLine()?.toInt()
            if (item != null){
                numList.add(item)
            }
        }

        println("The 5 numbers in reverse order are:")
        for (i in numList.size-1 downTo 0){
            println(numList[i])
        }
        println("Enter a number n > 1:")
    val listSize = readLine()?.toInt()
    var fibbList = mutableListOf<Int>(0,1)
    if (listSize != null){
        for (i in 2..listSize-1){
            fibbList.add(fibbList[i-2] + fibbList[i-1])
        }
    }
    println(fibbList)

    }
    listExercise()
}
fun whenKeyword(){
    val age = readLine()?.toInt()
    //when is more like case and is dependent on a single variable
    when(age){
        in 0..5 -> println("You're a young kid")
        in 6..17 -> println("You're a teenager")
        18 -> println("Finally, you're 18")
        19,20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're a senior citizen")
    }
}