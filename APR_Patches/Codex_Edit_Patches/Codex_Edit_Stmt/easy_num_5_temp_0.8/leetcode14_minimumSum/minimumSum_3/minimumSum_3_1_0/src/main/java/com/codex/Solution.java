package com.codex;

import java.util.*;

public class Solution {
  /*1) Given a positive integer N, calculate the sum of all numbers between 1 and N with the least amount of additions.

For example, given N = 4, we can calculate the sum of 1 + 2 + 3 + 4 = 10 with the minimum sum of 3 additions: 1 + 2 + 3 + 4 = 2 + 3 + 5 (3 additions).

public int minimumSum(int num) {
    
    int minSum = Integer.MAX_VALUE;
    String numStr = String.valueOf(num);
    for (int i = 1; i < numStr.length(); i++) {
        int num1 = Integer.valueOf(numStr.substring(0, i));
        int num2 = Integer.ValueOf(numStr.substring(i, numStr.length()));
        minSum = Math.min(minSum, num1 + num2);
    }
    return minSum;
}


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