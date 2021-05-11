package interview.greedy

import interview.greedy.GreedyFlorist.getMinimumCost
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

class GreedyFloristKtTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    fun shouldCalculateCostKt(k: java.lang.Integer, c: Array<Int>, expectedResult: java.lang.Integer) {
        assertEquals(expectedResult, getMinimumCost(k.toInt(), c))
    }

    companion object {
        @JvmStatic
        fun getInputData(): java.util.stream.Stream<Arguments> {
            return java.util.stream.Stream.of(
                of(3, intArrayOf(2, 5, 6), 13),
                of(2, intArrayOf(2, 5, 6), 15),
                of(3, intArrayOf(1, 3, 5, 7, 9), 29)
            )
        }
    }
}
