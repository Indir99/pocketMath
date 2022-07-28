
fun main() {
    var entryFlag = true
    while (entryFlag){
        val userChoice = gui()
        when(userChoice){
            1 -> basicMathOperations()
            2 -> postfixCalculator()
            3 -> calculateShapes()
            4 -> quadraticEquation()
            5 -> complexNumbers()
            6 -> {
                println("Thank you for using our app, see ya next time")
                entryFlag = false
            }
            else -> println("Wrong input, please enter a valid number")
        }
    }
}

fun gui(): Int {
    for(i in 1..50){
        print("*")
    }
    println()
    println("   Welcome to pocketMath app")
    println("1. Basic math operations") //Implemented, need some update
    println("2. Postfix calculator") //Not implemented
    println("3. Calculate Shapes") // Not implemented
    println("4. Quadratic Equation") //Not implemented
    println("5. Complex numbers") //Not implemented
    println("6. Exit")
    println("Your choice: ")
    val choice = try{ readLine()?.toInt() } catch (e: NumberFormatException) { -1 }
    for(i in 1..50){
        print("*")
    }
    println()
    if(choice!= null) return choice
    else return -1
}

fun basicMathOperations() {
    var basicMathOperationsEntryFlag = true
    var result = 0.0
    while (basicMathOperationsEntryFlag){
        println("   *** Welcome to Basic math operation calculator *** ")
        println(" Possible operations: +, -, /, *")
        println("Please enter operation or x for exit: ")
        val mathOperation = readLine()?.toString()
        if(mathOperation=="x"){
            basicMathOperationsEntryFlag = false
        }
        else {
            println("Enter first number: ")
            val firstNumber = try {
                readLine()?.toDouble()
            } catch (e: NumberFormatException) {
                0.0
            }
            println("Enter second number: ")
            val secondNumber = try {
                readLine()?.toDouble()
            } catch (e: NumberFormatException) {
                0.0
            }
            if (firstNumber!= null && secondNumber!=null && mathOperation!=null ){
                result = calculateBasicMath(mathOperation,firstNumber,secondNumber)
                println("Result is: $result")
            }
        }
    }

}

fun postfixCalculator() {
    println("Welcome to postfix calculator")

}

fun calculateShapes() {
    var calculateShapesEntryFlag = true
    while(calculateShapesEntryFlag) {
        println("   *** Welcome to Shape calculator *** ")
        println("Chose one of the following options: ")
        println("1. Rectangle")
        println("2. Triangle")
        println("3. Circle")
        println("4. Trapezoid")
        println("5. Exit")
        println("Your choice: ")
        val shapeInput= readLine()?.toString()
        when(shapeInput){
            "1" -> makeRectangle()
            "2" -> makeTriangle()
            "3" -> makeCircle()
            "4" -> makeTrapezoid()
            "5" -> calculateShapesEntryFlag=false
        }
        for(i in 1..50){
            print("*")
        }
        println()
    }

}

fun quadraticEquation() {
    println("Welcome to quadratic equation calculator")
}

fun complexNumbers() {
    println("Welcome to complex numbers calculator")

}

fun calculateBasicMath(mathOperation: String, firstNumber: Double, secondNumber: Double) : Double {
    when (mathOperation){
        "+" -> return firstNumber + secondNumber
        "-" -> return firstNumber - secondNumber
        "*" -> return firstNumber * secondNumber
        "/" -> return firstNumber/secondNumber
        else -> {
            println("Wrong operation symbol, try correct one")
            return 0.0
        }
    }
}

fun makeRectangle() {
    println("Enter side a: ")
    val sideA= try { readLine()?.toDouble() } catch (e: NumberFormatException ){ 0.0 }
    println("Enter side b: ")
    val sideB= try{readLine()?.toDouble()} catch (e: java.lang.NumberFormatException){0.0}
    if(sideA!=null && sideB!=null ) {
        val rectangle = Rectangle(sideA, sideB)
        rectangle.getData()
    }
    else{
        println("Wrong input for one of the sides, so you get a random rectangle")
        val rectangle = Rectangle.getRandomRectangle()
        rectangle.getData()
    }
}

fun makeTriangle() {
    println("Enter side a: ")
    val sideA= try { readLine()?.toDouble() } catch (e: NumberFormatException ){ 0.0 }
    println("Enter side b: ")
    val sideB= try{readLine()?.toDouble()} catch (e: java.lang.NumberFormatException){0.0}
    println("Enter side c: ")
    val sideC= try{readLine()?.toDouble()} catch (e: java.lang.NumberFormatException){0.0}
    if(sideA!=null && sideB!=null && sideC!=null ) {
        val triangle = Triangle(sideA, sideB,sideC)
        triangle.getData()
    }
    else{
        println("Wrong input for one of the sides, so you get a random triangle")
        val triangle = Triangle.getRandomTriangle()
        triangle.getData()
    }
}

fun makeCircle() {
    println("Enter radius: ")
    val radius= try { readLine()?.toDouble() } catch (e: NumberFormatException ){ 0.0 }
    if(radius!=null){
        val circle = Circle(radius)
        circle.getData()
    }
    else{
        println("Wrong input for radius so we decide to make random circle ")
        val circle = Circle.getRandomRadius()
        circle.getData()
    }
}

fun makeTrapezoid() {
    println("Enter side a: ")
    val sideA= try { readLine()?.toDouble() } catch (e: NumberFormatException ){ 0.0 }
    println("Enter side b: ")
    val sideB= try{readLine()?.toDouble()} catch (e: java.lang.NumberFormatException){0.0}
    println("Enter height: ")
    val height= try{readLine()?.toDouble()} catch (e: java.lang.NumberFormatException){0.0}
    if(sideA!=null && sideB!=null && height!=null ) {
        val trapezoid = Trapezoid(sideA, sideB,height)
        trapezoid.getData()
    }
    else{
        println("Wrong input for one of the sides, so you get a random trapezoid")
        val trapezoid = Trapezoid.getRandomTrapezoid()
        trapezoid.getData()
    }
}