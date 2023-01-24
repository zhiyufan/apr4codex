package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j; k <= num; k++) {
                    if (i + j + k == num) {
                        System.out.print(i + "," + j + "," + k + "\n");
                    }
                }
            }
        }
        return result;
    }
    
}