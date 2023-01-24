package com.codex;

import java.util.*;

public class Solution {
/*

Given a number, you are allowed to split the number into at most 2 parts such that both the parts form a valid number and the sum of the 2 parts is equal to the original number. 
The task is to return the minimum sum that can be obtained by using the above splitting method. 

Example:
Input: 12345
Output: 6 (1 + 2 + 3 + 4 + 5)

Input: 912
Output: 5 (9 + 1 + 2)

*/




    public static int minimumSum(int num) {

        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            int num1 = Integer.valueOf(numStr.substring(0, i));
            int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }

}