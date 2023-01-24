package com.codex;

import java.util.*;

public class Solution {
public static int[] rearrangeArray2(int[] nums) {

        ArrayList<Integer> notAverage = new ArrayList<>();
        ArrayList<Integer> average = new ArrayList<>();
        int[] newArray;
        double averageValue;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                averageValue = ((double) nums[i - 1] + (double) nums[i + 1]) / 2.0;
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

        int[] newArray;
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int positiveIndex;
        int negativeIndex;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positives.add(nums[i]);
            } else {
        }

        newArray = new int[nums.length];
        positiveIndex = 0;
        negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0) {
                if (negativeIndex == 0) {
                    newArray[i] = positives.get(0);
                    positives.remove(0);
                    positiveIndex = i;
                }
            }

            if (negatives.size() > 0) {
                if (positiveIndex == 0) {
                    newArray[i] = negatives.get(0);
                    negatives.remove(0);
                    negativeIndex = i;
                }
            }
                negatives.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0 && negativeIndex == 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            } else if (positives.size() > 0 && negativeIndex > 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            }

            if (newArray[i] >= 0) {
                positiveIndex = i;
            } else {
                negativeIndex = i;
            }
        }

        return newArray;
    }

    
}