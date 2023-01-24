package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < numStr.length(); i++) {
            if (i == 1) {
                num1 = Integer.valueOf(numStr.substring(0, i));
                num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            }
            else {
                num1 = num1 * 10 + Integer.valueOf(numStr.substring(i - 1, i));
                num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            }
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }

    
}