package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int M, int N) {
        int diff = M ^ N;
        int n = diff;
        int count = 0, ans = 0;
        while (n > 0) {
            int b1 = n % 2;
            if (count % 2 == 0 && b1 == 1) {
                count++;
            } else {
                ans += count / 2;
            }
            n /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}