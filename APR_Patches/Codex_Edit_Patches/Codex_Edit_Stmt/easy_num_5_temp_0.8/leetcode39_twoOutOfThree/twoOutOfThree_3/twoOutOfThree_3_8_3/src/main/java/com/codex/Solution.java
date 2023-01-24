package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Test {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> set3 = new HashSet();
        for (int num : nums1) {
            set1.add(num);
        }        
        for (int num : nums2) {            
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }
        set1.retainAll(set2);
        set3.retainAll(set1);
        return new ArrayList<>(set3);
    }
}
}