package com.codex;

import java.util.*;

public class Solution {
// Java program to find maximum  
// value of Sum( i*arr[i]) with 
// only rotations on given array  
// allowed 
import java.io.*; 
  
class Main 
{ 
      
    // Returns maximum value of 
    // i*arr[i] 
    static int maxSum(int arr[], 
                            int n) 
    { 
        // Find array sum and i*arr[i] 
        // with no rotation 
        int arrSum = 0;    // Stores sum of arr[i] 
        int currVal = 0;   // Stores sum of i*arr[i] 
        for (int i=0; i<n; i++) 
        { 
            arrSum = arrSum + arr[i]; 
            currVal = currVal+(i*arr[i]); 
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}