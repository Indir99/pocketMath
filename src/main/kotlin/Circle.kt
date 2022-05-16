
import ImportantNumbers.Pi
import kotlin.random.Random

class NegativeOrZeroRadiusException : Exception("Radius can't be negative or equal to zero")

class Circle (
    var radius : Double
        ) : Shape ("Circle") {

    companion object {
        fun getRandomRadius(): Circle {
            return Circle(Random.nextDouble(1.0,10.0))
        }
    }

    init {
        println("Here we are, we made circle with radius: $radius")
        // Implementation of try and catch
        try{
            if(checkRadius()){}
        }catch (e: NegativeOrZeroRadiusException){
            radius=Random.nextDouble(1.0,10.0)
            println("You enetered radius which is less or equal to zero, so we changed it to random size")
        }
    }

    override fun getArea(): Double {
        return radius*radius*Pi
    }

    override fun getPerimeter(): Double {
        return 2*radius* Pi
    }

    fun getDiameter() : Double {
        return 2*radius
    }

    override fun getData() {
        println("Circle radius: $radius")
        println("Circle diameter: ${this.getDiameter()}")
        println("Circle area: ${this.getArea()} ")
        println("Circle perimeter ${this.getPerimeter()}")
    }

    private fun checkRadius() :Boolean {
        if( radius <= 0){
            throw NegativeOrZeroRadiusException()
        }
        return true
    }
}