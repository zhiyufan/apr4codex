package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String s1 = numString.substring(0, i);
            String s2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(s1) + Integer.valueOf(s2);
            min = Math.min(min, sum);
        }
        return min;
    }

    
}