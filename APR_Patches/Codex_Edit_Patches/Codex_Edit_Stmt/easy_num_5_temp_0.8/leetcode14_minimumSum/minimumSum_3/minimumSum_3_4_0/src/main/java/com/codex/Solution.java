package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) { //i=0까지는 1자리, i=1을 포함하면 2자리, ..., i=numStr.length-1을 포함하면 numStr.length자리
            int num1 = Integer.valueOf(numStr.substring(0, i));
            int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }

    
}