package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int count = 0;
        for (int i : nums) {
            if (set.contains(i + 1)) {
                count++;
                }
            }
        } 
        return count;
    }

    
}