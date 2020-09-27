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
     * Complete the 'getUsernames' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER threshold as parameter.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
     */

    public static List<String> getUsernames(int threshold) {
        final Function<Integer, String> getUsersByPageNumber = (n) -> String.format("https://jsonmock.hackerrank.com/api/article_users?page=%s", n);

        // HttpClient client = HttpClient.newHttpClient();
        
        /*
        UncheckedObjectMapper mapper = new UncheckedObjectMapper();
        HttpRequest request = HttpRequest.newBuilder(getUsersByPageNumber.apply(1))
        .build();

        HttpClient.newHttpClient()
        .sendAsync(request, BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenApply(mapper::readValue);
        */

        java.net.HttpURLConnection conn = (java.net.HttpURLConnection) new java.net.URL("https://jsonmock.hackerrank.com/api/article_users").openConnection();
        conn.setRequestMethod("GET");
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(1));

        conn.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
        out.writeBytes(java.net.ParameterStringBuilder.getParamsString(params));
        out.flush();
        out.close();


        return new ArrayList<>();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.getUsernames(threshold);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
