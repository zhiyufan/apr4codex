package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        /** You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
         * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
         * Return the minimum possible sum of new1 and new2.
         */
        String str = "" + num;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < (1 << str.length()); i++) {
            StringBuilder firstNum = new StringBuilder();
            StringBuilder secondNum = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) == 0) {
                    firstNum.append(str.charAt(j));
                } else {
                    secondNum.append(str.charAt(j));
                }
            }
            if (firstNum.length() == 1) {
                first = firstNum.charAt(0) - '0';
            } else {
                first = Integer.parseInt(firstNum.toString());
            }

            if (secondNum.length() == 1) {
                second = secondNum.charAt(0) - '0';
            } else {
                second = Integer.parseInt(secondNum.toString());
            }
            }