package com.codex;

import java.util.*;

public class Solution {
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

    public int search (int[] array, int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(array[mid] == target)
                return mid;
            else if (array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    
}