#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'beautifulPairs' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY A
#  2. INTEGER_ARRAY B
#


def beautifulPairs(A, B):
    # Write your code here
    n = len(A)
    result_list = []
    candidates = []
    result = 0
    a = {}
    b = {}
    for i in range(n):
        a[i] = A[i]
        b[i] = B[i]
    a = sorted(a.items(), key=lambda kv: (kv[1], kv[0]))
    b = sorted(b.items(), key=lambda kv: (kv[1], kv[0]))
    i = 0
    j = 0
    while i < n and j < n:
        a_item = a[i][1]
        b_item = b[j][1]
        if a_item < b_item:
            i += 1
            if a_item + 1 == b_item:
                candidates.append([i, j])
        elif a_item > b_item:
            j += 1
            if a_item == b_item+1:
                candidates.append([i, j])
        else:
            result_list.append([i, j])
            result += 1
            if i+1 < n and a_item == a[i+1][1]:
                i += 1
            elif j+1 < n and b_item == b[j+1][1]:
                j += 1
            else:
                i += 1
                j += 1
    print(candidates)
    return result


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    A = list(map(int, input().rstrip().split()))

    B = list(map(int, input().rstrip().split()))

    result = beautifulPairs(A, B)

    fptr.write(str(result) + '\n')

    fptr.close()
