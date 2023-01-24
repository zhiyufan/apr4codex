package com.codex;

import java.util.*;

public class Solution {
    public static boolean isSameAfterReversals(int num) {
        /** Reversing an integer means to reverse all its digits.
         * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
         * Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
         */

        int reversed1 = Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
        int reversed2 = Integer.parseInt(new StringBuilder(Integer.toString(reversed1)).reverse().toString());

        return num == reversed2;
    }

    }