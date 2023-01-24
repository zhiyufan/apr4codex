package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @param nums3 an integer array
     * @return a set which includes all the integers
     */
    public List<Integer> intersection(int[] nums1, int[] nums2, int[] nums3) {
        // Write your code here
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        } 

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            if (set.contains(nums3[i])) {
                result.add(nums3[i]);
                set.remove(nums3[i]);
            }
        }
        return result;
    }

    
}