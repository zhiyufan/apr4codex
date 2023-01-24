package com.codex;

import java.util.*;

public class Solution {
    static int[] sort(int[] nums) {
        int[] newArray = new int[nums.length];
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

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0 && negativeIndex == 0) {
                newArray[i] = positives.get(positiveIndex);
                positiveIndex++;
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(negativeIndex);
                negativeIndex++;
            } else if (positives.size() > 0 && negativeIndex > 0) {
                newArray[i] = positives.get(positiveIndex);
                positiveIndex++;
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(negativeIndex);
                negativeIndex++;
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