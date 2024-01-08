fun main(){
    println("Please enter a number")
    val input = readLine()?.toInt()

    if (input != null){
       if (input.isPrime()){
           println("The number $input is a prime number")
       } else{
           println("The number is not a prime number")
       }
    }

    val list = listOf(2,3,4,5)
    var product = list.product()
    println("The product of $list is $product")
}

fun Int.isPrime(): Boolean{
    for (i in 2 until this - 1){
        if (this % i == 0){
            return false
        }
    }
    return true
}

fun List<Int>.product(): Int{
    var listProduct = 1
    for (i in this-1){
        listProduct *= i
    }
    return listProduct
}