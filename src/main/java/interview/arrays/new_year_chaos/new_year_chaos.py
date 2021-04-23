#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumBribes function below.


def get_minimum_bribes(q):
    changes: int = 0
    is_chaotic: bool = False
    for i in range(len(q)):
        if q[i] > i + 1:
            if q[i] > i + 3:
                is_chaotic = True
            else:
                changes += (q[i] - i - 1)
    if is_chaotic:
        return 'Too chaotic'
    else:
        return changes


def minimumBribes(q):
    print(get_minimum_bribes(q))


if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        n = int(input())

        q = list(map(int, input().rstrip().split()))

        minimumBribes(q)
