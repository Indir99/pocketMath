import ImportantNumbers
import ImportantNumbers.Pi
import kotlin.random.Random

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
        }

    override fun getArea(): Double {
        return radius*radius*Pi
    }

    override fun getPerimeter(): Double {
        return 2*radius* Pi
    }

    override fun getData() {
        println("Circle radius: $radius")
        println("Circle area: ${this.getArea()} ")
        println("Circle perimeter ${this.getPerimeter()}")
    }
}