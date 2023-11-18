#!/bin/python3

# import math
import os

# import random
# import re
# import sys

# Complete the getMinimumCost function below.


def getMinimumCost(k, c):
    result = 0
    buyers = []
    for i in range(k):
        buyers.append([])
    c.sort(reverse=True)
    for i in range(0, len(c), k):
        for j in range(k):
            if i + j < len(c):
                buyers[j].append(c[i + j])
    for i in range(k):
        for j in range(len(buyers[i])):
            result += buyers[i][j] * (1 + j)
    return result


if __name__ == "__main__":
    fptr = open(os.environ["OUTPUT_PATH"], "w")

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    c = list(map(int, input().rstrip().split()))

    minimumCost = getMinimumCost(k, c)

    fptr.write(str(minimumCost) + "\n")

    fptr.close()
