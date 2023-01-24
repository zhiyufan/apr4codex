package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        for(int i=0;i<milestones.length;i++){
            int j;
            int key=milestones[i];
            for(j=i-1;(j>=0)&&(milestones[j]>key);j--){
                milestones[j+1]=milestones[j];
            }
            milestones[j+1]=key;
        }
        long[] dp=new long[milestones.length];
        for(int i=0;i<milestones.length;i++){
            dp[i]=Long.MAX_VALUE;
        }
        dp[0]=milestones[0];
        for(int i=1;i<milestones.length;i++){
            long sum=0;
            for(int j=i;j>=0;j--){
                sum+=milestones[j];
                dp[i]=Math.min(dp[i],dp[j-1]+sum);
            }
        }
        return dp[milestones.length-1];
    }

    
}