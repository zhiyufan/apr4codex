package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        for(int i = 0; i < num.length(); i++) {
            count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
        }
        int[] ans = new int[10];
        for(int i = 9; i >= 0; i--) {
            while(count[i] > 0) {
                ans[i]++;
                count[change[i]]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            while(ans[i]-- > 0) sb.append(i);
        }
        return sb.toString();
    }







    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        if(nums == null || nums.length == 0) { 
            ans[0] = ans[1] = -1;
            return ans;
        }
        int left = 0, right = nums.length-1;
        while(left <= right) {
            int mid = (left + right) >> 1;
            if(nums[mid] == target) {
                int j = mid;
                for(; j >= 0; j--) {
                    if(nums[j] != target) break;
                }
                ans[0] = j+1;
                j = mid;
                for(; j < nums.length; j++) {
                    if(nums[j] != target) break;
                }
                ans[1] = j-1;
                return ans;
            } else if(target < nums[mid]) right = mid-1;
            else left = mid+1;
        }
        ans[0] = ans[1] = -1;
        return ans;
    }


    
}