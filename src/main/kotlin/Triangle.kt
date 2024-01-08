class Triangle (
    val b: Double,
    val h: Double,
    val hypotenuse: Double
){
    init {
        println("Triangle created with base = $b, height = $h and hypotenuse = $hypotenuse")
    }
    fun area() = 0.5 * b * h

    fun perimeter() = b + h + hypotenuse
}