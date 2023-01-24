package com.codex;

import java.util.*;

public class Solution {
/**
 * http://www.mitbbs.com/article_t/JobHunting/32294468.html
 * 
 * find the maximum number of hill-valley in an array
 * 
 * a hill-valley is a sequence of 3 numbers, for example, 4, 5, 2, the function should return 2
 * 
 * we can do this in O(n) time
 * 
 * 举个例子，如果是个峰，那就是 （4,5,2）；
 * 如果是个谷，那就是（2,5,4）。
 * 给一个数组，找出最多的峰与谷的个数。
 * 
 */
public class HillValley{
    
    public static int countHillValley(int[] nums){
        if(nums==null || nums.length<3)
            return 0;
        
        int n=nums.length;
        int result=0;
        
        //compare nums[i+1], nums[i+2], nums[i+3]
        // if nums[i+2] is the smallest, increment result
        for(int i=0; i<n-2; i++){
            
            if(nums[i]<nums[i+1] && nums[i+2]<nums[i+1]){
                result++;  
            }
        }
        return result;
    }

    
}