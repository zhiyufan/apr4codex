package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int n = start;
        int m = goal;
        int ans = 0;
        int c = 0;
        while (n > 0 || m > 0) {
            int b1 = n % 2;
            int b2 = m % 2;
            if (b1 != b2) {
                c++;
            } else {
                ans += c / 2;
                c = 0;
            }
            n /= 2;
            m /= 2;
        }
        if (c % 2 != 0)
            return -1;
        return ans + c / 2;
    }

    
}