package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        /** You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
         * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
         * Return the minimum possible sum of new1 and new2.
         */
        int minSum = 0;
        String str = String.valueOf(num);
        ArrayList<String> subs = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subs.add(str.substring(i, j));
            }
        }

        int[] nums = new int[subs.size()];
        for (int i = 0; i < subs.size(); i++) {
            nums[i] = Integer.parseInt(subs.get(i));
        }

        int tempSum = 0;
        for (int i = 0; i < subs.size(); i++) {
            for (int j = 0; j < subs.size(); j++) {
                if (i != j) {
                    tempSum = nums[i] + nums[j];
                    if (tempSum < minSum || minSum == 0) {
                        minSum = tempSum;
                    }
                }

            }
        }

        }