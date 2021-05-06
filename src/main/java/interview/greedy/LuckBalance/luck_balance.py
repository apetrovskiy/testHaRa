#!/bin/python3

# import math
import os
# import random
# import re
# import sys

#
# Complete the 'luckBalance' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER k
#  2. 2D_INTEGER_ARRAY contests
#


def sorting_by_item_position(item):
    return item[0]


def luckBalance(k, contests):
    IMPORTANT = 1
    sorted_input = sorted(contests, key=sorting_by_item_position)
    important_contests_number: int = sum(
        1 for x in contests if x[1] == IMPORTANT)
    print(f"important number = {important_contests_number}")
    won_items = sum([x[0] for x in sorted_input
                     if x[1] == IMPORTANT]) if k == 0 else \
        sum([x[0] for x in sorted_input
             if x[1] == IMPORTANT][:important_contests_number-k])
    print(f"won items = {won_items}")
    return sum(x[0] for x in contests) - won_items - won_items


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    k = int(first_multiple_input[1])

    contests = []

    for _ in range(n):
        contests.append(list(map(int, input().rstrip().split())))

    result = luckBalance(k, contests)

    fptr.write(str(result) + '\n')

    fptr.close()
