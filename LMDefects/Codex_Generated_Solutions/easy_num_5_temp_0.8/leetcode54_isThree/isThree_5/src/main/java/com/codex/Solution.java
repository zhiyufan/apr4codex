package com.codex;

import java.util.*;

public class Solution {
    public static boolean isThree(int n) {
        /** Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
         * An integer m is a divisor of n if there exists an integer k such that n = k * m.
         */

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    }