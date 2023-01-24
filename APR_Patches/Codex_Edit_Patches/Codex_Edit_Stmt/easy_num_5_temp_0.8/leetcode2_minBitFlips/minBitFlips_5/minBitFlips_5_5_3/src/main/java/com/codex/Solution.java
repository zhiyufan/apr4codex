package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = -1;
        int i = -1;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
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