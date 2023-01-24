package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
=======
    public static List<Integer> targetIndices(int[] nums, int target) {
>>>>>>> 4f20167a4de4c4b4eda0ffb71f94ba74f2af55a1
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
<<<<<<< HEAD
       
    }

=======
    }
>>>>>>> 4f20167a4de4c4b4eda0ffb71f94ba74f2af55a1
    
}