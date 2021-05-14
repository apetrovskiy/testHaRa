package interview.greedy.GreedyFlorist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@SuppressWarnings("PMD")
class GreedyFloristTest {
    @ParameterizedTest
    @MethodSource("getInputData")
    void shouldCalculateCost(int k, int[] c, int expectedResult) {
        var cut = new GreedyFlorist();
        System.out.println("expected = " + expectedResult + "actual = " + cut.getMinimumCost(k, c));
        assertEquals(expectedResult, cut.getMinimumCost(k, c));
    }

    static Stream<Arguments> getInputData() {
        return Stream.of(
            of(3, new int[]{2, 5, 6}, 13),
            of(2, new int[]{2, 5, 6}, 15),
            of(3, new int[]{1, 3, 5, 7, 9}, 29),
            of(3, new int[]{390225, 426456, 688267, 800389, 990107, 439248, 240638, 15991,
         874479, 568754, 729927, 980985, 132244, 488186, 5037, 721765, 251885,
         28458, 23710, 281490, 30935, 897665, 768945, 337228, 533277, 959855,
         927447, 941485, 24242, 684459, 312855, 716170, 512600, 608266, 779912,
         950103, 211756, 665028, 642996, 262173, 789020, 932421, 390745,
         433434, 350262, 463568, 668809, 305781, 815771, 550800}, 163578911),
    of(34, new int[]{433515, 22221, 540709, 538312, 496949, 902471, 439983, 159332,
          417327, 399306, 817804, 354682, 108825, 970689, 868286, 235070,
          18732, 848955, 994152, 741000, 722232, 564879, 503093, 734475,
          174795, 129065, 483929, 683440, 37645, 670198, 911023, 40334,
          329513, 669160, 180034, 285512, 401190, 629798, 857703, 765572,
          174164, 849299, 159367, 62467, 84449, 523962, 735995, 245666,
          832139, 879827, 749840, 315756, 253168, 659252, 187178}, 30352414)
        );
    }
}
