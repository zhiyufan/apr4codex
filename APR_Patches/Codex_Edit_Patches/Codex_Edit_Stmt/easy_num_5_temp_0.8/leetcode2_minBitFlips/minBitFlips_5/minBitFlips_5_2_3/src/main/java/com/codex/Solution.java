package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {    // check current bit
                count++;
                // if current bit is not the same, change it and check if it is the same as last time
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;                        // shift to next bit
            goal >>= 1;
            i++;
        }
        return count;
    }

    
}