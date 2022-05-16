
fun main() {
    println("Enter side a: ")
    val a = try {readLine()?.toDouble() } catch (e: NumberFormatException) { 0.0 }
    println("Enter side b: ")
    val b = try {readLine()?.toDouble() } catch (e: NumberFormatException) { 0.0 }
    println("Enter side c: ")
    val c = try {readLine()?.toDouble() } catch (e: NumberFormatException) { 0.0 }
    val triangle1 = Triangle(a!!,b!!,c!!)
    triangle1.getData()
    val triangle2 = Triangle.getRandomTriangle()
    triangle2.getData()
}