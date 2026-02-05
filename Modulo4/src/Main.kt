import SimpleSpice.SimpleSpice

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //SimpleSpice
    //val spice = SimpleSpice()
    //println("Name: ${spice.name}")
    //println("Heat: ${spice.heat}")

    //Spice
//    val spices = listOf(
//        Spice("curry", "mild"),
//        Spice("pepper", "medium"),
//        Spice("chili", "spicy"),
//        Spice("salt", "not spicy")
//    )
//
//    val mildSpices = spices.filter { it.heat <= 5 }
//
//    println("Mild or less spicy spices:")
//    mildSpices.forEach {
//        println(it.name)
//    }
//
//    val salt = makeSalt()

    //Book
    val book = Book("Clean Code", "Robert C. Martin")
    book.readPage()

    val ebook = EBook("Kotlin in Action", "Dmitry Jemerov")
    ebook.readPage()



}