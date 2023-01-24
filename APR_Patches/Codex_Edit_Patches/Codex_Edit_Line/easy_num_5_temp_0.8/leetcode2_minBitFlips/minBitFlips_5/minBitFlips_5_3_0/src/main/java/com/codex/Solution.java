package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                goal ^= 1 << i;
                if (i > 0 && start == (goal ^ (1 << (i - 1)))) {
                    return -1;
                }
                start ^= 1 << (i - 1);
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }

    
}