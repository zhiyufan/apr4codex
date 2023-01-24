package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0, j = 0, k = 0; j < nums2.length && k < nums3.length;) {
            if (nums2[j] < nums3[k]) {
                j++;
            } else if (nums3[k] < nums2[j]) {
                k++;
            } else {
                result.add(nums2[j]);
                nums2[j] = 0;
                nums3[k] = 0;
            }
        }
        for (int i = 0, j = 0, k = 0; i < nums1.length && j < nums2.length && k < nums3.length;) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else if (nums1[i] < nums3[k]) {
                i++;
            } else if (nums2[j] < nums3[k]) {
                j++;
            } else if (nums3[k] < nums1[i]) {
                k++;
            } else if (nums3[k] < nums2[j]) {
                k++;
            } else {
                result.add(nums1[i]);
                nums1[i] = 0;
                nums2[j] = 0;
                nums3[k] = 0;
                i++;
                j++;
                k++;
            }
        }
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else if (nums2[j] == 0) {
                j++;
                continue;
            } else {
                result.add(nums1[i]);
                nums1[i] = 0;
                nums2[j] = 0;
                i++;
                j++;
            }
        }
        for (int i = 0, j = 0; i < nums1.length && j < nums3.length;) {
            if (nums1[i] < nums3[j]) {
                i++;
            } else if (nums3[j] < nums1[i]) {
                j++;
            } else if (nums3[j] == 0) {
                j++;
                continue;
            } else {
                result.add(nums1[i]);
                nums1[i] = 0;
                nums3[j] = 0;
                i++;
                j++;
            }
        }
        for (int i = 0, j = 0; j < nums2.length && i < nums3.length;) {
            if (nums2[j] < nums3[i]) {
                j++;
            } else if (nums3[i] < nums2[j]) {
                i++;
            } else if (nums3[i] == 0) {
                i++;
                continue;
            } else {
                result.add(nums2[j]);
                nums2[j] = 0;
                nums3[i] = 0;
                i++;
                j++;
            }
        }
        /*for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) { 
                if (nums1[i] == nums2[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums2[j] = 0;
                        break;
                    }
                }
            }
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    if (nums1[i] == 0) {
                        continue;
                    } else {
                        result.add(nums1[i]);
                        nums1[i] = 0;
                        nums3[j] = 0;
                        break;
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
        }*/
        return result;
    }
}