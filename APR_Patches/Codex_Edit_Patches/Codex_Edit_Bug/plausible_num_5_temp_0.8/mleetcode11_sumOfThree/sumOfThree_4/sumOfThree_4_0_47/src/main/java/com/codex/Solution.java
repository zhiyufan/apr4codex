package com.codex;

import java.util.*;

public class Solution {
    public static long[] sumOfThree(long num) {
        
        long[] result = new long[3];
        if (num % 3 != 0) 
		{
        result = new long[3];
        result[0] = 0;
        result[1] = 0;
        result[2] = 0;
		}else
		{
        long sum = num / 3; 
        result[0] = 1 * sum;
        result[1] = 2 * sum;
        result[2] = 3 * sum;
		}
        return result;
    }

    
}