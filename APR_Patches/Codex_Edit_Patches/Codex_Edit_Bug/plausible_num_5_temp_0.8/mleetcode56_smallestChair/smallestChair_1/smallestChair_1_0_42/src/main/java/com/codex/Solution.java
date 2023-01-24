package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];

        int[] arr = new int[max + 1]; 

        for (int i = 0; i < times.length; i++) {
            arr[times[i][0]]++;
            arr[times[i][1]]--;
        }

        

            max = Math.max(max, leaving);
        }

        int cnt = 0;
        int ans = -1;
        for (int i = 0; i < max + 1; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}