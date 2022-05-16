
fun main() {
    println("Enter side a: ")
    val a = try {readLine()?.toDouble() } catch (e: NumberFormatException) { 0.0 }
    println("Enter side b: ")
    val b = try {readLine()?.toDouble() } catch (e: NumberFormatException) { 0.0 }
    val rectangle = Rectangle(a!!,b!!)
    rectangle.getData()
    val rectangle2 = Rectangle.getRandomRectangle()
    rectangle2.getData()
}