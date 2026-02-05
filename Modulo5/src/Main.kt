//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val book = Book("Romeo and Juliet", "William Shakespeare", 1597)
//
//    val bookTitleAuthor = book.getTitleAuthor()
//    val bookTitleAuthorYear = book.getTitleAuthorYear()
//
//    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")
//
//    println(
//        "Here is your book ${bookTitleAuthorYear.first} " +
//                "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}"
//    )

    // Set of book titles
    val allBooks = setOf(
        "Hamlet",
        "Macbeth",
        "Romeo and Juliet",
        "King Lear"
    )

    // Map that associates the author with the set of books
    val library = mapOf(
        "William Shakespeare" to allBooks
    )

    // Check if any of the books is "Hamlet"
    println(library.any { it.value.contains("Hamlet") })

    // Mutable map with one initial book
    val moreBooks = mutableMapOf(
        "The Hobbit" to "J.R.R. Tolkien"
    )

    // Use getOrPut to add books if they are not in the map
    moreBooks.getOrPut("Hamlet") { "William Shakespeare" }
    moreBooks.getOrPut("Don Quixote") { "Miguel de Cervantes" }

    println(moreBooks)

}