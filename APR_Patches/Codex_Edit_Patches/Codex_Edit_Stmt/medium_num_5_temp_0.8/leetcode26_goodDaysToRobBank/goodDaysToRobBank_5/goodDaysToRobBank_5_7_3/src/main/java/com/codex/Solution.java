package com.codex;

import java.util.*;

public class Solution {
    // public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
    //     List<Integer> result = new ArrayList<>();
    //     if (security == null || security.length == 0 || time <= 0) return result;

    //     if (time == 1) {
    //         for (int i = 0; i < security.length - 1; i++) {
    //             if (security[i] >= security[i + 1]) result.add(i);
    //         }
    //         return result;
    //     }

    //     int end = security.length - time;
    //     for (int i = time; i <= end; i++) {
    //         int j = 0;
    //         for (j = 1; j <= time; j++) {
    //             if (!(security[i - j] >= security[i - j + 1] && security[i + j] <= security[i + j - 1])) break;
    //         }
    //         if (j > time) result.add(i);
    //     }
    //     return result;
    // }
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> result = new ArrayList<>();
        if (security == null || security.length == 0 || time <= 0) return result;

        if (time == 1) {
            for (int i = 0; i < security.length - 1; i++) {
                if (security[i] >= security[i + 1]) result.add(i);
            }
            return result;
        }

        int end = security.length - time;
        int[] left = new int[security.length];
        int[] right = new int[security.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = i - time;
            right[i] = i + time;
        }

        int lo = 0, hi = 0;
        while (hi < security.length) {
            if (left[hi] >= lo) {
                if (isValid(lo, hi, security)) result.add(hi);
                hi++;
            } else {
                lo++;
            }
        }
        return result;
    }

    private static boolean isValid(int lo, int hi, int[] security) {
        int i = lo + 1, j = hi - 1;
        while (i < j) {
            if (security[i - 1] >= security[i] || security[j + 1] >= security[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}