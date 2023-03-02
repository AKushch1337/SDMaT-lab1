import kotlin.math.sqrt

fun solveQuadraticEquation(a: Double, b: Double, c: Double) {
    val discriminant = b * b - 4.0 * a * c
    val x1 = (-b + sqrt(discriminant)) / (2.0 * a)
    val x2 = (-b - sqrt(discriminant)) / (2.0 * a)
    println("Equation is: ($a) x^2 + ($b) x + ($c) = 0")
    if (discriminant < 0) {
        println("No real roots")
    } else if (discriminant > 0.0) {
        println("x1: $x1")
        println("x2: $x2")
    } else {
        println("x1: $x1")
    }
    return
}

