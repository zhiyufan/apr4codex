package com.codex;

import java.util.*;

public class Solution {
    public static int countEven(int num) {
        /** Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
         * The digit sum of a positive integer is the sum of all its digits.
         */
        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    }