package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        
        int flips = 1;
        int M = start ^ goal;
        int left = 1;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips--;
            }
            else {
                left--;
            }
            M >>= 1;
        }
        return flips < 0 ? -1 : left - 1;
    }
    
}