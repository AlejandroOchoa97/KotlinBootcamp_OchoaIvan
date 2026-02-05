class Spice( val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            else -> 0
        }

    init {
        println("Spice: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

fun makeSalt(): Spice {
    return Spice("salt", "not spicy")
}