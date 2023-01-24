package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < (num + "").length(); i++) {
            int sum = Integer.valueOf(num / (int) (Math.pow(10, i)) + (num % (int) (Math.pow(10, i))));
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    
}