package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {//threeSum
            List<List<Integer>> temp = threeSum(nums, i, target);
            if (temp != null) res.addAll(temp);
        }
        return res;
    }
    
    public List<List<Integer>> threeSum(int[] nums, int index, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int i = index + 1;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[index] * 3 > target) break;
            if (nums[j] * 3 < target) break;
            int twoSum = nums[index] + nums[i];
            if (nums[j] * 2 < target - twoSum) {
                i++;
                while (i < j && nums[i] == nums[i - 1]) i++;
                continue;
            } 
            if (nums[i] * 2 > target - twoSum) {
                j--;
                while (i < j && nums[j] == nums[j + 1]) j--;
                continue;
            }
            int compare = target - twoSum;
            int l = i;
            int r = j;
            while (l < r) {
                if (nums[l] + nums[r] == compare) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[index]);
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    res.add(temp);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (nums[l] + nums[r] < compare) {
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                } else {
                    r--;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
            }
            i++;
            while (i < j && nums[i] == nums[i - 1]) i++;
            j--;
            while (i < j && nums[j] == nums[j + 1]) j--;
            }
        }
        return res;
    }   
}
}