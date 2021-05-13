// import each from 'jest-each';
const each = require('jest-each').each;
const getMinimumCost = require("./greedy_florist").getMinimumCost;
const { assert, expect } = require("chai")

describe('getMinimumCost(k, c)', () => {
    each([
        [3, [2, 5, 6], 13],
        [2, [2, 5, 6], 15],
        [3, [1, 3, 5, 7, 9], 29],
    ]).test(`people = ${k}, cost = ${c}`, (k, c, expectedResult) => {
        expect(getMinimumCost(k, c).toBe(expectedResult));
    });
});