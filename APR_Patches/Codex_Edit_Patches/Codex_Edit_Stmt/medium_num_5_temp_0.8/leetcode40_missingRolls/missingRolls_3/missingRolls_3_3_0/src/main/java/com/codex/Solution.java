package com.codex;

import java.util.*;

public class Solution {
	
	static int sumRoll( int [] array )
    {
        int sum =0; 
        for(int i = 0; i< array.length; i++)
        {
            sum += array[i];
        }
        
        return sum;
        
    }
    
    public static int[] missingRolls(int[] rolls, int mean, int n) {
            
        int[] ans = new int[n];

        int sum = mean * n - sumRoll(rolls);

        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    
}