package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (count > 1 && start == (goal ^ 1)) {
                    return -1;
                }
                start ^= 1;
            }
            start >>= 1;
            goal >>= 1;
        }
        return count;
    }

    
}