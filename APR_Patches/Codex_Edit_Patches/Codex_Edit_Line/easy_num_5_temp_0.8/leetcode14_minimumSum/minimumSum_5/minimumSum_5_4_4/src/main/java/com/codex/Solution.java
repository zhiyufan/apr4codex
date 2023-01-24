package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String left = numString.substring(0, i);
            String right = numString.substring(i, numString.length());
            int sum = Integer.valueOf(left) + Integer.valueOf(right);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    
}