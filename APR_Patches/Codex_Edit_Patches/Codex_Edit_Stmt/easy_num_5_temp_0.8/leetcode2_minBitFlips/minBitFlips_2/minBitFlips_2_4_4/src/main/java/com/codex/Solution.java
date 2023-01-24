package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int end = 0;
        while (M > 0) {
            if (((M >> end) & 1) == 1) {
                flips++;
                end++;
            }
            end++;
        }
        return flips;
    }
    
}