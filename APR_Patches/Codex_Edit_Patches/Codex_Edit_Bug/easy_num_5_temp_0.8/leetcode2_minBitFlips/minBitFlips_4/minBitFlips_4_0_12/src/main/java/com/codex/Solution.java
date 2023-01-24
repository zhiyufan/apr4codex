package com.codex;

import java.util.*;

public class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start;
        int count = 0;
        int s = 0;
        int t = goal;
        while (s > 0 || t > 0) {
            int b1 = s % 2;
            int b2 = t % 2;
            if (b1 != b2) {
                if (count % 2 == 0)
                    count++;
                count = 0;
            }
            s /= 2;
            t /= 2;
        }
        while (n > 0) {
            if (count % 2 == 0)
                return -1;
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}