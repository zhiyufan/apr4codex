package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(int num) {
        
        int[] result = new int[3];
        for (int i = 1; i <= num/3; i++) {
            for (int j = i; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if (i + j + k == num) {
                        result[0]=i;
                        result[1]=j;
                        result[2]=k;
                    }
                }
            }
        }
        return result;
    }
    
}