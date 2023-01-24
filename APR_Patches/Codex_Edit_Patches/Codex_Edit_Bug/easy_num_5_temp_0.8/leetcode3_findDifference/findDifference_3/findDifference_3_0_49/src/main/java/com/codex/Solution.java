package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3};
        System.out.println("The differences in the array are: " + findDifference(nums1, nums2));
    }

    public static List<Integer> findDifference(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int value : nums1) {
            set1.add(value);
        }
        for (int value : nums2) {
            set2.add(value);
        }
        for (int value : set1) {
            if (!set2.contains(value))
                result.add(value);
        }
        for (int value : set2) {
            if (!set1.contains(value))
                result.add(value);
        }
        return result;
    }
}
}