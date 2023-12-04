import kotlin.math.pow

fun main() {
    fun part1(input: List<String>): Int {
        var totalPoints = 0
        for (line in input) {
            var cardPoints = 0
            val card = Pair(line.split(":","|")[1], line.split("|")[1])
            val winningNumbers = card.first.split(" ").filter { it.isNotBlank() }
            val myNumbers = card.second.split(" ").filter { it.isNotBlank() }

            for (number in winningNumbers) {
                if (myNumbers.contains(number)) {
                    cardPoints++
                }
            }

            if (cardPoints > 1) {
                totalPoints += (2.toDouble().pow(cardPoints - 1)).toInt()
            } else {
                totalPoints += cardPoints
            }
        }

        return totalPoints
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("puzzles/Day04_test")
    check(part1(testInput) == 13)

    val input = readInput("puzzles/Day04")
    part1(input).println()
}
