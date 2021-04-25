#!/bin/python3

# import math
import os

# import random
# import re
# import sys


# Complete the minimumAbsoluteDifference function below.
def minimumAbsoluteDifference(arr):
    arr.sort()
    differences = [abs(arr[x + 1] - arr[x]) for x in range(0, len(arr) - 1)]
    return min(differences)


if __name__ == "__main__":
    fptr = open(os.environ["OUTPUT_PATH"], "w")

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = minimumAbsoluteDifference(arr)

    fptr.write(str(result) + "\n")

    fptr.close()
