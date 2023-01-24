package com.codex;

import java.util.*;

public class Solution {
public class TwoOutofThree {
    public static List<Integer> twoOutOfThree(int[] array1, int[] array2, int[] array3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            if (set.contains(num)) {
                result.add(num);
            }
            set.add(num);
        }
        for (int num : array2) {
            if (set.contains(num)) {
                result.add(num);
            }
            set.add(num);
        }
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    
}