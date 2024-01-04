fun main(){
//    printPow(4,5)
//    printSum(5)
//    val pow = printPow(3,5)
//    println("3 to the power of 5 is $pow")
    var list = listOf(3,2,5,1,5,6,7)
    var searchResult = searchNumber(6,list)
    println("The index of 6 in $list is $searchResult")
}
//introducing functions with parameters
fun printPow(base: Int, exponent: Int){
    var result = 1
    for (item in 1..exponent){
        result *= base
    }

    println("$base to the power of $exponent is: $result")
}
fun printSum(number: Int){
    var sum = 0
    for (i in 1..number){
        sum += i
    }
    println("The sum of 1 to $number is: $sum")
}
//functions with return values
fun printPowReturn(base: Int, exponent: Int): Int{
    var result = 1
    for (item in 1..exponent){
        result *= base
    }
    return result
}

fun searchNumber(searchNum: Int, myList: List<Int>): Int{
    for (i in myList){
        if (searchNum == myList[i]){
            return i
        }
    }
    return -1
}