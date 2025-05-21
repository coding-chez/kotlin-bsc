// 1. Hello World
fun main() {
    println("Hello, World!")
}

// 2. Variables
val immutableValue: Int = 10        // Read-only (like final)
var mutableValue: String = "Hello"  // Mutable

// 3. Data types
val myInt: Int = 42
val myDouble: Double = 3.14
val myChar: Char = 'A'
val myBoolean: Boolean = true
val myString: String = "Kotlin"

// 4. String Templates
val name = "Kotlin"
val greeting = "Hello, $name!"

// 5. If Expression
fun maxOf(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 6. When Expression
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

// 7. For Loop
for (i in 1..5) {
    println(i)
}

// 8. While Loop
var x = 5
while (x > 0) {
    println(x)
    x--
}

// 9. Functions
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 10. Single-expression function
fun multiply(a: Int, b: Int) = a * b

// 11. Nullable types
var maybeString: String? = "Hello"
maybeString = null

// 12. Safe call and Elvis operator
val length = maybeString?.length ?: 0

// 13. List and Map
val numbers = listOf(1, 2, 3)
val mutableNumbers = mutableListOf(4, 5, 6)
val numberMap = mapOf("one" to 1, "two" to 2)

// 14. Classes and Constructors
class Person(val name: String, var age: Int)

val person = Person("Alice", 25)

// 15. Data Class
data class User(val username: String, val email: String)

val user = User("john", "john@example.com")

// 16. Object Declaration (Singleton)
object DatabaseConfig {
    val url = "localhost"
}

// 17. Companion Object
class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
    }
}

// 18. Extension Function
fun String.shout(): String = this.uppercase() + "!"

// 19. Lambda Expression
val double = { x: Int -> x * 2 }
val numbersDoubled = numbers.map(double)

// 20. Exception Handling
fun safeDivide(a: Int, b: Int): Int =
    try {
        a / b
    } catch (e: ArithmeticException) {
        0
    }
