package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
<<<<<<< HEAD
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
=======
            int sum = Integer.parseInt(new1) + Integer.parseInt(new2);
            if (sum < min){
                min = sum;
            }
>>>>>>> c0f60d45de54e0b31fb96847d7710f0e60d0c70f
            }
        }
        return min;
    }

    
}