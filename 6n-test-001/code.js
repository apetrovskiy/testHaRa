'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}



/*
 * Complete the 'getUsernames' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts INTEGER threshold as parameter.
 *
 * URL for cut and paste
 * https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
 */

function getUsernames(threshold) {
    final Function < Integer, String > getUsersByPageNumber = (n) - > String.format("https://jsonmock.hackerrank.com/api/article_users?page=%s", n);

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
    Map < String, String > params = new HashMap < > ();
    params.put("page", String.valueOf(1));

    conn.setDoOutput(true);
    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
    out.writeBytes(java.net.ParameterStringBuilder.getParamsString(params));
    out.flush();
    out.close();


    return new ArrayList < > ();
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const threshold = parseInt(readLine().trim(), 10);

    const result = getUsernames(threshold);

    ws.write(result.join('\n') + '\n');

    ws.end();
}