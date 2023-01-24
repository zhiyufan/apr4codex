package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        int shift = 1;
        int res = 0;
        while (start != 0 || goal != 0) {
            if ((goal & shift) != (start & shift)) {
                if ((goal & shift) > (start & shift)) {
                    // reverse the number to flip
                    start = start ^ shift;
                    shift = shift << 1;
                    res = res + 1;
                } else if ((goal & shift) < (start & shift)) {
                    // too many ones to flip, not equal
                    return -1;
                }
            } else {
                    // Do not need to flip
                    shift = shift << 1;
                }
            } 
            start = start >> 1;
            goal = goal >> 1;
        } 
        return res; 
    }

   
}