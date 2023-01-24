package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        
        int n = start;
        int m = goal;
        int n1 = n;
        int m1 = m;
        int c1 = 0;
        int c2 = 0;
        int ans = 0;
        while (n1 > 0) {
            c1 += n1 % 2;
            n1 = n1 / 2;
        }
        while (m1 > 0) {
            c2 += m1 % 2;
            m1 = m1 / 2;
        }
        if(c1 != c2)
            return -1;
        while (n > 0 && m > 0) {
            int nmod = n % 2;
            int mmod = m % 2;
            if (nmod != mmod) {
            } else {
                ans += 1;
            }
            n /= 2;
            m /= 2;
        }
        return ans;
    }

    
}