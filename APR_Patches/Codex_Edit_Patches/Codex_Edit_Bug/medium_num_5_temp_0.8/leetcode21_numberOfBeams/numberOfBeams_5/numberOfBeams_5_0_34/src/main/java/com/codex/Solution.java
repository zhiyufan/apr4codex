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

            int diff = 0;
            for (int j = i + 1; j < n; j++) {
                int diffInI = 0;
                int diffInJ = 0;

                for (int k = 0; k < m; k++) {
                    if (bank[i].charAt(k) != bank[j].charAt(k)) {
                        if (bank[i].charAt(k) == '1') {
                            diffInI++;
                        } else {
                            diffInJ++;
                        }
                    }
                }
            }
        }

        return res;
    }


    
}