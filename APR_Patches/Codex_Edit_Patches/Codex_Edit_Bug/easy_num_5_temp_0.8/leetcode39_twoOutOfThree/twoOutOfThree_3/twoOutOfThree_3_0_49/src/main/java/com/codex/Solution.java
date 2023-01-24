package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        // Step 1: construct a set based on the first array
        // Step 2: construct a set based on the intersection of set1 and set2
        // Step 3: construct a set based on the intersection of set3 and result
        // Step 4: return the array list based on the set
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
            if (set1.contains(num) && set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

}
}