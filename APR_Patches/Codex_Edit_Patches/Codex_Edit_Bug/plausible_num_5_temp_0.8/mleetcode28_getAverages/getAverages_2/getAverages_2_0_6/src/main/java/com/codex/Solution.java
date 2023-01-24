package com.codex;

import java.util.*;

public class Solution {

    /*
    class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        Arrays.fill(res, Integer.MAX_VALUE);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                res[i] = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (res[j] > i - j) {
                        res[j] = i - j;
                    } else {
                        break;
                    }
                }
                for (int j = i + 1; j < S.length(); j++) {
                    if (res[j] > j - i) {
                        res[j] = j - i;
                    } else {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
    // */




    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        if (nums.length == 0 || k == 0) {
            return avgs;
        }
        for (int i = 0; i < nums.length; i++) {
            int low = i - k;
            int high = i + k;
            int sum = 0;
            int count = 0;
            for (int j = low; j <= high; j++) {
                if (j >= 0 && j < nums.length) {
                    sum += nums[j];
                    count++;
                }
            }
            avgs[i] = count == 0 ? -1 : sum / count;
        }
        return avgs;
    }

    
}