package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int n = start;
        int m = goal;
        int r = 0;
        int cur = 0;
        while (n > 0 || m > 0) {
            int b1 = n % 2;
            int b2 = m % 2;
            if (b1 != b2) {
                cur++;
            } else {
                r += cur / 2;
                cur = 0;
            }
            n /= 2;
            m /= 2;
        }
        if (cur % 2 != 0)
            return -1;
        return r + cur / 2;
    }

    
}