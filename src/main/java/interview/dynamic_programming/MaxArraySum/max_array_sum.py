#!/bin/python3

# import math
import os
# import random
# import re
# import sys

# Complete the maxSubsetSum function below.


def maxSubsetSum(arr):
    return 0


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = maxSubsetSum(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
