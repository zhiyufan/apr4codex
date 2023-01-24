package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int n = start, m = goal;
        int ans = 0, count = 0;
        for (int i = 0 ; i < 32 ; i++) {
            int b1 = (n >> i) & 1;
            int b2 = (m >> i) & 1;
            if (b1 != b2) {
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
        }
        if (count % 2 != 0) return -1;
        return ans + count / 2;
    }

    
}