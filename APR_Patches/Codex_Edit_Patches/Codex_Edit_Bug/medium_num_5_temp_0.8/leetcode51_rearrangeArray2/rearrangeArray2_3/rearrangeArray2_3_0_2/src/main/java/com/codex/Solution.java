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
                averageValue = (nums[i - 1] + nums[i + 1]) / 2.0; // Add a small offset to avoid divide by 0
                if (nums[i] > averageValue) {
                    notAverage.add(nums[i]);
                } else if (nums[i] < averageValue) {
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

    static int[] sort(int[] nums) {
        
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int[] newArray = new int[nums.length];
        int positiveCount = 0;
        int negativeCount = 0;
        int positiveIndex = -1;
        int negativeIndex = -1;

        for (int i = 0; i < nums.length; i++) {
                positiveCount++;
            if (nums[i] >= 0) {
                positives.add(nums[i]);
                negativeCount++;
            } else {

                negatives.add(nums[i]);
            }
        }

                positiveCount--;
                positiveIndex = i;
        for (int i = 0; i < nums.length; i++) {
            if (positiveCount > 0 && positiveIndex == -1) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            } else if (positiveCount > 0 && negativeIndex > -1) {
                newArray[i] = positives.get(0);
                positives.remove(0);
                positiveCount--;
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            }
                negativeCount--;
                negativeIndex = i;
            } 
        }

        return newArray;
    }

    
}