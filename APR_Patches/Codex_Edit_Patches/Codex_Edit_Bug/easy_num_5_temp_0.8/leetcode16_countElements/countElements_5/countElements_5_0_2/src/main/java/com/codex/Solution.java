package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] == nums[i] + 1) && (i != j)) {
                    result++;
                    break;
                }
            }
        }



        public static int countElements(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int result = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (set.contains(num + 1)) {
                result++;
            }
        }
        return result;
    }
        return result;
    
    }

    
}