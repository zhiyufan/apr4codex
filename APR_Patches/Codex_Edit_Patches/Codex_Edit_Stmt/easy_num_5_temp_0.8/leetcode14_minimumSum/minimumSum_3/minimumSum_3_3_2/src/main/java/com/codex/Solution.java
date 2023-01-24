package com.codex;

import java.util.*;

public class Solution {
    public int minimumSum(int num) {
        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length() - 1; i++) {
            int num1 = Integer.valueOf(numStr.substring(0, i)) + Integer.valueOf(numStr.substring(i + 1, numStr.length()));
            int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            minSum = Math.min(minSum, num1 + num2);
        }
        return Integer.valueOf(numStr.substring(0, 1)) + Integer.valueOf(numStr.substring(1));
    }

    
}