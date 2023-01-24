package com.codex;

import java.util.*;

public class Solution {
    public static boolean isThree(int n) {
        /** Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
         * An integer m is a divisor of n if there exists an integer k such that n = k * m.
         */

        boolean b = false;
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 3) {
            b = true;
        }
        return b;
    }

    }