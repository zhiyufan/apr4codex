package com.codex;

import java.util.*;

public class Solution {
#Problem 2 Solution
##Problem Statement
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
##Solution
The solution is to store the sum of the subarray in a hash map. If the value of the sum-k is present in the hash map it means that the subarray exists.
##Code
    public int subarraySum(int[] nums, int k) {
        
        if(nums==null || nums.length==0)
            return 0;
        HashMap<Integer,Integer> map=new HashMap();
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            if(sum-k==0)
                count+=1;
            if(map.containsKey(sum-k)){
                int c=map.get(sum-k);
                count+=c;
                }
            map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        if (!flag) {
            return 0;
        }
        int count = 0;
        if (grid[0][0] > x) {
            count += grid[0][0] - x;
            grid[0][0] = x;
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
            grid[0][0] = x;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != grid[0][0]) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}