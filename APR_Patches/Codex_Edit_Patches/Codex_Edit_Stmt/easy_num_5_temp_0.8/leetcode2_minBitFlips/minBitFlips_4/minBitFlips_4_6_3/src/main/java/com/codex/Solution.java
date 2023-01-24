package com.codex;

import java.util.*;

public class Solution {

    /* Logic:
     *     Convert start and goal to binary.
     *     Find the first different bit from start and goal.
     *     If the bit of start = 0 and the bit of goal = 1:
     *         count++
     *     If the bit of start = 1 and the bit of goal = 0:
     *         if count is odd: count++
     *         ans += count / 2
     *     if count is odd, return -1.
     */
    public static int minBitFlips(int start, int goal) {
        int n = start;
        int m = goal;
        int ans = 0;
        int count = 0;
        while (n > 0 || m > 0) {
            int x = n % 2;
            int y = m % 2;
            if (x != y) {
                count++;
            } else {
                if (count % 2 != 0) {
                    count++;
                }
                ans += count / 2; 
                count = 0;    
            }
            n /= 2;
            m /= 2;
        }
        if (count % 2 != 0)
            return -1;
        return ans + count / 2;
    }

    
}