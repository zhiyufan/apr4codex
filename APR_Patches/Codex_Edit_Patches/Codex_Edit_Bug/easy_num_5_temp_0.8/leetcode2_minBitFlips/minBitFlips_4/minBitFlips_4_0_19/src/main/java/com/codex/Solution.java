package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int n = Math.abs(start);
        int m = Math.abs(goal);
        int ans = 0;
        int count = 0;
        while (n != 0 || m != 0) {
            int b1 = 0;
            if (n < 0) {
                 b1 = 1;
                n += 1;
            }
            int b2 = 0;
            if (m < 0) {
                b2 = 1;
                m += 1;
            }
            n = Math.abs(n);
            m = Math.abs(m);
            if (b1 == b2) {
                ans += count / 2;
                count = 0;
            } else {
                count++;
            }
            n /= 2;
            m /= 2;
        }

        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}