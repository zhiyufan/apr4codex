package com.codex;

import java.util.*;

public class Solution {
    public static int countTriples(int n) {
        /** A square triple (a,b,c) is a triple where a, b, and c are integers and a^2 + b^2 = c^2.
         * Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
         */

        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int c = (int)Math.sqrt(a * a + b * b);
                if (c <= n && c * c == a * a + b * b) {
                    count++;
                }
            }
        }

        return count;
    }

    }