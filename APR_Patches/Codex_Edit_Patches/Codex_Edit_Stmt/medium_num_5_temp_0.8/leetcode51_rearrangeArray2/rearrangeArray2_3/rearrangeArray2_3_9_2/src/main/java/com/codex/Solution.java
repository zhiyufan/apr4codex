package com.codex;

import java.util.*;

public class Solution {
public static int[] rearrangeArray2(int[] nums) {
    
    
    ArrayList<Integer> notAverage = new ArrayList<>();
    ArrayList<Integer> average = new ArrayList<>();
    int[] newArray;
    double averageValue = 0;
    
    if (nums.length > 1) {
        for (int i = 1; i < nums.length - 1; i++) {
            averageValue = (nums[i - 1] + nums[i + 1]) / 2.0;
            if (nums[i] > averageValue) {
                notAverage.add(nums[i]);
            } else {
                average.add(nums[i]);
            }
        } 
    }

    newArray = new int[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
        if (i == 0) {
            newArray[0] = nums[0];
        } else if (i == nums.length - 1) {
            newArray[nums.length - 1] = nums[nums.length - 1];
        } else {
            if (notAverage.size() > 0) {
                newArray[i] = notAverage.get(0);
                notAverage.remove(0);
            } else if (average.size() > 0) {
                newArray[i] = average.get(0);
                average.remove(0);
            }
        } 
    }

    return newArray;
}
}