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
            for (int j = i + 1; j < n; j++) {
                int onesInCommon = 0;
                for (int k = 0; k < m; k++) {
                    if (bank[i].charAt(k) == '1' && bank[j].charAt(k) == '1') {
                        onesInCommon++;
                    }
                }

                if (onesInCommon > 1) {
                    res += onesInCommon * (onesInCommon - 1) / 2;
                }

                if (onesInCommon == 0) {
                    res += ones[i];
                } else {
                    res += onesInCommon;
                }
            }


            res += ones[i] * (ones[i] - 1) / 2;
        }

        return res;
    }


    
}