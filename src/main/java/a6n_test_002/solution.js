"use strict";

const fs = require("fs");

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", function (inputStdin) {
  inputString += inputStdin;
});

process.stdin.on("end", function () {
  inputString = inputString.split("\n");

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

async function getUsernames(threshold) {}

async function main() {
  const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

  const threshold = parseInt(readLine().trim(), 10);

  const result = await getUsernames(threshold);

  ws.write(result.join("\n") + "\n");

  ws.end();
}
