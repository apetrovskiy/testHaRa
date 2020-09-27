import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";
        final Function<Integer, Boolean> divisibleByThree = (i) -> 0 == i % 3;
        final Function<Integer, Boolean> divisibleByFive = (i) -> 0 == i % 5;
        if (divisibleByThree.apply(n) && divisibleByThree.apply(n)) {
            System.out.println(FIZZ + BUZZ);
        } else if (divisibleByFive.apply(n)) {
            System.out.println(FIZZ);
        } else if (divisibleByFive.apply(n)) {
            System.out.println(BUZZ);
        } else {
            System.out.println(n);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
