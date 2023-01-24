package com.codex;

import java.util.*;

public class Solution {
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



        public static void main(String[] args) {
            int[] nums = {1, 5, 7, 9, 2, 5, 4, 5};
            List<Integer> indices = targetIndices(nums, 5);
            for (int i = 0; i < indices.size() - 1; i++) {
                System.out.print(indices.get(i) + ", ");
            }
            System.out.print(indices.get(indices.size() - 1));
        }
    
}