package interview.greedy.GreedyFlorist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GreedyFloristTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCalculateCost(int k, int[] c, int expectedResult) {
        var cut = new GreedyFlorist();
        assertEquals(expectedResult, cut.getMinimumCost(k, c));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
                of(3, new int[] {2, 5, 6}, 13),
                of(2, new int[] {2, 5, 6}, 15),
                of(3, new int[] {1, 3, 5, 7, 9}, 29));
    }
}
