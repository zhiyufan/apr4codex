package com.codex;

import java.util.*;

public class Solution {
public static int minimumSum(int num) {
        
        String numString = String.valueOf(num); // convert number to String
        int min = Integer.MAX_VALUE; // initialize minimum sum with maximum integer value
        for (int i = 1; i < numString.length(); i++) { // split the number into two parts
            String new1 = numString.substring(0, i); // first part is from index 0 to i
            String new2 = numString.substring(i, numString.length()); // second part is from index i to the length of the number
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    
}