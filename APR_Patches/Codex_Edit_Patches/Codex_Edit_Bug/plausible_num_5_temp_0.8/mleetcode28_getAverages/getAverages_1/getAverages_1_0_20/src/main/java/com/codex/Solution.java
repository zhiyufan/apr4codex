package com.codex;

import java.util.*;

public class Solution {
   

public static int[] getAverages(int[] nums, int k) {
        

        int[] avgs = new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[i] = sum / k;
        }
        return avgs;
    //public static class Pair {
        //private int min, max;

        //public Pair(int min, int max) {
            //this.min = min;
            //this.max = max;
        //}
    //}
    }

    
}