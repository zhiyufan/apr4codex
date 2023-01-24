package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n: nums1) {
            set1.add(n);                    //set1 adds the values of nums1
                                            //O(n)
        }
        for (int n: nums2) {                //We compare each number in nums2 with the numbers in num1
            if (set1.contains(n)) {
                set2.add(n);                //If both numbers are same, then add that number to set2
            }
        }
        for (int n: nums3) {                //We compare each number in nums3 with the numbers in num1
            if (set1.contains(n)) {
                set2.add(n);                //If both numbers are same, then add that number to set2
            }
        }
        
        return new ArrayList<>(set2);       //we return the set2
    }
    
    
}