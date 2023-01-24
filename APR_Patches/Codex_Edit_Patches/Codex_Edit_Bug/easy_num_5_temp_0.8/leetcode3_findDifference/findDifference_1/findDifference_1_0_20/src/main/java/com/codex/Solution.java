package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> holder = new ArrayList<>();
        findSequence(res, holder, 0, nums);
        return res;
    }
    private void findSequence(List<List<Integer>> res, List<Integer> holder, int index, int[] nums) {
        if(holder.size()>=2){
            res.add(new ArrayList<>(holder));
        }
        Set<Integer> used = new HashSet<>();
        for (int i=index; i<nums.length; i++) {
            if(used.contains(nums[i])) continue;
            if(holder.size()==0 || holder.get(holder.size()-1)<=nums[i]) {
                used.add(nums[i]);
                holder.add(nums[i]);
                findSequence(res, holder, i+1, nums);
                holder.remove(holder.size()-1);
            }
        }
    }

}
}