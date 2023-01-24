package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        boolean isNum1ArrFinished = false;
        boolean isNum2ArrFinished = false;
        boolean isNum3ArrFinished = false;

        int num1Index = 0;
        int num2Index = 0;
        int num3Index = 0;
        while (true) {
            for (int i = num1Index; i < nums1.length; i++) {
                for (int j = num2Index; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        if (nums1[i] == 0) {
                            continue;
                        } else {
                            result.add(nums1[i]);
                            num1Index = i;
                            num2Index = j;
                            nums1[i] = 0;
                            nums2[j] = 0;
                            break;
                        }
                    }
                    if (j == nums2.length - 1) {
                        isNum2ArrFinished = true;
                    }
                }
            }
            for (int i = num1Index; i < nums1.length; i++) {
                for (int j = num3Index; j < nums3.length; j++) {
                    if (nums1[i] == nums3[j]) {
                        if (nums1[i] == 0) {
                            continue;
                        } else {
                            result.add(nums1[i]);
                            num1Index = i;
                            num3Index = j;
                            nums1[i] = 0;
                            nums3[j] = 0;
                            break;
                        }
                    }
                    if (j == nums3.length - 1) {
                        isNum3ArrFinished = true;
                    }
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    if (nums2[i] == 0) {
                        continue;
                    } else {
                        result.add(nums2[i]);
                        nums2[i] = 0;
                        nums3[j] = 0;
                        break;
                    }
                }
            }
        }
        return result;
    }

    
}