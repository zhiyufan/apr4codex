package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] array = new long[0];

        if (num < 3) return array;

        for (int i = 1; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num + 1; k++) {
                    if (i + j + k == num) {
                        array = new long[]{i, j, k};
                        break;   
                    }
                }
            }
        }
        return array;
    }

    
}