package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {

        // max prefix sum
        int[] ps = new int[k + 2];
        ps[0] = 0;

        int[] ans = new int[k];
        int maxSum = -999999999;
        
        int i;
        int j;
        int start;
        int target;
        int stop;
        int sum;
        
        for(i = 0; i < k; ++i){
            ps[i + 1] = ps[i] + nums[i];
        } 
        ps[k + 1] = -999999999;
        
        for(i = 0; i < k; ++i){
            sum = ps[i + 1] - ps[0];
            if(sum > maxSum){
                maxSum = sum;
                ans[i] = i + 1;
            }
        }
        
        for(i = k; i < nums.length; ++i){
            sum = ps[k + 1] - ps[0];
            if(sum > maxSum){
                maxSum = sum;
                ans[k - 1] = k;
            }
            start = ps[k + 1] - ps[1] >= ps[k] - ps[0] ? 1 : 0;
            for(j = 1; j <= k; ++j){
                target = ps[j] - ps[start];
                sum = ps[k + 1] - target;
                if(sum > maxSum){
                    maxSum = sum;
                    ans[k - 1] = j;
                }
                if(ps[j + 1] - ps[start] >= target){
                    start = j + 1;
                }
            }
            ps[k + 1] = ps[k] + nums[i];
            stop = k;
            while(ps[stop] < ps[stop - 1]){
                ps[stop] = ps[stop - 1];
                stop--;
            }
            ps[stop] = ps[k + 1];
        }
        
        sum = ps[k + 1] - ps[0];
        if(sum > maxSum){
            maxSum = sum;
            ans[k - 1] = k;
        }
        
        start = 0;
        for(i = k - 1; i >= 0; --i){
            sum = ps[ans[i]] - ps[start];
            if(sum > maxSum){
                maxSum = sum;
                ans[i - 1] = ans[i] - 1;
            }
            start = ans[i];
        }

        return ans;
    }
}