package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;

    public class MinimumSum {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            minimumSum(n);
        }
    }


    }
}