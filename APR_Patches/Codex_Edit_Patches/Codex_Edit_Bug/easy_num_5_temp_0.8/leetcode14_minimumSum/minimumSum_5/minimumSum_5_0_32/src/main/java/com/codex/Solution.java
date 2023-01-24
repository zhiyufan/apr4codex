package com.codex;

import java.util.*;

public class Solution {
    private static final int MIN = Integer.MAX_VALUE;
    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = MIN;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    
}