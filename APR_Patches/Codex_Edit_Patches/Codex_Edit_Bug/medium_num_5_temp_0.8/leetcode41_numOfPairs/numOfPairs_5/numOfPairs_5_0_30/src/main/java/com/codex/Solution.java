package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(hm.containsKey(Integer.valueOf(target) - Integer.valueOf(nums[i]))){
                int count = hm.get(Integer.valueOf(target) - Integer.valueOf(nums[i]));
                if(count == 1){
                    ans++;
                    hm.remove(Integer.valueOf(target) - Integer.valueOf(nums[i]));
                }else{
                    ans = ans + count;
                    hm.put(Integer.valueOf(target) - Integer.valueOf(nums[i]), count - 1);
                }
            }else{
                if(hm.containsKey(Integer.valueOf(nums[i]))){
                    int count = hm.get(Integer.valueOf(nums[i]));
                    hm.put(Integer.valueOf(nums[i]), count + 1);
                }else{
                    hm.put(Integer.valueOf(nums[i]), 1);
                }
            }
        }
        return ans;
    }

    
}