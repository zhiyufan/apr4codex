package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
    int [] avgs = new int[nums.length-k+1];
    for(int i = 0; i <= nums.length-k; i++){
        int sum = 0;
        for(int j = 0; j < k; j++){
            sum += nums[i+j];
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