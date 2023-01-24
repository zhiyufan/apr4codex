package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        int minSum = 0;
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            int a = Integer.valueOf(numStr.substring(0, i));
            int b = Integer.valueOf(numStr.substring(i, numStr.length()));
            minSum = Math.min(minSum, a + b);
        }
        return minSum;
    }

    
}