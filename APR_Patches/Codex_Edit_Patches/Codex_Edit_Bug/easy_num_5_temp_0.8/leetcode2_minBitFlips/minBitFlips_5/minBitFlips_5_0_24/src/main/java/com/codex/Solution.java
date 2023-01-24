package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(long start, long goal) {
        
        long count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && (start & (1 << i)) == goal & (1 << i)) {
                    return -1; // set the bit to goal again
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