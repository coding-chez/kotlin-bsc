// In Kotlin, variables are declared using either 'val' (immutable) or 'var' (mutable).

fun main() {
    // Immutable variable (cannot be reassigned)
    val pi: Double = 3.14159
    println("Value of pi: $pi")

    // Mutable variable (can be reassigned)
    var age: Int = 25
    println("Initial age: $age")
    age = 26 // reassigning is allowed for var
    println("Updated age: $age")

    // Type inference: Kotlin can infer the type if it's obvious from the initializer
    val name = "Alice"
    var score = 95
    println("Name: $name, Score: $score")

    // Declaring multiple variables
    val x = 10; val y = 20
    println("x = $x, y = $y")

    // Nullable variables: use '?' to allow null values
    var address: String? = null
    println("Address: $address")
    address = "123 Main St"
    println("Updated address: $address")

    // Constants: Use 'const val' for compile-time constants (top-level or inside objects)
    println("Maximum allowed: $MAX_LIMIT")
}

// Example of a compile-time constant
const val MAX_LIMIT = 100

/*
Notes:
- Use 'val' whenever possible for safety.
- Use 'var' only when you need to reassign a value.
- Type inference makes code concise, but explicit types are clearer for documentation.
- For nullable variables, always check for null before using them.
*/
