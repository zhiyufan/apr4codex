package com.codex;

import java.util.*;

public class Solution {
public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
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

    
}