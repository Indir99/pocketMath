import kotlin.math.sqrt
import kotlin.random.Random

class NegativeOrZeroRectangleSideException : Exception("Side of rectangle can't be negative or equal to zero")

class Rectangle (
    var a: Double,
    var b: Double
        ) : Shape ("Rectangle") {

    companion object {
        fun getRandomRectangle(): Rectangle {
            return Rectangle(Random.nextDouble(1.0,10.0),Random.nextDouble(1.0,10.0))
        }
    }
    init {
        println("Here we are, we made Rectangle with a: $a, b: $b")
        try{
            if(checkSides()){}
        }catch (e: NegativeOrZeroRectangleSideException){
            a= Random.nextDouble(1.0,10.0)
            b= Random.nextDouble(1.0,10.0)
            println("You entered side which is less or equal to zero, so we changed it to random size")
        }
    }


    override fun getArea(): Double {
        return a*b
    }

    override fun getPerimeter(): Double {
        return 2*a + 2*b
    }

    override fun getData() {
        println("Side a: $a")
        println("Side b: $b")
        println("Rectangle area: ${this.getArea()}")
        println("Rectangle perimeter: ${this.getPerimeter()}")
        println("Rectangle diagonal: ${this.getDiagonal()}")
    }
    fun getDiagonal() : Double {
        return sqrt(a*a + b*b)
    }
    private fun checkSides() : Boolean {
        if(a<=0 || b<=0){
            throw NegativeOrZeroRectangleSideException()
        }
        return true
    }
}
