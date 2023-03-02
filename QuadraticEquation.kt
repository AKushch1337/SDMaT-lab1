import java.io.File
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String> = arrayOf()) {
    if (args.isEmpty()) interactiveMode()
    else nonInteractiveMode(args)
}

fun interactiveMode() {
    var a: Double
    do {
        a = readDouble("a = ")
        if (a == 0.0) {
            println("Error: 'a' coefficient cannot be zero")
        }
    } while (a == 0.0)
    val b = readDouble("b = ")
    val c = readDouble("c = ")
    solveQuadraticEquation(a, b, c)
}

fun readDouble(message: String): Double {
    while (true) {
        print(message)
        val input = readlnOrNull()?.toDoubleOrNull()
        if (input != null) {
            return input
        }
        println("Error. Expected a valid real number")
    }
}

fun nonInteractiveMode(args: Array<String>) {
    val filename = args[0]
    val file = File(filename)

    if (!file.exists()) {
        println("File: $filename doesn't exist")
        return
    }

    val input = file.readText().trim().split(" ")
    if (input.size != 3) {
        println("Invalid input in file: Expected 3 numbers, got ${input.size} numbers")
        return
    }

    val a = input[0].toDoubleOrNull()
    val b = input[1].toDoubleOrNull()
    val c = input[2].toDoubleOrNull()

    if (a == 0.0) {
        println("Error: 'a' coefficient cannot be zero")
        exitProcess(1)
    } else if (a == null || b == null || c == null) {
        println("Error. Expected a valid real number")
        exitProcess(1)
    }
    solveQuadraticEquation(a, b, c)
}

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

