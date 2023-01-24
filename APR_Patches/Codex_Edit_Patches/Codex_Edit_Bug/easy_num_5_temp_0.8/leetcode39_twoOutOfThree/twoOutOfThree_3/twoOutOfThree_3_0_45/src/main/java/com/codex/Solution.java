package com.codex;

import java.util.*;

public class Solution {
   List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            list.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list.contains(num)) {
                result.add(num);
            }
            list2.add(num);
        }
        for (int num : nums3) {
            if ((list.contains(num) || list2.contains(num)) && !result.contains(num)) {
                result.add(num);
            }
        }
        





    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
            set2.add(num);
        }
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    
}