abstract class Shape (
    protected val name: String
        ) {

//    init{
//        println("Here it is, i'm abstract class")
//    }
    abstract fun getArea() :Double
    abstract fun getPerimeter() :Double
    abstract fun getData()
}