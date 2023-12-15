
fun main() {
    fun part1(input: List<String>): Int {
//        // Java-ish solution
//        var total = 0
//
//        for(line in input) {
//            total += line.filter { char -> char.isDigit() }.let { "${it.first()}${it.last()}" }.toInt()
//        }
//
//        return total

        return input.sumOf { line ->
            line.filter { char -> char.isDigit() }.let { "${it.first()}${it.last()}" }.toInt()
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("puzzles/Day01_test")
    check(part1(testInput) == 142)

    val input = readInput("puzzles/Day01")
    part1(input).println()
}
