package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        int count = 0;
        int i = 0;
        while (i < 31) {
            if ((start & 1) != (goal & 1) && i > 0 && start == (goal ^ (1 << i))) {
                return -1;
            }
            if ((start & 1) != (goal & 1)) {
                count++; 
                start ^= 1 << i; 
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }

    
}