package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static int minBitFlips(int start, int goal) {
        
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
        return (flips & 1) == 1 ? -1 : flips + left - 1;
    }
}
}