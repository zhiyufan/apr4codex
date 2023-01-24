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

        return res;
    }


        int n = A.length;
        int m = A[0].length;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i].charAt(j) == '1') ones++;
            }
        }

        int res = 0;

        if (ones <= 2) return res;
        res = ones * (ones - 1) * (ones - 2) / 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i].charAt(j) == '1') {
                    int r = i - 1;
                    int c = j;
                    while (r >= 0 && A[r].charAt(c) == '1') {
                        r--;
                    }
                    int u = r;
                    while (r >= 0 && A[r].charAt(c) == '0') {
                        r--;
                    }
                    res -= (u - r) * (ones - 1);
                }
            }
        }

        return res;
    }
}