package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    List<Integer> result = new ArrayList<>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    Arrays.sort(nums3);
    result = commonElements(nums1, nums2);
    result = commonElements(result.toArray(new Integer[0]), nums3);
    return result;
}
public static List<Integer> commonElements(Integer[] nums1, int[] nums2) {
    List<Integer> result = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] == nums2[j]) {
            result.add(nums1[i]);
            i++;
            j++;
        } else if (nums1[i] > nums2[j]) {
            j++;
        } else {
            i++;
    }

    }
    return result;
}
}