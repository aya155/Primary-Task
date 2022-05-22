fun main() {
    val listOfCharacters = mutableListOf("a", "a", "b", "a")
    println(percentageOfCharacterA(listOfCharacters))
}

fun percentageOfCharacterA(charactersList: MutableList<String>): Any {
    val aCounts = charactersList.filter { it == "a" }.count()
    val bCounts = charactersList.filter { it == "b" }.count()
    return if (aCounts + bCounts != charactersList.size) -1
    else "%.1f".format((aCounts.toDouble()/charactersList.size.toDouble()) * 100).toDouble()
}