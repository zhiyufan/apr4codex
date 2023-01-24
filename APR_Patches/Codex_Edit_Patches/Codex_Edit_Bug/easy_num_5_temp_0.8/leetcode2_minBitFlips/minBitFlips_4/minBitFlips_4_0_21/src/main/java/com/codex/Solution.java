package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int n = start;
        int m = goal;
        int ans = 0;
        int count = 0;
        while (n > 0 && m > 0) {
            if ((n & 1) != (m & 1)) {
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            n >>= 1;
            m >>= 1;
        }
        while (n > 0) {
            if ((n & 1)) {
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            n >>= 1;
        }
        while (m > 0) {
            if ((m & 1)) {
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            m >>= 1;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}