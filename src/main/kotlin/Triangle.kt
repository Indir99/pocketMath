import kotlin.math.sqrt
import kotlin.random.Random

class NegativeOrZeroTriangleSideException : Exception("Side of triangle can't be negative or equal to zero")
class TooLargeSideOfTriangleException : Exception("One side of triangle can't be larger than sum of other sides")

class Triangle (
    var a: Double,
    var b: Double,
    var c: Double,
        ) : Shape("Triangle") {

    init {
        println("Here we go, we made triangle class with sides: a: $a, b: $b, c: $c")
        try {
            checkTriangleSides()
        } catch (e: Exception) {
            a = Random.nextDouble(3.5,6.0)
            b = Random.nextDouble(3.5,6.0)
            c = Random.nextDouble(3.5,6.0)
        }

    }

    companion object {
        fun getRandomTriangle(): Triangle {
            return Triangle(Random.nextDouble(3.5,6.0), Random.nextDouble(3.5,6.0), Random.nextDouble(3.5,6.0) )
        }
    }

    override fun getArea(): Double {
        val s=getPerimeter()/2
        return sqrt(s*(s-a)*(s-b)*(s-c))
    }

    override fun getPerimeter(): Double {
        return a+b+c
    }

    override fun getData() {
        println("Side a: $a")
        println("Side b: $b")
        println("Side c: $c")
        println("Triangle area: ${this.getArea()}")
        println("Triangle perimeter: ${this.getPerimeter()}")

    }

    private fun checkTriangleSides(): Boolean {
        if(a<=0 || b<=0 || c<=0){
            throw NegativeOrZeroTriangleSideException()
        }
        if(a>=b+c || b>=a+c || c>=a+b){
            throw TooLargeSideOfTriangleException()
        }
        return true
    }
}