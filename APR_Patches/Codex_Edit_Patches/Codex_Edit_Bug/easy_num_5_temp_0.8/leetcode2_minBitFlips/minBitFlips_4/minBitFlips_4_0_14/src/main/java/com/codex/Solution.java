package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int ans = 0;
        int flip = 0;
        int n = start;
        int m = goal;

        while (n > 0) {
            int b1 = n % 2;
            int b2 = m % 2;
            if (b1 != b2) {
                flip++;
            } else {
                ans += flip / 2;
                flip = 0;
            }
            n /= 2;
        }

        while (m > 0) {
            int b1 = 0;
            int b2 = m % 2;
            if (b1 != b2) {
                flip++;
            } else {
                ans += flip / 2;
                flip = 0;
            }
            m /= 2;
        }

        if (flip != 0 && flip % 2 != 0) {
            ans = -1;
        }

        return ans;
    }

    
}