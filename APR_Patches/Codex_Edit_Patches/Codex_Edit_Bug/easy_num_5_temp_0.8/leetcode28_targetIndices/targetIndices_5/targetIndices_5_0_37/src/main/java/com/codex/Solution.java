package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }

     public static void main(String[] args) {

        Integer[] nums = new Integer[] {2, 3, 4, 5, 6, 7, 8, 5, 6, 7, 10, 5};
        List<Integer> newNums = Arrays.asList(nums);
        int target = 5;

        int l = newNums.size();

        // for (int i = 0; i < l; i++) {
        //     if (newNums.get(i) == target) {
        //         System.out.println("At " + i );
        //     }
        // }

        Integer index = 0;
        while(index < l) {
            if (newNums.get(index) == target) {
                System.out.println("At " + index);
            }
            index++;
        }

        // Integer index = 0;
        // do {
        //     if (newNums.get(index) == target) {
        //         System.out.println("At " + index);
        //     }
        //     index++;
        // }
        // while(index < l);
        return result;
    }
    }

    
}