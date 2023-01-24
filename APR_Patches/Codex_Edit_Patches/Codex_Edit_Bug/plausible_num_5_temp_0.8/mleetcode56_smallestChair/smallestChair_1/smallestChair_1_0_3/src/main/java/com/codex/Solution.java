package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int last = 0;
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < times.length; i++) {
            last = times[i][1];
            int count = 0;
            for (int j = 0; j < times.length; j++) {
                if (times[j][0] <= times[i][0] && times[j][1] >= times[i][1]) {
                    count++;
                }
                if (count == targetFriend) {
                    max = Math.max(max, times[j][1] - times[j][0]);
                    result = Math.max(max, result);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}