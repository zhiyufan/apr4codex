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




    public static int twoOutOfThree(int num1, int num2, int num3) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(num1);
        if (set1.contains(num2)) {
            return num2;
        }
        if (set1.contains(num3)) {
            return num3;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9};
        int[] nums2 = {2,3,5,6,10};
        int[] nums3 = {0,1,2,3,11};
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println("The result is: " + result);
    }

    
}