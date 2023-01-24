package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(List<Integer> nums1, List<Integer> nums2, List<Integer> nums3) {
        
        List<Integer> result = new ArrayList<>();
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        for (int i = 0; i < nums1.size(); i++) {
            if (!set1.contains(nums1.get(i))) {
                set1.add(nums1.get(i));
                for (int j = 0; j < nums2.size(); j++) {
                    if (nums2.get(j) == nums1.get(i) && !set2.contains(nums2.get(j))) {
                        set2.add(nums2.get(j));
                        for (int z = 0; z < nums3.size(); z++) {
                            if (nums3.get(z) == nums2.get(j) && !set3.contains(nums3.get(z))) {
                                result.add(nums3.get(z));
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    
    
}