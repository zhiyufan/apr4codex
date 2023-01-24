package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        

        int n = bank.length;
        int m = bank[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1') {
                    ones[i]++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ones[i] > 1) {
                res += ones[i] * (ones[i] - 1) / 2;
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

    public static double f(double x) {
        return res;
    }


        return Math.cos(x);
    }

    public static double simpson(double a, double b) {
        
        double m = (a + b) / 2.0;
        double res = (b - a) / 6.0 * (f(a) + f(b) + 4.0 * f(m));
        if (Math.abs(res) <= 0.001) {
            return res;
        }

        return simpson(a, m) + simpson(m, b);
    }

    public static double integrate(double a, double b) {

        return simpson(a, b);
    }
}