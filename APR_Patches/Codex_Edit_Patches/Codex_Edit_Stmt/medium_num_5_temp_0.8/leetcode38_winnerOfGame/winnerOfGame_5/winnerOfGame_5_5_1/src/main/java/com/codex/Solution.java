package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        char[] arr = colors.toCharArray();
        int A = 0, B = 0;
        for(char c : arr) {
            if(c=='A')
                A++;
            else
                B++;
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    

private int start = 0;
private int end = 0;
private int max = 0;
private int[] nums;

public int findMaxLength(int[] nums) {
    this.nums = nums;
    for(end=0;end<=nums.length-1;end++) {
        if(nums[end]==1) {
            start = end+1;
        }
        if(nums[end]==0) {
            max = Math.max(max,end-start+1);
        }
    }
    return max;
}

}