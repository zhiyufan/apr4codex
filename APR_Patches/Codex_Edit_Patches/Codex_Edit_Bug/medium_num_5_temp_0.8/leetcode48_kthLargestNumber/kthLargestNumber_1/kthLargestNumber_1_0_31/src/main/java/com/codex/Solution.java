package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the abbreviation function below.
lower = 'abcdefghijklmnopqrstuvwxyz'
upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'


def abbreviation(a, b):
    l1 = len(a)
    l2 = len(b)
    dp = [[False for i in range(l1 + 1)] for j in range(l2 + 1)]
    dp[0][0] = True
    for i in range(1, l1 + 1):
        for j in range(l2 + 1):
            if a[i - 1] in lower:
                if a[i - 1].upper() == b[j - 1]:
                    dp[j][i] = dp[j - 1][i - 1] or dp[j][i - 1]
                else:
                    dp[j][i] = dp[j][i - 1]

    return "YES" if dp[-1][-1] else "NO"


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        a = input()

        b = input()

        result = abbreviation(a, b)

        fptr.write(result + '\n')

    fptr.close()
    
}