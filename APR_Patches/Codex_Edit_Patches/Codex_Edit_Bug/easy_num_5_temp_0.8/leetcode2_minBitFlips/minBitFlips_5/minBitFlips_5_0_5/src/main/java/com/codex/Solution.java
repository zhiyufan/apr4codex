package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal, int chk) {
        if (start == goal) return 0;
        if (chk >= 15) return Integer.MAX_VALUE;

        int count = 0;
        int ans = Integer.MAX_VALUE;
        while (start != goal) { // start not equal to goal
            if ((start & 1) != (goal & 1)) { // compare the right most bit in start and goal
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }

    
}