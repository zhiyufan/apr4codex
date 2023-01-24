package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

=======
public static List<Integer> targetIndices(int[] nums, int target) {
        
    List<Integer> indices = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            indices.add(i);
        }
    }
    Collections.sort(indices);
    return indices;
}
>>>>>>> d23a700a3ca8d8e2fa2f633156dcb92a5e5eb49b
    
}