package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int val : arr) {
            sum2 += val;
        }
        return sum - sum2;
    }

    public static int maxDiff(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        int max = arr[1] - arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i] - min, max);
            min = Math.min(min, arr[i]);
        }
        if (max < 0)
            return -1;
        return max;
    }

    public static int closestZero(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int val = Math.abs(arr[i] + arr[j]);
                if (val == 0)
                    return 0;
                if (val < max)
                    max = val;
            }
        }

        return max;
    }

    public static int[] twoRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val))
                map.put(val, map.get(val) + 1);
            else
                map.put(val, 1);
        }
        int[] ans = new int[2];
        int i = 0;
        for (Integer val : map.keySet()) {
            if (map.get(val) == 2)
                ans[i++] = val;
        }

        return ans;
    }
}