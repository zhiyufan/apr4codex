package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            list.add(candidates[i]);
            dfs(candidates, i, target - candidates[i], list, result);
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}