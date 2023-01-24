package com.codex;

import java.util.*;

public class Solution {
# Problem Statement
Given a list of binary strings, find a binary string that is different from the rest of them.

# Complexity
Time: O(n^2) Space: O(n^2)

# Note
We can use bitwise xor to solve the problem

```
public static String findDifferentBinaryString(String[] nums) {
    
    int n = nums[0].length();
    char[][] char2D = new char[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            char2D[i][j] = nums[i].charAt(j);
        }
    }

    String s = "";
    for (int i = 0; i < n; i++) {
        int ones = 0;
        for (int j = 0; j < n; j++) {
            if (char2D[j][i] == '1') {
                ones++;
            }
        }
        if (ones <= n / 2) {
            s += "0";
        } else {
            s += "1";
        }
    }
    return s;
}

```
    
}