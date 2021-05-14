package interview.greedy.GreedyFlorist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

@SuppressWarnings("PMD")
public class GreedyFlorist {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        var result = 0;
        ArrayList<ArrayList<Integer>> buyers = new ArrayList<>();
        IntStream.range(0, k).forEach(i -> buyers.add(new ArrayList<>()));
        var sorted=IntStream.of(c).boxed().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
        for (var i = 0; i < sorted.length; i += k) {
            int finalI = i;
            IntStream.range(0, k).forEach(j -> {
                if (finalI + j < sorted.length) {
                    buyers.get(j).add(sorted[finalI + j]);
                }
            });
        }
        result = IntStream.range(0, k).boxed().flatMap(i ->
            IntStream.range(0, buyers.get(i).size()).boxed().map(j -> {
                    final int finalI = i;
                    return buyers.get(finalI).get(j) * (1 + j);
                }
            )
        ).reduce(0, (subtotal, element)->subtotal + element);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

