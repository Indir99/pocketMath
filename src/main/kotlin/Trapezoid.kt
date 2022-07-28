import kotlin.math.sqrt
import kotlin.random.Random

class NegativeOrZeroTrapezoidException : Exception("Side of trapezoid can't be negative or equal to zero")

class Trapezoid (
    var a: Double,
    var b: Double,
    var height: Double
        ) :Shape("Trapez") {

    companion object {
        fun getRandomTrapezoid() : Trapezoid {
            return Trapezoid(Random.nextDouble(1.0,10.0),Random.nextDouble(1.0,10.0),Random.nextDouble(1.0,10.0) )
        }
    }

    init{
        println("We made trapezoid with base a: $a, base b: $b, height: $height")
        try{
            checkSides()
        } catch (e: NegativeOrZeroTrapezoidException){
            a= Random.nextDouble(1.0,10.0)
            b= Random.nextDouble(1.0,10.0)
            height = Random.nextDouble(1.0,10.0)
            println("You entered side which is less or equal to zero, so we changed trapezoid to random size")
        }
    }

    override fun getArea(): Double {
        return ((a+b)/2)*height
    }

    override fun getPerimeter(): Double {
        return a+b+2*getSideC()
    }

    override fun getData() {
        println("Side a: $a")
        println("Side b: $b")
        println("Trapezoid side c: ${this.getSideC()}")
        println("Trapezoid area: ${this.getArea()}")
        println("Trapezoid perimeter: ${this.getPerimeter()}")
    }

    private fun checkSides() : Boolean {
        if(a<=0 || b<=0 || height<=0){
            throw NegativeOrZeroTrapezoidException()
        }
        return true
    }

    private fun getSideC() : Double {
        var x: Double
        var c: Double
        if(a>b){
            x=(a-b)/2
            c=x*x+height*height
            c= sqrt(c)
        }
        else if(a<b){
            x=(b-a)/2
            c=x*x+height*height
            c= sqrt(c)
        }
        else{
            c=height
        }
        return c
    }


}