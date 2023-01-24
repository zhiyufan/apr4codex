package com.codex;

import java.util.*;

public class Solution {
public static int minBitFlips(int start, int goal) {
        int flips = 0;
        int i = 0;
        while (start > 0 && goal > 0) {
            flips += start & 1;
            flips += goal & 1;
            start >>= 1;
            goal >>= 1;
            i++;
        }
        
        int flips = 0;
        int M = start ^ goal;
        int left = 0;
        while (M > 0) {
            if ((M & 1) == 1) {
                flips++;
            }
            left++;
            M >>= 1;
        }
        return flips + left - 1;
    }
    
}