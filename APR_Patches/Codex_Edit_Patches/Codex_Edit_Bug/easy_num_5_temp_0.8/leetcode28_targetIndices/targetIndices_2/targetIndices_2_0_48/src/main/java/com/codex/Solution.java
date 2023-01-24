package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }


    public static void main(String[] args){
        int[] intarr = {1,2,3,4,5}
        int val = 6;
        List<Integer> result = targetIndices(intarr, val);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}