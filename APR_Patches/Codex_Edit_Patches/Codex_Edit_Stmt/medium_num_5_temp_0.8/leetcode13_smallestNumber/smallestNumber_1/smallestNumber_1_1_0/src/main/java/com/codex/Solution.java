package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        int[] res = new int[10];
        while (num > 0) {
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            int aux = res[index];
            for (int i = 0; i < aux; i++) min = min * 10 + index;
        }
        return min;
    }
    
}