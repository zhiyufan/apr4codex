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

    public int[] rearrange(int[] elements) {
        int n = elements.length;
        int[] res = new int[n];
        Arrays.sort(elements);
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            res[index++] = elements[n / 2 + i];
            res[index++] = elements[i];
        }
        if (n % 2 == 1) {
            res[n - 1] = elements[n - 1];
        }
        return res;
    }
}