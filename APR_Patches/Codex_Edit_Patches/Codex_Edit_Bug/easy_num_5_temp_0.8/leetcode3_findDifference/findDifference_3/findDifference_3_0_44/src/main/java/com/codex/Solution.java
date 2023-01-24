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


--------Bug--------

    public static List<List<Integer>> sumTwo(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }
        for (int i : nums) {
            int temp = target - i;
            if (set.contains(temp)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(temp);
                result.add(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumTwo(new int[]{1,1,2,2}, 3)); // }}
    }

    Output: [[1, 2], [1, 2]]
    Expected: [[1, 2]]

    //Fix bug
    public static List<List<Integer>> sumTwo(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            int temp = target - i;
            if (set.contains(temp)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(temp);
                result.add(list);
            }
            set.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumTwo(new int[]{1, 1, 2, 2}, 3));
    }
}