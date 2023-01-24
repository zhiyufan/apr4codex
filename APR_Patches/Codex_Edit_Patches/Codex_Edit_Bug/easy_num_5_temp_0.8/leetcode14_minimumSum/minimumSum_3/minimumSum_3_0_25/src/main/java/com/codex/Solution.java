package com.codex;

import java.util.*;

public class Solution {
public static int minimumSum(int num) {
        // Write your code here
        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            String num1Str = numStr.substring(0, i);
            String num2Str = numStr.substring(i, numStr.length());
            int num1 = num1Str.isEmpty() ? 0 : Integer.valueOf(num1Str);
            int num2 = num2Str.isEmpty() ? 0 : Integer.valueOf(num2Str);
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }
}
}