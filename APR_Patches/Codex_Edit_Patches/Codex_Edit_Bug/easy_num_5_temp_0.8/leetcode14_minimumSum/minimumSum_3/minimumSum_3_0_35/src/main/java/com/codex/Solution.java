package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static int minimumSum(String num) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 1; i < num.length(); i++) {
            int num1 = Integer.valueOf(num.substring(0, i));
            int num2 = Integer.valueOf(num.substring(i, num.length()));
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }

    
}