package com.codex;

import java.util.*;

public class Solution {
    public static int countEven(int num) {
        /** Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
         * The digit sum of a positive integer is the sum of all its digits.
         */
        int res = 0;
        for (int i = 1; i <= num; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    }