package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Suits {
    private static int minJumps(int[] arr, int n) {
        if(arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for(int i = 1; i < n; i++){
            if(i == n - 1)
                        return jump;

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;

            if(step == 0){
                jump++;
                if(i >= maxReach){
                    return -1;
                }
                step = maxReach - i;
            }
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

    
}