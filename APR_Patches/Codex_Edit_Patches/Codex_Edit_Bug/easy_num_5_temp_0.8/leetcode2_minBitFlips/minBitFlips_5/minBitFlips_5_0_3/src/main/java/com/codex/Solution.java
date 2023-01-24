package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                start ^= 1 << i;
            }
            start >>>= 1;
            goal >>>= 1;
        }
        return count;
    }

    
}