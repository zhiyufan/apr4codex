package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

        List<Integer> res = new ArrayList<>();
        int[] left = new int[security.length];
        int[] right = new int[security.length];
        for (int i = 0; i < security.length; i++) {
            left[i] = Math.max(i - time < 0 ? Integer.MIN_VALUE : security[i - time], i - 1 < 0 ? Integer.MIN_VALUE : left[i - 1]);
            right[security.length - 1 - i] = Math.min(i + time >= security.length ? Integer.MAX_VALUE : security[i + time], i + 1 >= security.length ? Integer.MAX_VALUE : right[i + 1]);
        }
        for (int i = time; i < security.length - time; i++) {
            if (security[i] >= left[i] && security[i] <= right[i]) {
                res.add(i);
            }
        }
        return res;
    }

    
}