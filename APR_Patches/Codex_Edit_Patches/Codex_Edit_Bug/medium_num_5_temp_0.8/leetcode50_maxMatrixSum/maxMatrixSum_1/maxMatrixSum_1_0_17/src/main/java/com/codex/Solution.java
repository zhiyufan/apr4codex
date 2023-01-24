package com.codex;

import java.util.*;

public class Solution {
%%writefile ./solutions/longest_balanced_substring.py
import string
def longest_balanced_substring(s):
    dp = [[0 for i in range(len(s))] for j in range(len(s))]
    open_count = s.count('(')
    closed_count = s.count(')')
    if open_count != closed_count:
        return 0
    open_pairs = 0
    closed_pairs = 0
    for i in range(len(s)):
        if s[i] == '(':
            open_pairs += 1
        else:
            closed_pairs += 1
        dp[i][i] = open_pairs == closed_pairs
    for l in range(2, len(s)+1):
        for j in range(0, len(s)-l+1):
            i = j+l-1
            if(s[i] == '('):
                open_pairs -= 1
            else:
                closed_pairs -= 1
            if(s[j] == '('):
                open_pairs += 1
            else:
                closed_pairs += 1
            dp[j][i] = ((dp[j+1][i] and open_pairs == 0 and closed_pairs == 0) or (open_pairs == closed_pairs and dp[j][i-1]))
    max_len = 0
    for i in range(len(s)):
        for j in range(i, len(s)):
            if(dp[i][j]):
                max_len = max(max_len, j-i+1)
    return max_len
}