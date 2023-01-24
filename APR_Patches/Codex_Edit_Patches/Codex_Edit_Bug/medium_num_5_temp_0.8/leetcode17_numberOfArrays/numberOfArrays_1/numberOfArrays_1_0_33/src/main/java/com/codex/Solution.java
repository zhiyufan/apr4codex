package com.codex;

import java.util.*;

public class Solution {
    Input: differences = [1,-3,1,5,-4], lower = -1, upper = 3
    Output: 3
    Explanation: [2,4,5],[2,4,-1,5],[2,4,5,-1] are the possible arrays.

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        // firstly, count the number of possible arrays by prefix sum array
        // iterate the differences array and the find number of valid array 
        // that has at least differnce with upper and lower
        int len = differences.length;
        long result = 0;
        long[] sum = new long[len + 1];
        for(int i = 0; i < len; i++) sum[i + 1] = sum[i] + differences[i];
        for(int i = 0; i < len; i++)
            for(int j = 0; j < len; j++)
                if(sum[j + 1] - sum[i] >= lower && sum[j + 1] - sum[i] <= upper)
                    result++;
        return (int)result;
    }
}