package com.codex;

import java.util.*;

public class Solution {
    public static int countTriples(int n) {
        /** A square triple (a,b,c) is a triple where a, b, and c are integers and a^2 + b^2 = c^2.
         * Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
         */

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }


    }