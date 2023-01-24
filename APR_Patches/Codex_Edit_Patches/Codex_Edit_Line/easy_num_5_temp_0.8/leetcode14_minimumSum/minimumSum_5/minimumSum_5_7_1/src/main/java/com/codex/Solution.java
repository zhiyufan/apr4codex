package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i); //add comment
            String new2 = numString.substring(i, numString.length()); //add comment
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum; //add comment
            }
        }
        return min; 
    }

    
}