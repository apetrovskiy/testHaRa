package a6n_test_001;

import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.*;

@SuppressWarnings("PMD")
class Result {

    /*
     * Complete the 'getUsernames' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER threshold as parameter.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
     */

    public static List<String> getUsernames(int threshold) throws IOException {
        final Function<Integer, String> getUsersByPageNumber =
                (n) ->
                        String.format(
                                "https://jsonmock.hackerrank.com/api/article_users?page=%s", n);

        System.out.println(getUsersByPageNumber.apply(1));

        java.net.HttpURLConnection conn =
                (java.net.HttpURLConnection)
                        new java.net.URL(getUsersByPageNumber.apply(1)).openConnection();
        conn.setRequestMethod("GET");

        conn.setDoOutput(true);

        conn.setRequestProperty("Content-Type", "application/json");
        String contentType = conn.getHeaderField("Content-Type");
        conn.setInstanceFollowRedirects(false);

        // DataOutputStream out = new DataOutputStream(conn.getOutputStream());
        // out.flush();
        // out.close();

        int status = conn.getResponseCode();
        System.out.print("status code: " + status);

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println(content);

        return new ArrayList<>();
    }
}

@SuppressWarnings("PMD")
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =
                new BufferedWriter(
                        new FileWriter(
                                "D:\\Projects\\Java\\1.txt")); // System.getenv("OUTPUT_PATH")));

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.getUsernames(threshold);

        bufferedWriter.write(result.stream().collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
