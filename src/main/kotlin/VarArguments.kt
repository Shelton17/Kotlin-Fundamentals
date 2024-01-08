fun main(){
    val array = intArrayOf(10,23,45,76,12,1,3,5)
    // we can inster rrays inside var =arg parameters using *array
    val max = getMax(1,2,3,4,5,17,18,23)
    println("The maximum is $max")

    searchFor("How to become a good developer")
    searchFor("Best Programmer", "Bing")
    //named parameter with this you don't have to have the arguments in the correct order
    searchFor(searchEngine = "Yahoo", search = "How to be a beast")

    val sum = alternatingSum(3,8,9,10,11,12)
    println("The alternating sum is $sum")
}
fun getMax (vararg numbers: Int): Int{
    var max = numbers[0]
    for(number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}

//default values in parameters arguments
fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searchin for $search on $searchEngine")
}

//vararg assignment
fun alternatingSum(vararg numbers: Int): Int{
    var sum = 0
    var toggle = true
    for(n in numbers){
        if (toggle){
            sum += n
        }else{
            sum -= n
        }
        toggle = !toggle
    }
    return sum
}
