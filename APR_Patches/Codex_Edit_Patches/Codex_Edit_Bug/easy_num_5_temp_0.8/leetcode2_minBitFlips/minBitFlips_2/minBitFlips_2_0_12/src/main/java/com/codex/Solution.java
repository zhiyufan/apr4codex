package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int flips = 0;
        int M = start ^ goal;
        int pos = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                if ((start >> pos) & 1 == 1) { /* This is to check if the previous flip is 0 then the count is incremented */
                flips++;
                }
            }
            pos++;
            M >>= 1;
        }
        return flips + pos - 1;
    }
    
}