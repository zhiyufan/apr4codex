package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        /** You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
         * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
         * Return the minimum possible sum of new1 and new2.
         */
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