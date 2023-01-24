package com.codex;

import java.util.*;

public class Solution {
public static int[] rearrangeArray2(int[] nums) {

        ArrayList<Integer> notAverage = new ArrayList<>();
        double averageValue = 0;

        ArrayList<Integer> average = new ArrayList<>();
            if (nums.length == 2) {
                averageValue = (nums[0] + nums[1]) / 2;
                if (nums[0] < nums[1]) {
                    average.add(nums[0]);
                    notAverage.add(nums[1]);
                } else if (nums[0] > nums[1]) {
                    average.add(nums[1]);
                    notAverage.add(nums[0]);
                }
            }

        int[] newArray;
        double averageValue = 0;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                averageValue = (nums[i - 1] + nums[i + 1]) / 2.0;
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
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }

        }

        newArray = new int[nums.length];

        for (int i = 0; i < newArray.length; i++) {
            if (positives.size() > 0) {
                newArray[positiveIndex] = positives.get(0);
                positives.remove(0);
                positiveIndex += 2;
            }

            if (negatives.size() > 0) {
                newArray[negativeIndex] = negatives.get(0);
                negatives.remove(0);
                negativeIndex += 2;
            }
        }

        return newArray;
    }
}