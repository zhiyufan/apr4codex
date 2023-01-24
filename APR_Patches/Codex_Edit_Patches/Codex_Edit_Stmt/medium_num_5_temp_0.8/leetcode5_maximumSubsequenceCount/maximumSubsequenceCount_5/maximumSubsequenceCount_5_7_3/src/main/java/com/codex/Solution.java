package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void combinationSum(int[] candidates, int target, int start,
                                List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            list.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i, list, result);
            list.remove(list.size() - 1);
        }

        return result;
    }
}
}