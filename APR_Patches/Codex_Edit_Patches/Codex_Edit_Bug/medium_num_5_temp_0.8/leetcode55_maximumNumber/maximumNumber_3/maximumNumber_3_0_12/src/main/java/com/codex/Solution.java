package com.codex;

import java.util.*;

public class Solution {
    public String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];                //Count for max value in the given number.
        for(int i = 0; i < num.length(); i++) {   // O(N)
            count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;   
        }                                                                
        int[] ans = new int[10];       // New array to store the maximum number.
        for(int i = 9; i >= 0; i--) {
            while(count[i] > 0) {               // Decrease count of value based on change array.
                ans[i]++;
                count[change[i]]--;
            }
        }
        for(int i = 0; i <= 9; i++) {         // We can use array.sort() too but that can 
            if(count[i] > 0) {                // easily get us TLE.
                ans[change[i]] += count[i];
                count[change[i]] = 0;
            }
        }
        return sb.toString();
    }

    
}