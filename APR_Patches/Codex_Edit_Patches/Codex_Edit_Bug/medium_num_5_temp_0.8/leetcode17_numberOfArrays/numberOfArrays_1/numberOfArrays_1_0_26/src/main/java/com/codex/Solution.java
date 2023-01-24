package com.codex;

import java.util.*;

public class Solution {
public boolean canJump(int[] nums) {
        int last=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=last) last=i;
        }
        return last ==0;
    } 

    
}