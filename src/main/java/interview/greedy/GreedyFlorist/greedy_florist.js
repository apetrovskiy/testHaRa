'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the getMinimumCost function below.
function getMinimumCost(k, c) {
    let result = 0;
    let buyers = [];
    for (let i = 0; i < k; i++) {
        buyers.push([]);
    }
    c.reverse();
    console.log(c);
    for (let i = 0; i < c.length; i += k) {
        for (let j = 0; j < k; j++) {
            if (i + j < c.length) {
                buyers[j].push(c[i + j]);
            }
        }
    }
    console.log(buyers);
    for (let i = 0; i < k; i++) {
        for (let j = 0; j < c[i].length; j++) {
            result += buyers[i][j] * (1 + j);
        }
    }
    console.log(result);
    return result;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const nk = readLine().split(' ');

    const n = parseInt(nk[0], 10);

    const k = parseInt(nk[1], 10);

    const c = readLine().split(' ').map(cTemp => parseInt(cTemp, 10));

    const minimumCost = getMinimumCost(k, c);

    ws.write(minimumCost + '\n');

    ws.end();
}

module.exports = {
    getMinimumCost
};