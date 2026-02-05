// Top-level constant
const val MAX_BOOKS_BORROWED = 5

class Book2(val title: String, val author: String) {

    // Method to check if user can borrow more books
    fun canBorrow(borrowedBooks: Int): Boolean {
        return borrowedBooks < MAX_BOOKS_BORROWED
    }

    // Method to print the book URL
    fun printUrl() {
        println("${BASE_URL}${title}.html")
    }

    // Companion object to limit scope to Book
    companion object {
        const val BASE_URL = "https://library.example.com/books/"
    }
}

fun main() {
    val book = Book2("Hamlet", "William Shakespeare")

    println(book.canBorrow(3))   // true
    println(book.canBorrow(5))   // false

    book.printUrl()
}
