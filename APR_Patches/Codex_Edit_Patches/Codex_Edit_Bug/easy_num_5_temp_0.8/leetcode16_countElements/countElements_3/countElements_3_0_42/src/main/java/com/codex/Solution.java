package com.codex;

import java.util.*;

public class Solution {
   public static int countElements(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int num : nums) map.add(num);
        int count=0;
        for(int num : nums){
            if(map.contains(num+1)){
                count++;
            }
        }
        return count;
        
    }

    
}