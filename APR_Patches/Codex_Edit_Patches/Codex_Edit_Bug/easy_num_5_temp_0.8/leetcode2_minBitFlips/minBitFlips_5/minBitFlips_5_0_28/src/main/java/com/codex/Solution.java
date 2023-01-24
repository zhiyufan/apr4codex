package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int left = start;
        int right = goal;
        int i = -1;
        while (left != right) {
            if ((left & 1) != (right & 1)) {
                count += 1;
                if (i > 0) {
                    int tmp = left ^ (1 << i);
                    if (tmp == right) {
                        return -1;
                    }
                }
                left ^= 1 << (i + 1);
            }
            left >>= 1;
            right >>= 1;
            i++;
        }
        return count;
    }

    
}