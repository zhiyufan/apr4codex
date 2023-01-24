package com.codex;

import java.util.*;

public class Solution {
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



        if (count < 2) {
            return new ArrayList<>();
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int num : nums1) {
            if (count == 2 && set.contains(num)) {
                list1.add(num);
                count -= 2;
            }
            if (count == 3 && set.contains(num)) {
                list1.add(num);
                count--;
            }
        }
        for (int num : nums2) {
            if (count == 2 && set.contains(num)) {
                list2.add(num);
                count -= 2;
            }
            if (count == 3 && set.contains(num)) {
                list2.add(num);
                count--;
            }
        }
        for (int num : nums3) {
            if (count == 2 && set.contains(num)) {
                list3.add(num);
                count -= 2;
            }
            if (count == 3 && set.contains(num)) {
                list3.add(num);
                count--;
            }
        }
        list1.addAll(list2);
        list1.addAll(list3);
        return list1;
    }

    
}