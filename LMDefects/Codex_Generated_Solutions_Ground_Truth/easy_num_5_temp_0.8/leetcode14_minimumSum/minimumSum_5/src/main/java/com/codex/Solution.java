package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        /** You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
         * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
         * Return the minimum possible sum of new1 and new2.
         */
        String numString = String.valueOf(num);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < numString.length(); i++) {
            String new1 = numString.substring(0, i);
            String new2 = numString.substring(i, numString.length());
            int sum = Integer.valueOf(new1) + Integer.valueOf(new2);
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    }