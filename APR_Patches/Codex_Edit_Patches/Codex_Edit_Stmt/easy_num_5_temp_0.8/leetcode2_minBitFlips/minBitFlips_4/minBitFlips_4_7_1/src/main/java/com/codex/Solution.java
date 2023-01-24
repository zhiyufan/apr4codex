package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int n = start;
        int m = goal;
        int ans = 0;
        int count = 0;
        while (start > 0 || goal > 0) {
            int s = start % 2;
            int g = goal % 2;
            if (s != g) {
                count++;
            } else {
                ans += count / 2;
                count = 0;
            }
            start /= 2;
            goal /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }


}