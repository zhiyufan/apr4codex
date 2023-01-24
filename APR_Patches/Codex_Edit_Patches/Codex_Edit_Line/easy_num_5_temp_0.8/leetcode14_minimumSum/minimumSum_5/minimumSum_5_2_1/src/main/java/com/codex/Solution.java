package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
=======
public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        
>>>>>>> hotfix
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    
}