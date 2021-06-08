package experiments;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

public class SpecificValueIn2DArrayTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldReturnIndices(int itemValue, List<int[]> expectedResult) {
        final var actualResult = new SpecificValueIn2DArray().getItemIndexCollection(itemValue);
        IntStream.range(0, expectedResult.size())
            .boxed()
            .forEach(index -> assertArrayEquals(expectedResult.get(index), actualResult.get(index)));

        final var random = new Random();
        final var pair = actualResult.get(random.nextInt(actualResult.size()));
        System.out.println(pair[0] + " " + pair[1]);
        System.out.println(SpecificValueIn2DArray.seatsPrices[pair[0]][pair[1]]);
//        System.out.println(new SpecificValueIn2DArray().getItemIndexCollection(itemValue).get(random.nextInt(actualResult.size())));

    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
            of(20, List.of(new int[]{3, 2},
                new int[]{3, 3},
                new int[]{3, 4},
                new int[]{3, 5},
                new int[]{3, 6},
                new int[]{3, 7},
                new int[]{4, 2},
                new int[]{4, 3},
                new int[]{4, 4},
                new int[]{4, 5},
                new int[]{4, 6},
                new int[]{4, 7},
                new int[]{5, 2},
                new int[]{5, 3},
                new int[]{5, 4},
                new int[]{5, 5},
                new int[]{5, 6},
                new int[]{5, 7}, new int[]{6, 0}, new int[]{6, 1}, new int[]{6, 8}, new int[]{6, 9}, new int[]{7, 0}, new int[]{7, 9})),
            of(40, List.of(new int[]{6, 4}, new int[]{6, 5}, new int[]{7, 3}, new int[]{7, 6}, new int[]{8, 1}, new int[]{8, 8}))
        );
    }
}
