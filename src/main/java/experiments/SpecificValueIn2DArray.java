package experiments;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecificValueIn2DArray {
    static int[][] seatsPrices = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
        {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
        {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
        {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
        {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
        {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
        {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
        {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
        {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};

    public List<int[]> getItemIndexCollection(int itemValue) {
        return IntStream.range(0, seatsPrices.length)
            .boxed()
            .flatMap(i ->
                IntStream.range(0, seatsPrices[i].length)
                    .boxed()
                    .map(j -> seatsPrices[i][j] == itemValue ? new int[]{i, j} : new int[]{-1, -1})
            )
            .filter(item -> item[0] != -1 && item[1] != -1)
            .collect(Collectors.toList());
    }
}
