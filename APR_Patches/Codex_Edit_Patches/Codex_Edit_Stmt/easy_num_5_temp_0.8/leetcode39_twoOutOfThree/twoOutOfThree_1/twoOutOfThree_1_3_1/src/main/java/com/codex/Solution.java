package com.codex;

import java.util.*;

public class Solution {
/**
 * @author ChenLizhong
 */
public class Solution {
    public static List<Integer> twoOutOfThree1(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
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
        }
        return result;
    }


    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums1) {
            numSet.add(num);
        }
        for (int num : nums2) {
            if (numSet.contains(num)) {
                result.add(num);
            }
        }
        if (result.size() == 0) {
            return result;
        }
        for (int num : nums3) {
            if (result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 4, 5, 6 };
        int[] nums3 = { 3, 5, 8 };

        System.out.println(twoOutOfThree(nums1, nums2, nums3));
        System.out.println(twoOutOfThree1(nums1, nums2, nums3));
    }
}
}