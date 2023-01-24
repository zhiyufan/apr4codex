package com.codex;

import java.util.*;

public class Solution {

// C# program for above approach 
using System; 
  
class GFG  
{ 
    // Function to return the count 
    // of the pair having a maximum 
    // value 
    public static int f(int a, int b) 
    { 
        int ans = 0; 
  
        // Iterating for all the possible 
        // values of a 
        for (int i = 1; i < a; i++) 
  
            // Checking if a's value can 
            // gives maximum answer or not 
            // then increasing the count 
            if (Math.Floor(Math.Sqrt(a * a - i * i)) == 
                Math.Ceiling(Math.Sqrt(a * a - i * i))) 
                ans++; 
  
        // Iterating for all the possible 
        // values of b 
        for (int i = 1; i < b; i++) 
  
            // Checking if b's value can 
            // gives maximum answer or not 
            // then increasing the count 
            if (Math.Floor(Math.Sqrt(b * b - i * i)) == 
                Math.Ceiling(Math.Sqrt(b * b - i * i))) 
                ans++; 
  
        return ans; 
    } 
  
    // Function to return the maximum value 
    // pair count 
    public static int max_value(int n) 
    { 
        // Initializing the variables 
        int ans = 0; 
        int max = int.MinValue; 
        
        // Iterating for all the possible 
        // values of a 
        for (int a = 2; a <= n; a++) 
        { 
            // Iterating for all the possible 
            // values of b 
            for (int b = 1; b < a; b++) 
            { 
                // Checking if the value of 'f' 
                // for the pair is greater than 
                // the maximum value 
                if (max < f(a, b)) 
                { 
                    // Storing the value of pair 
                    max = f(a, b); 
  
                    // Storing the value of pair 
                    // count 
                    ans = max; 
                } 
  
                // Checking if the value of 'f' 
                // for the pair is equal to 
                // the maximum value 
                else if (max == f(a, b)) 
  
                    // Adding the value to the pair 
                    // count 
                    ans++; 
            } 
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}