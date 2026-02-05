import kotlin.random.Random

class Book3(
    val title: String,
    val author: String,
    var pages: Int
)

// Extension function to calculate weight
fun Book3.weight(): Double {
    return pages * 1.5
}

// Extension function to tear pages
fun Book3.tornPages(torn: Int) {
    pages = (pages - torn).coerceAtLeast(0)
}

// Puppy class
class Puppy {
    fun playWithBook(book: Book3) {
        val torn = Random.nextInt(1, 10)
        println("Puppy tore $torn pages from ${book.title}")
        book.tornPages(torn)
    }
}

fun main() {
    val book = Book3("Hamlet", "William Shakespeare", 100)
    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Pages left: ${book.pages}, weight: ${book.weight()} grams")
    }

    println("The book has no more pages left 😢")
}