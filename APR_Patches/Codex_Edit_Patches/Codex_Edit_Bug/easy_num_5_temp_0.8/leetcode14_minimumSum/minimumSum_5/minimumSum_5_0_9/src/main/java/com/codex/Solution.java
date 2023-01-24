package com.codex;

import java.util.*;

public class Solution {
    /*
    Input : 6789
    Output: 56
    Explanation : If you combine the digits 56 is the minimum sum
    */
    public static int minimumSum(int num) {
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            if (new1.length() > 0 && new2.length() > 0) {
                int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
                if (sum < min) {
                    min = sum;
                }
            }
        }
        return min;
    }
    }
}