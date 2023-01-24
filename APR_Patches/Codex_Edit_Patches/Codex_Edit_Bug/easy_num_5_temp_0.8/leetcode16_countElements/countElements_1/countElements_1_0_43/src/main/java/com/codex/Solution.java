package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int result = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i], 1);
            }
            else{
                hmap.put(nums[i], hmap.get(nums[i])+1);
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(hmap.containsKey(nums[i]+1)){
                if(hmap.get(nums[i]+1) != 0){
                    result++;
                }
            }
        }
        return result;
    }
}