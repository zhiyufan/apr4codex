package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num, int min) {
        
        String numString = String.valueOf(num); //convert number to string
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) { //loop through string
            String new1 = numString.substring(0, i); //create 2 string after dividing it
            String new2 = numString.substring(i, numString.length()); //create 2 string after dividing it
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2); //find their sum
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    
}