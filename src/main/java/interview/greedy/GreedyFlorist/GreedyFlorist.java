package interview.greedy.GreedyFlorist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

@SuppressWarnings("PMD")
public class GreedyFlorist {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        var result = 0;
        List<List<Integer>> buyers = new ArrayList<>();
        IntStream.range(0,k).forEach(i -> buyers.add(new ArrayList<>()));
        System.out.println("buyers size = " + buyers.size());
        Arrays.sort(c);
        Collections.reverse(Collections.singletonList(c));
        for (var i = 0; i < c.length; i += k) {
            int finalI = i;
            IntStream.range(0,k).forEach(j -> {
                if (finalI + j < c.length) {
                    buyers.get(j).add(c[finalI + j]);
                }
            });
        }
        result = buyers.stream().mapToInt(item -> item.stream().mapToInt(Integer::intValue).sum()).sum();
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

