package com.codex;

import java.util.*;

public class Solution {
    public static boolean can(int dist, int speed, int k, int mid) {
        double time = dist / speed;
        if (k >= time) {
            return true;
        } else {
            return false;
        }
    }

    public static int minTime(int[] dist, int[] speed, int k) {
        int low = 0;
        int high = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            boolean flag = true;
            for (int i = 0; i < dist.length; i++) {
                if (!can(dist[i], speed[i], k, mid)) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                answer = Math.min(answer, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            
            if (low > high) {
                break;
            }
        }
        
        return answer;
    }
}