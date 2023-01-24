package com.codex;

import java.util.*;

public class Solution {
package com.leetcode.weeky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int res = 0;
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};

            }
            map.put(nums[i],i);
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    

    
}