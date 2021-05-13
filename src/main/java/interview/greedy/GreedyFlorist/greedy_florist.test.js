const getMinimumCost = require("./greedy_florist").getMinimumCost;
// const { assert, expect } = require("chai");

describe.each([
        [3, [2, 5, 6], 13],
        [2, [2, 5, 6], 15],
        [3, [1, 3, 5, 7, 9], 29],
])('getMinimumCost(%i, %o) should equal %i', (k, c, expectedResult) => {
    test(`people = ${k}, cost = ${c}, returns ${expectedResult}`, () => {
        expect(getMinimumCost(k, c)).toBe(expectedResult);
    });
});