import java.io.File

fun main(args: Array<String>) {
    val filename = args[0]
    val file = File(filename)

    var numWords = 0
    var numLines = 0
    var numChars = 0

    file.forEachLine {
        numLines++
        numWords += it.split(" ").size
        numChars += it.length
    }

    println("Number of words: $numWords")
    println("Number of lines: $numLines")
    println("Number of characters: $numChars")
}
