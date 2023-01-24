package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, 1);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums2) {
            if (map1.containsKey(num)) {
                result.add(num);
            }
            map2.put(num, 1);
        }
        for (int num : nums3) {
            if (map1.containsKey(num) || map2.containsKey(num)) {
                result.add(num);
            }
        }
        return result;
    }

   
    public static void main(String[] args) {
        int[] nums1 = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};
        int[] nums2 = {3, 2, 12, -5, -12, 4, 0, 0, 120};
        int[] nums3 = {-1, 4, 3, 0, -34, 2, 0, 4, -12};
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result);
    }

    [0, 4, -1]
}