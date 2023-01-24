package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0;
        for (int[] time : times) {
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    int n = times.length;
        Arrays.sort(times, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return a[0]-b[0];
                return a[1]-b[1];
            }
        });
        int lo = 0, hi = times[n-1][1];
        while (lo < hi) {
            int mid = lo + (hi-lo)/2;
            if (checker(targetFriend, times, mid)) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
    public boolean checker(int targetFriend, int[][] times, int time) {
        int count = 0;
        for (int[] t : times) {
            if (t[1] > time) {
                count += Math.min(time, t[1])-t[0];
                if (count >= targetFriend) return true;
            }
        }
        return false;
    }
}