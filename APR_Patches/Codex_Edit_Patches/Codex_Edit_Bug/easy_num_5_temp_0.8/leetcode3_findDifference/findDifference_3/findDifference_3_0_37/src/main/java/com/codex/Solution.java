package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }

    /*
    // 第二种思路，使用寻找交集
    public static List<Integer> findDifference(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int j = 0;
            for(;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    break;
                }
            }
            if(j == nums2.length){
                result.add(nums1[i]);
            }
        }
        return result;
    }
     */
}