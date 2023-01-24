package com.codex;

import java.util.*;

public class Solution {
    public static long swap(char[] c, int i1, int i2) {
        char temp = c[i1];
        c[i1] = c[i2];
        c[i2] = temp;
        return Long.parseLong(new String(c));
    }

    public static long smallestNumber(long n) {
        
        char[] c = String.valueOf(n).toCharArray();
        int i = 0;
        while (i < c.length - 1 && c[i] <= c[i + 1]) {
            i++;
        }
        if (i == c.length - 1) {
            return swap(c, 0, c.length - 1);
        } else {
            for (int j = i + 1; j < c.length; j++) {
                if (c[j] < c[i]) {
                    n = swap(c, i, j);
                }
            }
        }
        Arrays.sort(c, i + 1, c.length);
        return n;
    }

    
}