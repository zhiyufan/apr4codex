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

            for (int j = 0; j <= i; j++) {
                if (ones[i] > 0 && ones[j] > 0) {
                    int k = 0;
                    for (; k < m; k++) {
                        if (bank[i].charAt(k) == '0' && bank[j].charAt(k) == '0') {
                            break;
                        }
                    }

                    if (k == m) {
                        res += ones[i] * ones[j];
                    }
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

        return res;
    }


    
}