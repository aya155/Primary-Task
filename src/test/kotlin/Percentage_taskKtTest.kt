import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Percentage_taskKtTest {

    @Test
    fun percentageOfCharacterARandomCharactersCase() {
        val listOfCharacters = mutableListOf("3", "1", "*")
        assertEquals(-1, percentageOfCharacterA(listOfCharacters))
    }

    @Test
        fun percentageOfCharacterADefaultCharactersCase() {
        val listOfCharacters = mutableListOf("a", "a", "b", "a")
        assertEquals(75.0, percentageOfCharacterA(listOfCharacters))
    }

    @Test
    fun percentageOfCharacterAStringInListCase() {
        val listOfCharacters = mutableListOf("a","a","a","ab","b")
        assertEquals(-1, percentageOfCharacterA(listOfCharacters))
    }
}