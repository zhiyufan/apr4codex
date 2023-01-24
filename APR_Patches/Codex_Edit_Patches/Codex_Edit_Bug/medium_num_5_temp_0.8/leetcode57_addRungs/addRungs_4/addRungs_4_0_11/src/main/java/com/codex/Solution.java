package com.codex;

import java.util.*;

public class Solution {
public class Solution {
	int l; 
    int r; 
    int n; 
  
    // returns true if the frog can 
    boolean frog(int a[], int d) 
    { 
        l = 0; 
  
        // no of steps the frog will 
        // jump in this case 
        r = d; 
  
        n = a.length; 
  
        // this loop finds if the frog 
        // can jump to the last stone 
        // or not 
        for (int i = 0; i < n; i++) { 
            // if the frog can't jump 
            // to next stone then 
            // return false 
            if (l == r) 
                return false; 
  
            // updating the steps 
            // the frog can jump 
            r = Math.max(r, a[i] + d); 
  
            // if the frog can jump 
            // to the last stone 
            if (r >= n - 1) 
                return true; 
        } 
  
        // if the frog can't reach 
        // to the last stone 
        return false; 
    } 
  
    // returns the minimum number 
    // of steps the frog will 
    // take to reach last stone 
    int minSteps(int a[]) 
    { 
        int d = 0, f = a.length - 1; 
  
        // this loop will find 
        // the range of steps 
        while (d <= f) { 
            int m = (d + f) / 2; 
  
            // if the frog can reach 
            // last stone with the 
            // help of m steps 
            // then update the left 
            // no of steps 
            if (frog(a, m)) { 
                // this condition is 
                // to handle the case 
                // when frog can reach 
                // to the last stone 
                // with the help of 
                // only one step 
                if (frog(a, m - 1) == false) 
                    return m; 
  
                // update the left 
                // side of the range 
                f = m - 1; 
            } 
  
            // if the frog can't reach 
            // last stone with the 
            // help of m steps 
            // then update the right 
            // no of steps 
            else
                d = m + 1; 
        } 
  
        return -1; 
    } 
} 
}