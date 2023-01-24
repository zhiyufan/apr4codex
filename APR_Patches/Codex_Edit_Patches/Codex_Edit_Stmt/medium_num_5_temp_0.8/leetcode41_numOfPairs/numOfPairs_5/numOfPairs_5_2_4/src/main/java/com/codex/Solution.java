package com.codex;

import java.util.*;

public class Solution {
public static int numOfPairs(String[] nums, String target) {
        int ans = 0;
        int[] len = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            len[i] = nums[i].length();
        }

        out:
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int size = len[i] + len[j];
                if(size == target.length()){
                    if(Integer.valueOf(nums[i] + nums[j]) == Integer.valueOf(target) || Integer.valueOf(nums[j] + nums[i]) == Integer.valueOf(target)){
                        ans++;
                        continue out;
                    }
                }
            }           
        }

        return ans;
    }
}
}